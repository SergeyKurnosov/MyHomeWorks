package homework;

public class Task04 {
    public static void main(String[] args) {
        String word = "java323group";
        int numbers = 0;
        for (int i = 0; i < word.length(); i++) {
            if ((word.charAt(i) >= '1') && (word.charAt(i) <= '9')) {
                numbers++;
                System.out.println("В строке присутствует цифра - " + word.charAt(i));
            }
        }
        System.out.println("Количество цифр в данной строке = " + numbers);
    }
}
