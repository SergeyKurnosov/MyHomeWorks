package homework;

import java.util.Arrays;
import java.util.Locale;

//stroke.charAt(i) = stroke.substring(i , i+1).toLowerCase();
public class Task04 {
    public static void main(String[] args) {

        String stroke = "Привет, Александр, с праздником, с Новым Годом.";
        System.out.println(returnStroke(stroke));

    }

    private static String returnStroke(String stroke) {
        String p = "";
        for (int i = 0; i < stroke.length(); i++) {
            if (Character.isUpperCase(stroke.charAt(i))) {
                p = p + stroke.substring(i, i + 1).toLowerCase();
            } else if (Character.isLowerCase(stroke.charAt(i))) {
                p = p + stroke.substring(i, i + 1).toUpperCase();
            } else {
                p = p + stroke.substring(i, i + 1);
            }
        }

        stroke = p;
        return stroke;
    }

}

