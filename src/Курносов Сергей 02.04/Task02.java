package homework;

public class Task02 {
    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        int i = 1;
        int e = a;
        int sum = 0;
        for (; a <= b; ) {
            i = a * a;
            sum = sum + i;
            System.out.println(i);
            a++;
        }
        System.out.println("Сумма квадратов всех чисел от " + e + " до " + b + " = " + sum);
    }
}
