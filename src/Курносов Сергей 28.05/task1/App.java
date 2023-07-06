package task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       // for(int i = 0; i < 12; i++){
       //     System.out.println(random.nextInt(31) - 15);
       // }
        Random random = new Random();
        int[] array = new int[random.nextInt(10)+1];
        for (int i = 0; i < array.length ; i++) {
            array[i] = random.nextInt(21)-10;
        }
        System.out.println(Arrays.toString(array));
     getResult(array);
    }
    public static void getResult (int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше число :");
        int y = scanner.nextInt();
        System.out.println("Ваше число - " + y);
        for (int i = 0; i < array.length; i++) {
            System.out.println( y + "/" + array[i] + ":");
            try {
                int red = y / array[i] ;
                System.out.println(red);
            } catch (ArithmeticException e) {
                System.out.println("Арифметическая ошибка");
            } catch (NullPointerException e) {
                System.out.println("Нулевое значение");
            }  catch (IllegalArgumentException e) {
                System.out.println("Индекс не может быть меньше нуля");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Вы вышли за пределы массива");
            }
        }
    }
}
