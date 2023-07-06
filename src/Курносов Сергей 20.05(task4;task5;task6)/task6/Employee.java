package task6;

public abstract class Employee {
    String name;
    String payment;
    String child;
    String offshore;

    public Employee(String name, String child, String payment, String offshore) {
        this.name = name;
        this.payment = payment;
        this.child = child;
        this.offshore = offshore;
    }

    public Employee() {

    }
}
