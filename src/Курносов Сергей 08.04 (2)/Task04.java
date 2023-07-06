package homework;

public class Task04 {
    public static void main(String[] args) {
        int n = 5;
        int a = 2; // Изменяемая 2 ;
        int crs = 1; //Степень ;
        int e = 2; // Не изменяемая 2 ;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println(" 2 в степени " + crs + " = " + a);
            crs++;
            a = a * e;
        }
    }
}

