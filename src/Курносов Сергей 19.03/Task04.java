package homework;

public class Task04 {
    public static void main(String[] args) {
        final double PI = 3.14; //число пи ;
        double r1 = 8; //радиус круга 1 ;
        double r2 = 3.2; //радиус круга 2 ;
        double s1 = PI * (r1 * r1); //площадь первого круга ;
        double s2 = PI * (r2 * r2); //площадь второго круга ;
        double s3 = s1 - s2; //площадь кольца ;
        System.out.printf(
                "Площадь круга 1 = %.2f ; Площадь круга 2 = %.2f ; Площадь кольца 3 = %.2f",
                s1,
                s2,
                s3);
    }
}
