package homework;

public class Task05 {
    public static void main(String[] args) {
        String q = "Шумоизоляция";
        int y = 0; // Подсчет повтрояющихся букв в строке ;
        for (int i = 0; i < q.length(); i++) {
            for (int j = 0; j < q.length(); j++) {
                if (i != j && q.charAt(i) == q.charAt(j)) {
                    if (i < j) {
                        y++;
                        System.out.println("Повторяющееся слово в строке - " + q.charAt(i));
                    }
                    break;
                }
            }
        }
        System.out.println("Количество повтрояющихся букв в строке = " + y);
    }
}