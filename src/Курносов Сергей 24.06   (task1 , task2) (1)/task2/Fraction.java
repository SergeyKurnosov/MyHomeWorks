package task2;

public class Fraction {
    private int num;
    private int denom;

    public Fraction(int num, int denom) {
        this.num = num;
        this.denom = denom;
    }


    public int getNum() {
        return num;
    }

    public int getDenom() {
        return denom;
    }

    @Override
    public String toString() {
        return "Дробь{" +
                "числитель=" + num +
                ", знаменатель=" + denom +
                '}';
    }
}
