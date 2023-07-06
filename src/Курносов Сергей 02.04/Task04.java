package homework;

public class Task04 {
    public static void main(String[] args) {
        double n = 5; // Число которое надо проверить ;
        int r = 2; // Делить начинаем с 2 до n ;
        double o; // Результат деления на r ;
        int h = 0; // Подсчет результатов деления на r с плавающей точкой ;
        for (int i = 1; i < n; i++) {
            o = n / r;
            if (o - (int) o > 0) {
                h++;
            }
            System.out.println(o);

            r++;

        }
        if (h == (n - 2)) {
            System.out.println("Ваше число простое");
        } else {
            System.out.println("Ваше число НЕ простое");
        }

    }
}
