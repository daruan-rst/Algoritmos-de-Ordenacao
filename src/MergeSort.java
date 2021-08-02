import java.util.Arrays;




public class MergeSort {





         public static int[] mergeSort(int[]numeros) {


            System.out.println(Arrays.toString(numeros));
            mergeSortAlmost(numeros, 0, numeros.length-1);
            System.out.println(Arrays.toString(numeros));


        return numeros;}
        static void merge(int[] numeros, int start, int middle, int end) {

            int[] firstHalf = new int[middle - start + 1];
            int[] secondHalf= new int[end - middle];

            System.arraycopy(numeros, start, firstHalf, 0, firstHalf.length);
            System.arraycopy(numeros, middle+1, secondHalf, 0, secondHalf.length);


            int i = 0;
            int j = 0;
            int k = start;
            while (i < firstHalf.length && j < secondHalf.length) {
                if (firstHalf[i] <= secondHalf[j]) {
                    numeros[k] = firstHalf[i];
                    i++;
                } else {
                    numeros[k] = secondHalf[j];
                    j++;
                }
                k++;
            }

            while (i < firstHalf.length) {
                numeros[k] = firstHalf[i];
                i++;
                k++;
            }


            while (j < secondHalf.length) {
                numeros[k] = secondHalf[j];
                j++;
                k++;
            }


        }
        private static void mergeSortAlmost(int[] numeros, int start, int end)
        {
            if (start < end) {
                int middle = start + (end - start) / 2;
                mergeSortAlmost(numeros, start, middle);
                mergeSortAlmost(numeros, middle + 1, end);
                merge(numeros, start, middle, end);
            }
        }



}
