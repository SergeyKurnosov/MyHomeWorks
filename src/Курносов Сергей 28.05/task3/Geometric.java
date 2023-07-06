package task3;

public class Geometric {
    private double number1;
    private double number2;
    private double number3;
    public Geometric(double number1, double number2, double number3) throws NullPointerException , IllegalArgumentException{
        try {
            this.number1 = number1;
            this.number2 = number2;
            this.number3 = number3;
                if (number1<0 || number2<0 || number3<0){
                    throw new IllegalArgumentException();
                }
                if (number1==0 || number2==0 || number3==0){
                    throw new NullPointerException();
                }
        }catch (NullPointerException e){
            System.out.println(e + " Нулевое значение");
            throw new NullPointerException(" Построение треугольника невозможно");
        }catch (IllegalArgumentException e){
            System.out.println(e + " Отрицательное значение");
            throw new IllegalArgumentException(" Построение треугольника невозможно");
        }
    }
    @Override
    public String toString() {
        return "Geometric{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                ", number3=" + number3 +
                '}';
    }
}
