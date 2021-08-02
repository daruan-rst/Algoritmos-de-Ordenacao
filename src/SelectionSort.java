import java.util.Arrays;

public class SelectionSort {


    static public int[] selectionSort(int[] numeros){
        int minIndex = 0;
        int min = numeros[minIndex];
        int j = 0;
        while (j<numeros.length) {
            for (int i = j; i < numeros.length; i++) {
                min = (i == j ? numeros[j]: min );
                if (numeros[i]<min ){
                    min = numeros[i];
                    minIndex = i;
                }

            }
            if (numeros[j] != min) {
                numeros[minIndex] = numeros[j];
                numeros[j] = min;
            }
            System.out.println(Arrays.toString(numeros));

            j++;

        }


        return numeros;}
}



