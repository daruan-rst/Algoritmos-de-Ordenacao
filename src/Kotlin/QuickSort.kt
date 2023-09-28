package Kotlin

fun quickSort(arr: IntArray, bottom: Int, top: Int) {
    if (bottom < top) {
        val pivotIndex = partition(arr, bottom, top)

        quickSort(arr, pivotIndex + 1, top)
        quickSort(arr, bottom, pivotIndex - 1)
    }


}

fun partition(arr: IntArray, bottom: Int, top: Int): Int {
    val pivot = arr[top]
    var i = bottom - 1

    for (j in bottom until top) {
        if (arr[j] <= pivot) {
            i++

            val temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
        }

        val temp = arr[i + 1]
        arr[i + 1] = arr[top]
        arr[top] = temp

    }
    return i + 1
}

fun main() {
    val arr = intArrayOf(64, 34, 25, 12, 22, 11, 90)
    println("Unsorted array: ${arr.joinToString()}")

    quickSort(arr, 0, arr.size - 1)

    println("Sorted array: ${arr.joinToString()}")
}





