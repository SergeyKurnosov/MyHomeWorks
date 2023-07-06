package homework;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше число ");
        var n = scanner.nextInt();
        var i = 1;
        var a = 1;
        while (i <= n) {
            a = a * i;
            i++;

        }
        System.out.println("Факториал вашего числа  " + n + " = " + a);
    }
}
