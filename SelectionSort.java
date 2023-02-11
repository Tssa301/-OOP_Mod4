package exercises;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] sortList){

        // finding the maximum value in the unsorted array
        for (int i = 0; i < sortList.length - 1; i++){
            int maxIndex = i;

            for (int j = i + 1; j < sortList.length; j++){
                if (sortList[j] > sortList[maxIndex]){
                    maxIndex = j;
                }
            }
            // swapping the max elements
            int maxValue = sortList[maxIndex];
            sortList[maxIndex] = sortList[i];
            sortList[i] = maxValue;
        }
    }

    public static void main(String[] args){

        int[] sortList = { 2, 5, 1, 7, 3, 6, 9, 4, 8, 0 };

        System.out.println("Original unsorted list = " + Arrays.toString(sortList));

        System.out.println();

        selectionSort(sortList);
        System.out.println("Descending sorted list = " + Arrays.toString(sortList));
    }
}
