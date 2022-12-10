package exercises;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

        int[] sortList = { 2, 5, 1, 7, 3, 6, 9, 4, 8, 0 };

        System.out.println("Original unsorted list = " + Arrays.toString(sortList));
        System.out.println();

        Arrays.sort(sortList);
        System.out.println("Ascending sorted list = " + Arrays.toString(sortList));

        // finding the maximum value in the array
        for (int i = 0; i < sortList.length / 2; i++) {

            // swapping the elements
            int aux = sortList[i];
            sortList[i] = sortList[sortList.length - i - 1];
            sortList[sortList.length - i - 1] = aux;
        }

        System.out.println();
        System.out.println("Descending sorted list = " + Arrays.toString(sortList));
    }
}
