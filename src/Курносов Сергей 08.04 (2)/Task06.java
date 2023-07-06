package homework;

public class Task06 {
    public static void main(String[] args) {
        int[] array = {1, 9, 6, 4, -2, -3, 5};
        int r = array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                r = r + 1;
                break;

            }

        }
        System.out.println("Массив увеличен до " + r);
    }
}
