package homework;

public class Task06 {
    public static void main(String[] args) {
        double a = 3.15;
        double b = 2;
        double c = 13.562;
        var action = 3;
        if (action == 1) {
            double sum = a + b + c;
            System.out.println(sum);
        } else if (action == 2) {
            double sub = a - b - c;
            System.out.println(sub);
        } else if (action == 3) {
            double inc = a * b * c;
            System.out.printf("%.3f",
                    inc);
        } else if (action == 4) {
            double div = a / b / c;
            System.out.printf("%.3f",
                    div);
        }
    }
}
