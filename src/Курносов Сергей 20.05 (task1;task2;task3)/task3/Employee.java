package task3;

public abstract class Employee {
    String name;
    String  payment;
    String child ;

    public Employee(String name,String child ,String payment  ) {
        this.name = name;
        this.payment = payment;
        this.child = child;
    }

    public Employee() {

    }
}
