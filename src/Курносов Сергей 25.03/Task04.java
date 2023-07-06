package homework;

public class Task04 {
    public static void main(String[] args) {
        var n = 5;
        if (n == 1) {
            System.out.println("Понедельник");
        } else if (n == 2) {
            System.out.println("Вторник");
        } else if (n == 3) {
            System.out.println("Среда");
        } else if (n == 4) {
            System.out.println("Четверг");
        } else if (n == 5) {
            System.out.println("Пятница");
        } else if (n == 6) {
            System.out.println("Субота");
        } else if (n == 7) {
            System.out.println("Воскресение");
        } else {
            System.out.println("Такого дня не существует");
        }
    }
}