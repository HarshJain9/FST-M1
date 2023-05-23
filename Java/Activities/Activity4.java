package Activities;

import java.util.Arrays;

public class Activity4 {
    public static void main(String[] args) {
        int[] numArr = {2, 6, 3, 5, 9};
        ascendingSort(numArr);
        System.out.println("Sorted array in an ascending Order: ");
        System.out.println(Arrays.toString(numArr));
    }

    static void ascendingSort(int array[]) {

        int size = array.length, i;

        for (i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                j = j-1;
            }
            array[j + 1] = key;
        }
    }
}