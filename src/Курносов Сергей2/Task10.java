package moduletwo;

public class Task10 {
    public static void main(String[] args) {

        final int h = 90;
        final int w = 110;
        if (h == w) System.out.println(" У тебя идеальный вес для твоего роста");
        else if (h > w) System.out.println("Тебе нужно набрать - " + (h - w) + "кг");
        else if (h < w) System.out.println("Тебе нужно сбросить - " + (w - h) + "кг");

    }
}
