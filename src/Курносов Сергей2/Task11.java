package moduletwo;

public class Task11 {
    public static void main(String[] args) {

        int n = 825380; // кол-во секунд //
        /* 24 - количество часов в сутках
           3600 - количество секунд в одном часе
        */
        int day = n / (24 * 3600); // n разделил на кол-во секунд в сутках и получил кол-во дней //
        n = n % (24 * 3600); // получил оставшееся кол-во часов в секундах //
        int hour = n / 3600; // разделил на кол-во секунд в часе и получил кол-во часов //
        n = n % 3600; // получил оставшееся кол-во минут в секундах //
        int minute = n / 60; //разделил на кол-во секунд в минуте и получил кол-во минут//
        n = n % 60; //получил оставшеесая кол-во секунд //
        int second = n;
        System.out.println("Количество дней - " + day);
        System.out.println("Количество часов - " + hour);
        System.out.println("Количество минут - " + minute);
        System.out.println("Количество секунд - " + second);
    }
}
