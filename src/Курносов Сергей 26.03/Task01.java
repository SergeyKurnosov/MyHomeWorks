package homework;

public class Task01 {
    public static void main(String[] args) {
        final double PI;
        PI = 3.14D;
        var item = 2; // Номер элемента ;
        double value = 9; // Значение этого элемента ;
        double r, d, l, s; // Элементы окружности ;
        r = 0; // Радиус ;
        d = 0; // Диаметр ;
        l = 0; // Длина ;
        s = 0; // Площадь ;
        switch (item) {
            case 1:
                r = value; // Радиус = 9 , а значит : ;
                d = 2 * r;
                l = 2 * PI * r;
                s = PI * (r * r);
                System.out.printf("Если R = " + value + " ,значит :\n" +
                                "Диаметр D : %.2f ;\n" +
                                "Длина L : %.2f ;\n" +
                                "Площадь S : %.2f .",
                        d,
                        l,
                        s);
                break;
            case 2:
                d = value; // Диаметр = 9 , а значит : ;
                r = d / 2;
                l = 2 * PI * r;
                s = PI * (r * r);
                System.out.printf("Если D = " + value + " ,значит :\n" +
                                "Радиус R :%.2f ;\n" +
                                "Длина L : %.2f ;\n" +
                                "Площадь S : %.2f .",
                        r,
                        l,
                        s);
                break;
            case 3:
                l = value; // Длина = 9 , а значит : ;
                r = l / 2 / PI;
                d = 2 * r;
                s = PI * (r * r);
                System.out.printf("Если L = " + value + " ,значит :\n" +
                                "Радиус R : %.2f ;\n" +
                                "Диаметр D : %.2f ;\n" +
                                "Площадь S : %.2f .",
                        r,
                        d,
                        s);
                break;
            case 4:
                s = value; // Площадь = 9 , а значит : ;
                r = Math.sqrt(s / PI);
                d = 2 * r;
                l = 2 * PI * r;
                System.out.printf("Если S = " + value + " ,значит :\n" +
                                "Радиус R : %.2f ;\n" +
                                "Диаметр D :  %.2f ;\n" +
                                "Длина L :  %.2f .",
                        r,
                        d,
                        l);
                break;
        }
    }
}
