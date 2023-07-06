package homework;

import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
        String[] composition = {"мука", "сахар", "патока", "жир", "масло", "какао", "эмульгатор", "антиокислитель", "вода", "молоко"};
        returnMaxWord(composition);
    }

    private static void returnMaxWord(String[] composition) {
        String maxWord = composition[0];
        int chislo = composition[0].length();
        for (int i = 0; i < composition.length; i++) {
            if (composition[i].length() > chislo) {
                chislo = composition[i].length();
                maxWord = composition[i];
            }
        }
        System.out.println(" Максимальное слово в данном массиве - " + maxWord);
        System.out.println(" Количество букв в данном слове - " + chislo);

    }
}
