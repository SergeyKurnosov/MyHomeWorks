package homework;

public class Task04 {
    public static void main(String[] args) {
        var a = 281234567; // Наше число ;
        var f = 1; // Наше число для шагов в цикле ;
        while (f < a) {
            System.out.println(a % 10);
            a = a / 10;
            f++;
        }
        System.out.println(a);
    }
}
