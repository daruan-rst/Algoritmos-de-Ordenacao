import java.util.Arrays;

public class BubbleSort {
    static public int[] bubbleSort(int[] numeros){
        int greater;
        while (!isItCompleted(numeros)){
            for (int i = 1; i < numeros.length; i++) {
                if (numeros[i]<numeros[i-1]){
                    greater = numeros[i-1];
                    numeros[i-1] = numeros[i];
                    numeros[i] = greater;
                }

            }
            System.out.println(Arrays.toString(numeros));
    }
    return numeros;}


    static boolean isItCompleted(int[] numeros){
        boolean status = false;
        int j = 1;
        for (int i = 1 ; i < numeros.length ; i++) {
            if (numeros[i]>numeros[i-1]){
                j++; }
            status = (j == numeros.length);
        }
        return status;
        }

}

