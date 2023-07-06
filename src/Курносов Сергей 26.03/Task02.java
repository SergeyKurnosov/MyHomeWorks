package homework;

public class Task02 {
    public static void main(String[] args) {
        var number = 21;
        if (number >= 10 && number <= 40) {
            if (number >= 10 && number < 20) {
                switch (number) {
                    case 10:
                        System.out.print("десять");
                        break;

                    //исключение ;
                }
                switch (number % 10) {
                    case 1:
                        System.out.print("одиннадцать");
                        break;
                    case 2:
                        System.out.print("двенадцать");
                        break;
                    case 3:
                        System.out.print("тринадцать");
                        break;
                    case 4:
                        System.out.print("четырнадцать");
                        break;
                    case 5:
                        System.out.print("пятнадцать");
                        break;
                    case 6:
                        System.out.print("шестнадцать");
                        break;
                    case 7:
                        System.out.print("семнадцать");
                        break;
                    case 8:
                        System.out.print("восемнадцать");
                        break;
                    case 9:
                        System.out.print("девятнадцать");
                        break;
                }
                switch (number / 10) {
                    case 1:
                        System.out.println(" заданий");
                        break;
                }
            } else if (number >= 20 && number <= 40) {

                switch (number / 10) {
                    case 2:
                        System.out.print("двадцать ");
                        break;
                    case 3:
                        System.out.print("тридцать ");
                        break;
                    case 4:
                        System.out.print("сорок ");
                        break;

                }
                switch (number % 10) {
                    case 1:
                        System.out.print("одно");
                        break;
                    case 2:
                        System.out.print("два");
                        break;
                    case 3:
                        System.out.print("три");
                        break;
                    case 4:
                        System.out.print("четыре");
                        break;
                    case 5:
                        System.out.print("пять");
                        break;
                    case 6:
                        System.out.print("шесть");
                        break;
                    case 7:
                        System.out.print("семь");
                        break;
                    case 8:
                        System.out.print("восемь");
                        break;
                    case 9:
                        System.out.print("девять");
                        break;
                }
                switch (number % 10) {
                    case 0:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        System.out.print(" заданий");
                        break;
                    case 1:
                        System.out.print(" задание");
                        break;
                    case 4:
                    case 3:
                    case 2:
                        System.out.print(" задания");
                }
            }

        } else {
            System.out.println("Число больше 40 , или меньше 10.");
        }

    }
}
