import java.util.Arrays;

public class SelectionSort {


    static public int[] selectionSort(int[] numeros) {
        for (int i = 0; i < numeros.length - 1; i++) {
            int minIndex = i;
            int min = numeros[minIndex];
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < min) {
                    min = numeros[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                numeros[minIndex] = numeros[i];
                numeros[i] = min;
            }
            System.out.println(Arrays.toString(numeros));
        }
        return numeros;
    }
}



