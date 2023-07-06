package homework;

public class Task02 {
    public static void main(String[] args) {
        var a = 4;
        var b = 45;
        var c = -2;
        var d = 8;
        if (a > 0 & b > 0) {
            if (c > 0 & d > 0) {
                System.out.println("Ввсе числа положительные");
            } else if (c > 0 | d > 0) {
                System.out.println("Три числа положительные");
            } else {
                System.out.println("Два числа положительные");
            }
        } else if (a > 0 | b > 0) {
            if (c > 0 & d > 0) {
                System.out.println("Три числа положительные");
            } else if (c > 0 | d > 0) {
                System.out.println("Два числа положительные");
            } else {
                System.out.println(" Одно число положительное ");
            }
        } else if (c > 0 & d > 0) {
            System.out.println("Два числа положительные");
        } else if (c > 0 | d > 0) {
            System.out.println("Одно число положительное");
        } else {
            System.out.println("Ни одно число НЕ положительное");
        }
    }
}
