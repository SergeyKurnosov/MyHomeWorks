package homework;

public class Task01 {
    public static void main(String[] args) {
        double n = 5; // Число n ;
        double result = 0; // Сумма ;
        double r = 1;
        double e = 1;
        for (int i = 1; i <= n; i++) {

            r = e / i;
            result = result + r;
            System.out.printf("%.2f \n", r);

        }
        System.out.printf("Сумма = %.2f", result);


    }


}


