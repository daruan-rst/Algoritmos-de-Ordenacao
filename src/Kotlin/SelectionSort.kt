package Kotlin

fun selectionSort(arr: IntArray) {
    val n = arr.size

    for (i in 0 until n) {
        var minIndex = i
        for (j in i + 1 until n) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j
            }
        }

        val temp = arr[minIndex]
        arr[minIndex] = arr[i]
        arr[i] = temp
    }

}

fun main() {
    val arr = intArrayOf(12, 11, 13, 9, 5, 6, 7, 8)
    println("Unsorted array: ${arr.joinToString()}")

    selectionSort(arr)

    println("Sorted array: ${arr.joinToString()}")
}