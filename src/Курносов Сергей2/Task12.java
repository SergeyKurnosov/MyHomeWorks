package moduletwo;

public class Task12 {
    public static void main(String[] args) {
        double a = 28; //кол-во учеников //
        double m = 0.2; // кол-во молока на одного//
        double pc = 0.9 / 0.2; // на сколько человек хватит пачки молока //
        int c = (int) pc; // молока хватит на 4 человека //
        int pr = 100; // процент учеников чей вес < 30 кг //
        int q = 100; // 100% //
        double six = pr * (a / q);
        int six1 = (int) six;
        int ost = (int) (a - six1);
        double one = pr / q;
        int one1 = (int) one;
        int ost1 = (int) (a - one1);
        if (pr == 100) {
            System.out.println("Необходимо - " + 2 * a + " пирожков");
            System.out.println("Необходимо - " + a / c + " пачек молока");
        } else if (pr == 60) {
            System.out.println("Необходимо - " + ((six1 * 2) + ost) + " пирожков");
            System.out.println("Необходимо - " + six1 / c + " пачек молока");
        } else if (pr == 1) {
            System.out.println("Необходимо - " + ((one1 * 2) + ost1) + " пирожков");
            System.out.println("Необходимо - " + one1 / c + " пачек молока");
        }
    }
}
