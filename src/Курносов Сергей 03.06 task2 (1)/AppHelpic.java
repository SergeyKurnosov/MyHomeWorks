package task2;

import java.util.Scanner;

public class AppHelpic {
    public static void MainMenu() {
        System.out.println("Выберите действие");
        System.out.println("-1- Список всех складов компании");
        System.out.println("-2- Поступление/отгрузка товара");
        System.out.println("-3- Список всех товаров на складе");
        System.out.println("-4- Список всех внешних поставщиков");
        System.out.println("-5- Искать товар на складе");
    }

    public static void ChoiceWareHouse() {
        System.out.println("Выберите склад");
        System.out.println("-1- Склад №1");
        System.out.println("-2- Склад №2");
        System.out.println("-3- Склад №3");
    }

    public static int ChoiceProvider() {
        System.out.println("Выберите поставщика");
        System.out.println("-1- Поставщик №1");
        System.out.println("-2- Поставщик №2");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

    public static void ChoiceProduct() {
        System.out.println("Выберите продукт на складе");
        System.out.println("-1- Печенье");
        System.out.println("-2- Хлеб");
        System.out.println("-3- Торт");
        System.out.println("-4- Сушки");
        System.out.println("-5- Сухари");
    }

    public static void GetProduct(Object e1, Object e2, Object e3, Object e4, Object e5, int n) {
        switch (n) {
            case 1:
                System.out.println(e1);
                break;
            case 2:
                System.out.println(e2);
                break;
            case 3:
                System.out.println(e3);
                break;
            case 4:
                System.out.println(e4);
                break;
            case 5:
                System.out.println(e5);
                break;
        }
    }

    public static int Okd() {
        System.out.println("Выберите действие");
        System.out.println("-1- Склад -> Склад");
        System.out.println("-2- Склад -> Адрес");
        System.out.println("-3- Поставщик -> Склад");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

    public static String Address() {
        System.out.println("Укажите адрес доставки");
        Scanner scanner = new Scanner(System.in);
        String address = scanner.nextLine();
        return address;
    }

    public static int CWH() {
        System.out.println("Выберите склад");
        System.out.println("-1- Склад №1");
        System.out.println("-2- Склад №2");
        System.out.println("-3- Склад №3");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

    public static int CP() {
        System.out.println("Выберите продукт на складе");
        System.out.println("-1- Печенье");
        System.out.println("-2- Хлеб");
        System.out.println("-3- Торт");
        System.out.println("-4- Сушки");
        System.out.println("-5- Сухари");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

    public static double Count() {
        System.out.println("Введите кол-во");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

    public static Product ReturnProduct(int warehouse, int product, Product Product1InWarehouseOne, Product Product2InWarehouseOne, Product Product3InWarehouseOne, Product Product4InWarehouseOne, Product Product5InWarehouseOne, Product Product1InWarehouseTwo, Product Product2InWarehouseTwo, Product Product3InWarehouseTwo, Product Product4InWarehouseTwo, Product Product5InWarehouseTwo, Product Product1InWarehouseThree, Product Product2InWarehouseThree, Product Product3InWarehouseThree, Product Product4InWarehouseThree, Product Product5InWarehouseThree) {
        switch (warehouse) {
            case 1:
                switch (product) {
                    case 1:
                        return Product1InWarehouseOne;
                    case 2:
                        return Product2InWarehouseOne;
                    case 3:
                        return Product3InWarehouseOne;
                    case 4:
                        return Product4InWarehouseOne;
                    case 5:
                        return Product5InWarehouseOne;
                }
                break;
            case 2:
                switch (product) {
                    case 1:
                        return Product1InWarehouseTwo;
                    case 2:
                        return Product2InWarehouseTwo;
                    case 3:
                        return Product3InWarehouseTwo;
                    case 4:
                        return Product4InWarehouseTwo;
                    case 5:
                        return Product5InWarehouseTwo;
                }
                break;
            case 3:
                switch (product) {
                    case 1:
                        return Product1InWarehouseThree;
                    case 2:
                        return Product2InWarehouseThree;
                    case 3:
                        return Product3InWarehouseThree;

                    case 4:
                        return Product4InWarehouseThree;

                    case 5:
                        return Product5InWarehouseThree;
                }
                break;
        }

        return Product3InWarehouseThree;
    }
    public static String PP (int product){
        switch (product){
            case 1:
              return "Печенье" ;
            case 2:
                return "Хлеб" ;
            case 3:
                return "Торт" ;
            case 4:
                return "Сушки" ;
            case 5:
                return "Сухари" ;
        }
        return null;
    }

}
