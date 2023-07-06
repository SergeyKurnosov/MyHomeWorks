package homework;

public class Task03 {
    public static void main(String[] args) {
     double s = 76 ; // площадь круга ;
     double d , l ; // обьявляем диаметр и длину окружности ;
     final double PI = 3.14D ; // число пи ;
     d = 2 * ( Math.sqrt(s / PI)) ; // диаметр равен d=2√s/PI ;
     l = PI * d ; // длина окружности ;
     System.out.println( "Диаметр окружности = " + d + ";\n"
                            + "Длина окружности = " + l + ";\n");

    }
}
