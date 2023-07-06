package homework;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Box volumeBox = new Box();
        System.out.println("Введите ширину вашей коробки ");
        volumeBox.width = scanner.nextDouble();
        System.out.println("Введите высоту вашей коробки ");
        volumeBox.height = scanner.nextDouble();
        System.out.println("Введите глубину вашей коробки ");
        volumeBox.depth = scanner.nextDouble();


        volumeBox.volume();
    }
}
