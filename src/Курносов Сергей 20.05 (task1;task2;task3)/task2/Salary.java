package task2;

public class Salary extends Employee {
    int count;
    double resultPayment;
    int percent;
    double getResultPaymentWithPercent;

    public Salary(String name, String payment, int count) {
        super(name, payment);
        this.count = count;
        if (payment.equals("ставка") || payment.equals("Ставка")) {
            percent = 20;
            resultPayment = (count) * 100;
            double i = (resultPayment / 100) * percent;
            getResultPaymentWithPercent = resultPayment - i;
        } else if (payment.equals("почасовая") || payment.equals("Почасовая")) {
            percent = 20;
            resultPayment = count * 12.5;
            double i = (resultPayment / 100) * percent;
            getResultPaymentWithPercent = resultPayment - i;
        } else if (payment.equals("сдельная") || payment.equals("Сдельная")) {
            resultPayment = count;
            percent = 15;
            double i = (resultPayment / 100) * percent;
            getResultPaymentWithPercent = resultPayment - i;
        }
    }

    public Salary(String name, String payment, int count, int count2) {
        super(name, payment);
        this.count = count;
        if (payment.equals("сдельная") || payment.equals("Сдельная")) {
            this.resultPayment = count + count2;
            percent = 15;
            double i = (resultPayment / 100) * percent;
            getResultPaymentWithPercent = resultPayment - i;
        }

    }

    public Salary(String name, String payment, int count, int count2, int count3) {
        super(name, payment);
        this.count = count;
        if (payment.equals("сдельная") || payment.equals("Сдельная")) {
            this.resultPayment = count + count2 + count3;
            percent = 15;
            double i = (resultPayment / 100) * percent;
            getResultPaymentWithPercent = resultPayment - i;
        }

    }

    public Salary(String name, String payment, int count, int count2, int count3, int count4) {
        super(name, payment);
        this.count = count;
        if (payment.equals("сдельная") || payment.equals("Сдельная")) {
            this.resultPayment = count + count2 + count3 + count4;
            percent = 15;
            double i = (resultPayment / 100) * percent;
            getResultPaymentWithPercent = resultPayment - i;
        }

    }

    public Salary(String name, String payment, int count, int count2, int count3, int count4, int count5) {
        super(name, payment);
        this.count = count;
        if (payment.equals("сдельная") || payment.equals("Сдельная")) {
            this.resultPayment = count + count2 + count3 + count4 + count5;
            percent = 15;
            double i = (resultPayment / 100) * percent;
            getResultPaymentWithPercent = resultPayment - i;
        }

    }

    public Salary() {
        super();
    }


}
