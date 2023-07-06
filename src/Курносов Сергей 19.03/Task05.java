package homework;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер основания ");
        double footing = scanner.nextDouble();
        System.out.println("введите размер высоты ");
        double height = scanner.nextDouble();
        double s = (footing * height) / 2; // площадь треугольника = (основание * высота)/2 ;
        System.out.println("Площадь треугольника равна :" + s
        );

    }
}
