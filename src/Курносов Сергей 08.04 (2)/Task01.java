package homework;

public class Task01 {
    public static void main(String[] args) {
        double x = 1;
        double[] array = {1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9, 2};
        for (int i = 0; i < array.length; i++) {
            x = x * array[i];
        }
        System.out.printf("Произведение элементов массива = %.3f", x);
    }
}



