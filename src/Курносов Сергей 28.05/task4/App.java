package task4;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws InterruptedException {
        int[] values = {0, 11, 8, 9, 27, 30};
        int numberForFind = 30;
        int result = 0;
            result = binarySearch(values, numberForFind, 0, values.length - 1);
            System.out.printf("Index = %d%n", result);
    }

    private static int binarySearch(int[] array, int numberForFind, int low, int high) throws InterruptedException {
        for (int i = 0; i <array.length-1 ; i++) {
            if (array[i] > array[i+1]){
                throw new InterruptedException("Массив не отсортирован");
            }
        }
        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] < numberForFind) {
                low = mid + 1;
            } else if (array[mid] > numberForFind) {
                high = mid - 1;
            } else if (array[mid] == numberForFind) {
                index = numberForFind;
                break;
            }
        }
        return index;
    }
}
