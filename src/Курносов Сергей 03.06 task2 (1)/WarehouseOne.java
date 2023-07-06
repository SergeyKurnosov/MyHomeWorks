package task2;

import java.util.LinkedList;

public class WarehouseOne extends Warehouse {
    public WarehouseOne(String name, String address) {
        super(name, address);
    }
    public LinkedList getListProductInWarehouseOne(){
       Product product1 = new Product("Печенье" , "кг" , 3.2);
       product1.count = 58;
       product1.theAmount = product1.getTheAmount(product1);

       Product product2 = new Product("Хлеб" , "шт" , 2.5);
       product2.count = 32;
       product2.theAmount = product2.getTheAmount(product2);

       Product product3 = new Product("Торт" , "шт" , 5);
       product3.count = 64;
       product3.theAmount = product3.getTheAmount(product3);

       Product product4 = new Product("Сушки" , "кг" , 3.5);
       product4.count = 61;
       product4.theAmount = product4.getTheAmount(product4);

       Product product5 = new Product("Сухари" , "кг" , 1.8);
       product5.count = 123;
       product5.theAmount = product5.getTheAmount(product5);

       LinkedList<Object>ListProductInWarehouseOne = new LinkedList<>();
       ListProductInWarehouseOne.add(product1);
       ListProductInWarehouseOne.add(product2);
       ListProductInWarehouseOne.add(product3);
       ListProductInWarehouseOne.add(product4);
       ListProductInWarehouseOne.add(product5);
       return ListProductInWarehouseOne;
   }

}
