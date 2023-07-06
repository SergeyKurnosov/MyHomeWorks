package task5;

public class DisplayInfo extends Salary {
    public DisplayInfo(String name, String child, String payment, String offshore, int count) {
        super(name, child, payment, offshore, count);
    }

    public DisplayInfo(String name, String child, String payment, String offshore, int count, int count2) {
        super(name, child, payment, offshore, count, count2);
    }

    public DisplayInfo(String name, String child, String payment, String offshore, int count, int count2, int count3) {
        super(name, child, payment, offshore, count, count2, count3);
    }

    public DisplayInfo(String name, String child, String payment, String offshore, int count, int count2, int count3, int count4) {
        super(name, child, payment, offshore, count, count2, count3, count4);
    }

    public DisplayInfo(String name, String child, String payment, String offshore, int count, int count2, int count3, int count4, int count5) {
        super(name, child, payment, offshore, count, count2, count3, count4, count5);
    }

    public DisplayInfo() {
    }

    void displayZero() {
        System.out.println(" ФИО     Налог,%    Сумма     К оплате " + "(грн/ тугрики)" + "Курс 1/8");
    }

    void display() {
        if (payment.equals("почасовая") || payment.equals("Почасовая")) {
            String str1 = String.format("%.2f", getResultPaymentWithPercent / 2);
            String str2 = String.format("%.2f", (getResultPaymentWithPercent / 2) / 8);
            System.out.println(name + "  -  " + percent + "%" + "  -  " + resultPayment + "грн" + "  -  " + str1 + "/" + str2);
        } else {
            System.out.println(name + "  -  " + percent + "%" + "  -  " + resultPayment + "грн" + "  -  " + getResultPaymentWithPercent);
        }
    }
}
