package homework;

public class Task05 {
    public static void main(String[] args) {
        var a = 1;
        var b = 20;
        while (a <= b) {
            if (a == 19) {
                break;
            }
            if (a % 4 == 0) {
                System.out.println(a * 2);
            } else if (a % 2 == 1) { // Если число нечетное ;

                // ↑↑↑ Я не знаю , можно ли так делать (оставить пустое место , чтобы не выводить) ? ;
            } else { // ;
                System.out.println(a);
            }
            a++;


        }
    }
}
