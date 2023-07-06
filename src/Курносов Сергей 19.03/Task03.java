package homework;

public class Task03 {
    public static void main(String[] args) {
        int n, n1, n2, n3;
        n = 493; // заданное число ;
        n1 = n / 100; //первая цифра числа ;
        n2 = (n % 100) / 10; //вторая цифра числа;
        n3 = n % 10;//третья цифра числа;
        n = Integer.parseInt(n3 + "" + n2 + "" + n1);//меняем цифры местами;
        System.out.println(n);
    }
}
