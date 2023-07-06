package homework;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
        String number = "+79502909186";
        boolean test = number.startsWith("+7");
        for (int i = 0; i < number.length(); i++) {
            System.out.print(number.charAt(i));
        }
        System.out.println("");
        if (((number.length() - 2) == 10) && (test)) { // 2 - Первые два символа ( + и 7 ) ;
            System.out.println("Номер введен верно");
        } else {
            System.out.println("Номер введен НЕ верно");
        }

    }
}
