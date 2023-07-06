package homework;

public class Task03 {
    public static void main(String[] args) {
        var n = -77;
        String result = "";
        if (n == 0) {
            result = "нулевое число";
        } else if (n > 0) {
            switch (n % 2) {
                case 0:
                    result = "положительное четное число ";
                    break;
                case 1:
                    result = "положительное нечетное число ";
                    break;
            }
        } else if (n < 0) {
            switch (n % 2) {
                case 0:
                    result = "отрицательное четное число ";
                    break;
                case -1:
                    result = "отрицательное нечетное число ";
                    break;
            }


        }
        System.out.println(result);
    }
}
