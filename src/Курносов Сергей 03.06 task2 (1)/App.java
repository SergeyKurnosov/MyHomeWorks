package task2;
import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ProviderOne providerOne = new ProviderOne("Поставщик №1", "Адрес Поставщика №1");

        ProviderTwo providerTwo = new ProviderTwo("Поставщик №2", "Адрес Поставщика №2");

        WarehouseOne warehouseOne = new WarehouseOne("Склад №1", "Адрес Склада №1");
        LinkedList<Object> ListProductInWarehouseOne = warehouseOne.getListProductInWarehouseOne();
        Product Product1InWarehouseOne = (Product) ListProductInWarehouseOne.get(0);
        Product Product2InWarehouseOne = (Product) ListProductInWarehouseOne.get(1);
        Product Product3InWarehouseOne = (Product) ListProductInWarehouseOne.get(2);
        Product Product4InWarehouseOne = (Product) ListProductInWarehouseOne.get(3);
        Product Product5InWarehouseOne = (Product) ListProductInWarehouseOne.get(4);

        WarehouseTwo warehouseTwo = new WarehouseTwo("Склад №2", "Адрес Склада №2");
        LinkedList<Object> ListProductInWarehouseTwo = warehouseTwo.getListProductInWarehouseTwo();
        Product Product1InWarehouseTwo = (Product) ListProductInWarehouseTwo.get(0);
        Product Product2InWarehouseTwo = (Product) ListProductInWarehouseTwo.get(1);
        Product Product3InWarehouseTwo = (Product) ListProductInWarehouseTwo.get(2);
        Product Product4InWarehouseTwo = (Product) ListProductInWarehouseTwo.get(3);
        Product Product5InWarehouseTwo = (Product) ListProductInWarehouseTwo.get(4);

        WarehouseThree warehouseThree = new WarehouseThree("Склад №3", "Адрес Склада №3");
        LinkedList<Object> ListProductInWarehouseThree = warehouseThree.getListProductInWarehouseThree();
        Product Product1InWarehouseThree = (Product) ListProductInWarehouseThree.get(0);
        Product Product2InWarehouseThree = (Product) ListProductInWarehouseThree.get(1);
        Product Product3InWarehouseThree = (Product) ListProductInWarehouseThree.get(2);
        Product Product4InWarehouseThree = (Product) ListProductInWarehouseThree.get(3);
        Product Product5InWarehouseThree = (Product) ListProductInWarehouseThree.get(4);

        int action;
        int warehouse1;
        int warehouse2;
        int product;
        double count;
        int provider;
        Product product1;
        Product product2;
        String address;
        boolean check = true;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("-1- Продолжить");
            System.out.println("-2- Выйти");
            switch (scanner.nextInt()) {
                case 1:
                    Scanner scanner1 = new Scanner(System.in);
                    AppHelpic.MainMenu();
                    switch (scanner1.nextInt()) {
                        case 1:
                            LinkedList<Object> ListWareHouses = new LinkedList<>();
                            ListWareHouses.add(warehouseOne);
                            ListWareHouses.add(warehouseTwo);
                            ListWareHouses.add(warehouseThree);
                            for (Object s : ListWareHouses) {
                                System.out.println(s);
                            }
                            break;
                        //--------------------------------------------------------
                        case 2:
                            action = AppHelpic.Okd();
                            switch (action) {
                                case 1:
                                    System.out.println("Откуда :");
                                    warehouse1 = AppHelpic.CWH();
                                    System.out.println("Куда :");
                                    warehouse2 = AppHelpic.CWH();
                                    check = true;
                                    while (check) {
                                        product = AppHelpic.CP();
                                        count = AppHelpic.Count();
                                        product1 = AppHelpic.ReturnProduct(warehouse1, product, Product1InWarehouseOne, Product2InWarehouseOne, Product3InWarehouseOne, Product4InWarehouseOne, Product5InWarehouseOne, Product1InWarehouseTwo, Product2InWarehouseTwo, Product3InWarehouseTwo, Product4InWarehouseTwo, Product5InWarehouseTwo, Product1InWarehouseThree, Product2InWarehouseThree, Product3InWarehouseThree, Product4InWarehouseThree, Product5InWarehouseThree);
                                        product2 = AppHelpic.ReturnProduct(warehouse2, product, Product1InWarehouseOne, Product2InWarehouseOne, Product3InWarehouseOne, Product4InWarehouseOne, Product5InWarehouseOne, Product1InWarehouseTwo, Product2InWarehouseTwo, Product3InWarehouseTwo, Product4InWarehouseTwo, Product5InWarehouseTwo, Product1InWarehouseThree, Product2InWarehouseThree, Product3InWarehouseThree, Product4InWarehouseThree, Product5InWarehouseThree);
                                        if (product1.count >= count) {
                                            product1.count -= count;
                                            product1.theAmount = product1.price * product1.count;
                                            product2.count += count;
                                            product2.theAmount = product2.price * product2.count;
                                            System.out.println("Товар - " + AppHelpic.PP(product) + " , со склада №" + warehouse1 + " доставлен на склад №" + warehouse2 + " в кол-ве - " + count);
                                        } else {
                                            System.out.println("Товар - " + AppHelpic.PP(product) + " , со склада №" + warehouse1 + " отсутствует в достаточном кол-ве");
                                        }
                                        System.out.println("Выбрать еще товар для отправки ? 1-да 2-нет");
                                        if (scanner1.nextInt() == 2) {
                                            check = false;
                                        }
                                    }
                                    break;
                                case 2:
                                    System.out.println("Откуда :");
                                    warehouse1 = AppHelpic.CWH();
                                    System.out.println("Куда :");
                                    address = AppHelpic.Address();
                                    check = true;
                                    while (check) {
                                        product = AppHelpic.CP();
                                        count = AppHelpic.Count();
                                        product1 = AppHelpic.ReturnProduct(warehouse1, product, Product1InWarehouseOne, Product2InWarehouseOne, Product3InWarehouseOne, Product4InWarehouseOne, Product5InWarehouseOne, Product1InWarehouseTwo, Product2InWarehouseTwo, Product3InWarehouseTwo, Product4InWarehouseTwo, Product5InWarehouseTwo, Product1InWarehouseThree, Product2InWarehouseThree, Product3InWarehouseThree, Product4InWarehouseThree, Product5InWarehouseThree);
                                        if (product1.count >= count) {
                                            product1.count -= count;
                                            product1.theAmount = product1.price * product1.count;
                                            System.out.println("Товар - " + AppHelpic.PP(product) + " , со склада №" + warehouse1 + " доставлен по адресу - " + address + ", в кол-ве - " + count);
                                        } else {
                                            System.out.println("Товар - " + AppHelpic.PP(product) + " , со склада №" + warehouse1 + " отсутствует в достаточном кол-ве");
                                        }
                                        System.out.println("Выбрать еще товар для доставки ? 1-да 2-нет");
                                        if (scanner1.nextInt() == 2) {
                                            check = false;
                                        }
                                    }
                                    break;
                                case 3:
                                    System.out.println("Откуда :");
                                    provider = AppHelpic.ChoiceProvider();
                                    System.out.println("Куда :");
                                    warehouse2 = AppHelpic.CWH();
                                    check = true;
                                    while (check) {
                                        product = AppHelpic.CP();
                                        count = AppHelpic.Count();
                                        product2 = AppHelpic.ReturnProduct(warehouse2, product, Product1InWarehouseOne, Product2InWarehouseOne, Product3InWarehouseOne, Product4InWarehouseOne, Product5InWarehouseOne, Product1InWarehouseTwo, Product2InWarehouseTwo, Product3InWarehouseTwo, Product4InWarehouseTwo, Product5InWarehouseTwo, Product1InWarehouseThree, Product2InWarehouseThree, Product3InWarehouseThree, Product4InWarehouseThree, Product5InWarehouseThree);
                                        product2.count += count;
                                        product2.theAmount = product2.price * product2.count;
                                        System.out.println("Товар - " + AppHelpic.PP(product) + " , от поставщика №" + provider + " доставлен на склад №" + warehouse2 + " в кол-ве - " + count);
                                        System.out.println("Выбрать еще товар для поступления ? 1-да 2-нет");
                                        if (scanner1.nextInt() == 2) {
                                            check = false;
                                        }
                                    }
                                    break;
                            }
                            break;
                        //----------------------------------
                        case 3:
                            Scanner scanner2 = new Scanner(System.in);
                            AppHelpic.ChoiceWareHouse();
                            switch (scanner2.nextInt()) {
                                case 1:
                                    for (Object s : ListProductInWarehouseOne) {
                                        System.out.println(s);
                                    }
                                    break;
                                case 2:
                                    for (Object s : ListProductInWarehouseTwo) {
                                        System.out.println(s);
                                    }
                                    break;
                                case 3:
                                    for (Object s : ListProductInWarehouseThree) {
                                        System.out.println(s);
                                    }
                                    break;
                            }
                            break;
                        case 4:
                            LinkedList<Object> ListProviders = new LinkedList<>();
                            ListProviders.add(providerOne);
                            ListProviders.add(providerTwo);
                            for (Object s : ListProviders) {
                                System.out.println(s);
                            }
                            break;
                        case 5:
                            Scanner scanner3 = new Scanner(System.in);
                            AppHelpic.ChoiceWareHouse();
                            switch (scanner3.nextInt()) {
                                case 1:
                                    AppHelpic.ChoiceProduct();
                                    int a = scanner3.nextInt();
                                    AppHelpic.GetProduct(Product1InWarehouseOne, Product2InWarehouseOne, Product3InWarehouseOne, Product4InWarehouseOne, Product5InWarehouseOne, a);
                                    break;
                                case 2:
                                    AppHelpic.ChoiceProduct();
                                    int b = scanner3.nextInt();
                                    AppHelpic.GetProduct(Product1InWarehouseTwo, Product2InWarehouseTwo, Product3InWarehouseTwo, Product4InWarehouseTwo, Product5InWarehouseTwo, b);
                                    break;
                                case 3:
                                    AppHelpic.ChoiceProduct();
                                    int c = scanner3.nextInt();
                                    AppHelpic.GetProduct(Product1InWarehouseThree, Product2InWarehouseThree, Product3InWarehouseThree, Product4InWarehouseThree, Product5InWarehouseThree, c);

                                    break;
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Вы вышли из программы");
                    System.exit(0);
                    break;
            }

        }
    }
}


