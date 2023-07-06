package task2;

public class Product {
    private String name;
    private String unitOfMeasurement;
    double count;
    double price;
    double theAmount;

    public Product(String name, String unitOfMeasurement, double price) {
        this.name = name;
        this.unitOfMeasurement = unitOfMeasurement;
        this.price = price;
    }

    public Product() {

    }

    public double getCount() {
        return count;
    }

    public double getTheAmount(Product e) {
        return e.count * e.price;
    }

    @Override
    public String toString() {
        return "Продукт на складе{" +
                "наименование='" + name + '\'' +
                ", единица измерения='" + unitOfMeasurement + '\'' +
                ", кол-во=" + count +
                ", цена=" + price +"/"+unitOfMeasurement+
                ", сумма=" + theAmount +
                '}';
    }
}
