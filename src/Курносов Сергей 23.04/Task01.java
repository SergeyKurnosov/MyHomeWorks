package homework;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        int[] array = {4, 7, 12, 0, 7, 5, 56, 1, 0};
        int count = returnNumberOfNullElements(array);
        int result = numberOfElements(array, count);
        if (result <= 0) {
            System.out.println("Количество элементов не найдено");
        } else {
            System.out.println("Количество элементов между нулевыми элементами = " + result);
        }
    }

    private static int returnNumberOfNullElements(int[] array) { // Подсчитывает количество нулевых элементов
        int numberOfNullElements = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                numberOfNullElements++;
            }
        }
        return numberOfNullElements;
    }

    private static int numberOfElements(int[] array, int count) { // Подсчитывает количество элементов между нулями
        int number = 0;
        if (count >= 2) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0) {
                    for (int j = i + 1; j < array.length; j++) {
                        if (array[j] == 0) {
                            break; // Завершает подсчет при нахождении следующего нуля
                        }
                        number++;
                    }
                    break; // Полностью завершает цикл после подсчета
                }
            }
        }

        return number;
    }
}
