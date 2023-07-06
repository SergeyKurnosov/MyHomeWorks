package homework;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        double a = 350; // Наша сумма ;
        var b = 9; // Кол-во месяцев ;
        var d = 1; // Месяц ;
        var y = 7; // Наш месячный процент ;
        double j = (a / 100) * y; // Прибавка к сумме каждый месяц ;
        while (d <= b) {
            a = a + j;
            System.out.println("Сумма вашего вклада с учетом процента - " + y + "(%) за  " + d + " месяц/ев = " + a);
            d++;

        }
    }

}
