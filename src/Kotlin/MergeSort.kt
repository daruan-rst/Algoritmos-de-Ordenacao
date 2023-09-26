package Kotlin

fun mergeSort(arr: IntArray) {
    if (arr.size <= 1) {
        return
    }

    val middle = arr.size / 2
    val left_arr = arr.copyOfRange(0, middle)
    val right_arr = arr.copyOfRange(middle, arr.size)


    mergeSort(left_arr)
    mergeSort(right_arr)

    merge(left_arr, right_arr, arr)

}

fun merge(left: IntArray, right: IntArray, result: IntArray) {
    var i = 0
    var j = 0
    var k = 0

    while (i < left.size && j < right.size) {
        if (left[i] <= right[j]) {
            result[k] = left[i]
            i++
        } else {
            result[k] = right[j]
            j++
        }
        k++
    }

    while (i < left.size) {
        result[k] = left[i]
        i++
        k++
    }

    while (j < right.size) {
        result[k] = right[j]
        j++
        k++
    }
}


fun main() {
    val arr = intArrayOf(12, 11, 13, 5, 6, 7)
    println("Unsorted array: ${arr.joinToString()}")

    mergeSort(arr)

    println("Sorted array: ${arr.joinToString()}")
}
