package task1;

public class Salary extends Employee {
    int count;
    double resultPayment;

    public Salary(String name, String payment, int count) {
        super(name, payment);
        this.count = count;
        if (payment.equals("ставка") || payment.equals("Ставка")) {
            resultPayment = (count) * 100;
        } else if (payment.equals("почасовая") || payment.equals("Почасовая")) {
            resultPayment = count * 12.5;
        } else if (payment.equals("сдельная") || payment.equals("Сдельная")) {
            resultPayment = count;
        }
    }

    public Salary(String name, String payment, int count, int count2) {
        super(name, payment);
        this.count = count;
        if (payment.equals("сдельная") || payment.equals("Сдельная")) {
            this.resultPayment = count + count2;
        }

    }

    public Salary(String name, String payment, int count, int count2, int count3) {
        super(name, payment);
        this.count = count;
        if (payment.equals("сдельная") || payment.equals("Сдельная")) {
            this.resultPayment = count + count2 + count3;
        }

    }

    public Salary(String name, String payment, int count, int count2, int count3, int count4) {
        super(name, payment);
        this.count = count;
        if (payment.equals("сдельная") || payment.equals("Сдельная")) {
            this.resultPayment = count + count2 + count3 + count4;
        }

    }

    public Salary(String name, String payment, int count, int count2, int count3, int count4, int count5) {
        super(name, payment);
        this.count = count;
        if (payment.equals("сдельная") || payment.equals("Сдельная")) {
            this.resultPayment = count + count2 + count3 + count4 + count5;
        }

    }

    public Salary() {
        super();
    }

    void displayZero() {
        System.out.println(" ФИО     Вид оплаты     Сумма");
    }

    void display() {
        System.out.println(name + "  -  " + payment + "  -  " + resultPayment + "грн");
    }
}
