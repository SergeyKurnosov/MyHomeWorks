package homework;

public class Task07 {
    public static void main(String[] args) {
        var month = 11;
        String winter = "Зима : ";
        String spring = "Весна : ";
        String summer = "Лето : ";
        String autumn = "Осень : ";
        if (month >= 1 & month <= 3) {
            if (month == 1) {
                System.out.println(winter + "Январь");
            } else if (month == 2) {
                System.out.println(winter + "Февраль");
            } else {
                System.out.println(spring + "Март");
            }
        } else if (month >= 4 & month <= 6) {
            if (month == 4) {
                System.out.println(spring + "Апрель");
            } else if (month == 5) {
                System.out.println(spring + "Май");
            } else {
                System.out.println(summer + "Июнь");
            }
        } else if (month >= 7 & month <= 9) {
            if (month == 7) {
                System.out.println(summer + "Июль");
            } else if (month == 8) {
                System.out.println(summer + "Август");
            } else {
                System.out.println(autumn + "Сентябрь");
            }
        } else if (month >= 10 & month <= 12) {
            if (month == 10) {
                System.out.println(autumn + "Октябрь");
            } else if (month == 11) {
                System.out.println(autumn + "Ноябрь");
            } else {
                System.out.println(winter + "Декабрь");
            }
        }
    }
}
