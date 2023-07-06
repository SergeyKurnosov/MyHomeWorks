package moduletwo;

public class Task05 {
    public static void main(String[] args) {

        final int r = 15; // радиус //
        final float pi = 3.14F;
        float s = pi * (r * r); // площадь //
        float c = 2 * (r * pi); // длина окружности //
        double c1 = (double) c;
        System.out.println(s);
        System.out.println(c1);
    }
}
