package homework;

public class Task05 {
    public static void main(String[] args) {

        int[] array = {75, 73, 26, 24, 18, 18, 99, 34, 46, 7};
        for (int i = 0; i < array.length - 1; i++) {
            if (array[0] > array[i + 1]) {
                array[0] = array[i + 1];
            }
        }
        System.out.println("Минимальный элемент =  " + array[0]);
    }
}


