package Java;

public class QuickSort {
    static public int[] quickSort(int[] numeros) {
        quickSort(numeros, 0, numeros.length - 1);
        return numeros;
    }

    static private void quickSort(int[] numeros, int min, int max) {
        if (min >= max) {
            return;
        }
        int pivotIndex = min + (max - min) / 2;
        int pivot = numeros[pivotIndex];
        int i = min, j = max;
        while (i <= j) {
            while (numeros[i] < pivot) {
                i++;
            }
            while (numeros[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = temp;
                i++;
                j--;
            }
        }
        if (min < j) {
            quickSort(numeros, min, j);
        }
        if (max > i) {
            quickSort(numeros, i, max);
        }
    }
}
