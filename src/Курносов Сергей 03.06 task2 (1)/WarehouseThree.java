package task2;

import java.util.LinkedList;

public class WarehouseThree extends Warehouse {
    public WarehouseThree(String name, String address) {
        super(name, address);
    }
    public LinkedList getListProductInWarehouseThree(){
       Product product1 = new Product("Печенье" , "кг" , 3.2);
       product1.count = 48;
       product1.theAmount = product1.getTheAmount(product1);

       Product product2 = new Product("Хлеб" , "шт" , 2.5);
       product2.count = 22;
       product2.theAmount = product2.getTheAmount(product2);

       Product product3 = new Product("Торт" , "шт" , 5);
       product3.count = 54;
       product3.theAmount = product3.getTheAmount(product3);

       Product product4 = new Product("Сушки" , "кг" , 3.5);
       product4.count = 51;
       product4.theAmount = product4.getTheAmount(product4);

       Product product5 = new Product("Сухари" , "кг" , 1.8);
       product5.count = 113;
       product5.theAmount = product5.getTheAmount(product5);

       LinkedList<Object>ListProductInWarehouseThree = new LinkedList<>();
       ListProductInWarehouseThree.add(product1);
       ListProductInWarehouseThree.add(product2);
       ListProductInWarehouseThree.add(product3);
       ListProductInWarehouseThree.add(product4);
       ListProductInWarehouseThree.add(product5);
       return ListProductInWarehouseThree;
   }

}
