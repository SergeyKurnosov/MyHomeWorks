package task2;

import java.util.LinkedList;

public abstract class Warehouse {
   private String name;
   private String address;
   LinkedList<Object> ListProducts;

   public Warehouse(String name, String address) {
      this.name = name;
      this.address = address;
   }

   public String getName() {
      return name;
   }

   public String getAddress() {
      return address;
   }

   @Override
   public String toString() {
      return "Склад{" +
              "наименование='" + name + '\'' +
              ", адрес='" + address + '\'' +
              '}';
   }
}
