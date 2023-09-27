package Kotlin

fun bubbleSort(arr: IntArray) {
    val n = arr.size
    var swapped: Boolean = false
    do {
        for (i in 0 until n-1){
            if (arr[i] > arr[i+1]){
                val temp = arr[i]
                arr[i] = arr[i+1]
                arr[i+1] = temp
                swapped = true
            }
        }

    } while (swapped)
}

fun main() {
    val arr = intArrayOf(6,12,17,10,11, 13, 5, 6, 7)
    println("Unsorted array: ${arr.joinToString()}")

    mergeSort(arr)

    println("Sorted array: ${arr.joinToString()}")
}
