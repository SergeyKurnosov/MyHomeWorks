package task1;

public class Help {
    public static void Check(int a) {
        double b = (double) a / 4;
        if (b - (int) b == 0) {
            System.out.println(a + " год является високосным");
        } else {
            System.out.println(a + " год не является високосным");
        }
    }

    public static void Count(int Before, int After) {
        int result = After - Before;
        System.out.println("Количество дней между " + Before + " и " + After + " числом - " + result );
    }

    public static void Count2(int Before, int After) {
        int result = (After - Before) / 7;
        System.out.println("Количество полных недель между " + Before + " и " + After + " числом - " + result );
    }

    public static int MonthCode(String month) {
        switch (month) {
            case "январь", "октябрь":
                return 1;
            case "май":
                return 2;
            case "август":
                return 3;
            case "февраль", "март", "ноябрь":
                return 4;
            case "июнь":
                return 5;
            case "декабрь", "сентябрь":
                return 6;
            case "апрель", "июль":
                return 0;
            default:
                return 999;
        }
    }

    public static int YearCode(int year) {
        int number1 = -1;
        int number2 = year % 100;
        int number3 = number2 / 4;
        switch (year / 100) {
            case 10, 14, 18:
                number1 = 2;
                break;
            case 11, 15, 19:
                number1 = 0;
                break;
            case 12, 16, 20:
                number1 = 6;
                break;
            case 13, 17, 21:
                number1 = 4;
                break;
        }
        return (number1 + number2 + number3) % 7;
    }

    public static int NumberDay(int Day, String Month, int Year) {
        int CodeMonth = MonthCode(Month);
        int CodeYear = YearCode(Year);
        System.out.println(Day + " " + Month + " " + Year + " год ↓");
        return (Day + CodeMonth + CodeYear) % 7;
    }

    public static void StringPrintDay(int a , int Year , String Month) {

        double b = (double) Year / 4;
        if ((b - (int) b == 0 && Month == "февраль") || (b - (int) b == 0  && Month == "январь") ) {
            a = a -1;
        }



        String result = null;
        switch (a) {
            case 0:
                result = "суббота";
                break;
            case 1:
                result = "воскресенье";
                break;
            case 2:
                result = "понедельник";
                break;
            case 3:
                result = "вторник";
                break;
            case 4:
                result = "среда";
                break;
            case 5:
                result = "четверг";
                break;
            case 6:
                result = "пятница";
                break;
        }
        System.out.println("Ваш день недели - " + result);
    }
}
