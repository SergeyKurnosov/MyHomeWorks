package homework;

public class Task05 {
    public static void main(String[] args) {
        int chislo = 49; // наше двузначное число ;
        chislo = (chislo % 10) * 10 + (chislo / 10);
        /*
        переставили цифры числа благодаря формуле
        ((x % 10 ) * 10 ) + (x/10)
         */
        System.out.println(chislo);
    }
}
