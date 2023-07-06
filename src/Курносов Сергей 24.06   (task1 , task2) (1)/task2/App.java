package task2;

public class App {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(3, 5);
        System.out.println("Дробь 1 " + f1);
        System.out.println("Дробь 2 " + f2);
        //--------------------------------------------
        Sum sum = (Sum) (f11, f21) -> {
            int newDemom = f11.getDenom() * f21.getDenom();
            int newNum = f11.getNum() * f21.getDenom() + f11.getDenom() * f21.getNum();
            Fraction fResult = new Fraction(newNum, newDemom);
            System.out.println("Дробь1 + Дробь2");
            System.out.println(fResult.toString());
            System.out.println(" ");
            return f11.getNum();
        };
        sum.Result(f1, f2);
        //----------------------------------------------
        Min min = (Min) (f11, f21) -> {
            int newDemom = f11.getDenom() * f21.getDenom();
            int newNum = f11.getNum() * f21.getDenom() - f11.getDenom() * f21.getNum();
            Fraction fResult = new Fraction(newNum, newDemom);
            System.out.println("Дробь1 - Дробь2");
            System.out.println(fResult.toString());
            System.out.println(" ");
            return f11.getNum();
        };
        min.Result(f1, f2);
        //----------------------------------------------
        Mul mul = (Mul) (f11, f21) -> {
            int newDemom = f11.getDenom() * f21.getDenom();
            int newNum = f11.getNum() * f21.getNum();
            Fraction fResult = new Fraction(newNum, newDemom);
            System.out.println("Дробь1 * Дробь2");
            System.out.println(fResult.toString());
            System.out.println(" ");
            return f11.getNum();
        };
        mul.Result(f1, f2);
        //----------------------------------------------
        Del del = (Del) (f11, f21) -> {
            int newDemom = f11.getDenom() * f21.getNum();
            int newNum = f11.getNum() * f21.getDenom();
            Fraction fResult = new Fraction(newNum, newDemom);
            System.out.println("Дробь1 / Дробь2");
            System.out.println(fResult.toString());
            System.out.println(" ");
            return f11.getNum();
        };
        del.Result(f1, f2);
        //----------------------------------------------
    }
}
