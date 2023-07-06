package task2;

import java.util.Scanner;

public class App  {
    public static void main(String[] args) throws NumberLessZeroException  {
        Checked();


    }
    public static void Checked() throws NumberLessZeroException,NumberMoreHundredException{
        try {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше число : ");
        int number = scanner.nextInt();
        System.out.println("Проверка числа");
        if (number < 0){
            throw new NumberLessZeroException("Ваше число меньше нуля ");
        }else {
            if (number > 100) {
                throw new NumberMoreHundredException("Ваше число больше ста ");
            } else {
                System.out.println("Ваше число удовлетворительно - " + number);
            }
        }
        } catch (NumberLessZeroException e) {
            System.out.println(e);
        }catch (NumberMoreHundredException e) {
            System.out.println(e);
        }
    }
}
