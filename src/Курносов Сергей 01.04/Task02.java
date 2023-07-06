package homework;

public class Task02 {
    public static void main(String[] args) {
        var a = 1; // 1 кг;
        var b = 10; // 10 кг ;
        var x = 5.8D; // Цена за 1 кг ;
        while (a <= b) {
            System.out.println("Цена за " + a + "кг = " + String.format("%.1f",
                    x * a));
            a++;
        }
    }
}
