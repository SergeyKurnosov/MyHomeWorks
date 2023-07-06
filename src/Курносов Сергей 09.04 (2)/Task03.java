package homework;

public class Task03 {
    public static void main(String[] args) {
        String word = "Адаптация";
        String revers = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            revers = revers + word.charAt(i);
            System.out.print(word.charAt(i) + " ");


        }

    }
}
