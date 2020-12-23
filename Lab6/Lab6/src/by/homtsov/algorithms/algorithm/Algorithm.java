package by.homtsov.algorithms.algorithm;

public class Algorithm {

    public int[] bubbleSort(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    public int[] insertionSort(int[] array){
        int tmp;
        for (int i = 0; i < array.length; ++i) {
            tmp = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > tmp) {
                array[j] = array[j - 1];
                j = j - 1;
            }
            array[j] = tmp;
        }
        return array;
    }
}
