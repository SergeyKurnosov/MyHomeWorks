package homework;

public class Task07 {
    public static void main(String[] args) {
        int q = 0; // Подсчет локальных минимумов ;
        int[] array = {7, 6, 7, 2, 99, 83, 5421};
        for (int i = 0; i < array.length; i++) {
            if (i > 0 && i < array.length - 1) {
                if (array[i] < array[i - 1] && array[i] < array[i + 1]) {
                    q++;

                }

            }
        }
        if (q == 0) {
            System.out.println("Локальных минимумов нет");
        } else {
            System.out.println(" Локальных минимумов " + q + " шт.");
        }
    }
}
