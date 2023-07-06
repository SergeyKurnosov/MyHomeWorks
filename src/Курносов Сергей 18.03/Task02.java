package homework;

public class Task02 {
    public static void main(String[] args) {
        double[] nums = {18, 37}; // даны 2 числа ;
        double sum = 0; // начальная сумма равна 0 ;
        for (double n : nums) {
            sum = sum + n; // запущен цикл , который сумирует числа (0+18+37) ;
        }
        double arif = sum / nums.length; // сумму делим на количество чисел (length) ;
        System.out.println(arif);
    }
}
