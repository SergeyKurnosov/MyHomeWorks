package task3;

public class DisplayInfo extends Salary {
    public DisplayInfo(String name, String child, String payment, int count) {
        super(name, child, payment, count);
    }

    public DisplayInfo(String name, String child, String payment, int count, int count2) {
        super(name, child, payment, count, count2);
    }

    public DisplayInfo(String name, String child, String payment, int count, int count2, int count3) {
        super(name, child, payment, count, count2, count3);
    }

    public DisplayInfo(String name, String child, String payment, int count, int count2, int count3, int count4) {
        super(name, child, payment, count, count2, count3, count4);
    }

    public DisplayInfo(String name, String child, String payment, int count, int count2, int count3, int count4, int count5) {
        super(name, child, payment, count, count2, count3, count4, count5);
    }

    public DisplayInfo() {
    }

    void displayZero() {
        System.out.println(" ФИО     Налог,%    Сумма     К оплате(грн)");
    }

    void display() {
        System.out.println(name + "  -  " + percent + "%" + "  -  " + resultPayment + "грн" + "  -  " + getResultPaymentWithPercent);
    }
}
