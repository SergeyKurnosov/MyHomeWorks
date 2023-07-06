package homework;

public class Task02 {
    public static void main(String[] args) {
        int sum = 0;
        double srt;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];


        }
        srt = (double) sum / array.length;
        System.out.println("Среднее арифметическое = " + srt);
    }
}

