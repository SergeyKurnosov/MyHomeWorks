package homework;

public class Task03 {
    public static void main(String[] args) {
        var a = 2; // Число A ;
        var b = 15; // Число B ;
        var n = 0; // Наше кол-во чисел пока = 0 ;
        while (a <= b) {
            System.out.println(a);
            a++;
            n++;
            // Двойной цикл - один выводит все числа от A до B , другой подсчитывает кол-во цифр ;
        }
        System.out.println("Количество чисел в данном диапазоне = " + n);
    }
}
