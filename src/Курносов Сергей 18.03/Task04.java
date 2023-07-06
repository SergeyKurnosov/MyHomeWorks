package homework;

public class Task04 {
    public static void main(String[] args) {
        var a = 5D; // наше значение в радианах ;
        final var PI = 3.14D; // число пи ;
        var grd = 180D; // 180 градусов ;
        boolean anar = a > 0;
        boolean avar = a < (2 * PI);
        // наш диапазон числа а (0<a<2PI) ;
        double x = a * (grd / PI); /* находим значение а в градусах по формуле
        x = a * (180/число пи) */
        if (anar & avar) {
            System.out.println("Ваше число в градусах = " + x + ".\n");
        }else {
            System.out.println("Вы ввели неправильное число заданного диапазона\n");
        }
    }
}
