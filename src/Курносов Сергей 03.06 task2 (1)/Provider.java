package task2;

public abstract class  Provider {
    private String name;
    private String address;

    public Provider(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {return address;}

    @Override
    public String toString() {
        return "Поставщик{" +
                "наименование='" + name + '\'' +
                ", юр.адрес='" + address + '\'' +
                '}';
    }
}
