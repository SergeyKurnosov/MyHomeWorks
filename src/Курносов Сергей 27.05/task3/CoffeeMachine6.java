package task3;

import java.util.Scanner;

public class CoffeeMachine6 extends AbstractPattern {

    public CoffeeMachine6(String name,int containerForCoffeeCorn, int containerForCoffee, int containerForWater, int containerForMilk, int containerForWastes, int containerForWastesUp) {
        super(name,containerForCoffeeCorn, containerForCoffee, containerForWater, containerForMilk, containerForWastes, containerForWastesUp);

    }

    public void List6() {
        System.out.printf("Название - %s ;" + "Емкость для зернового кофе - %s ;" + "Емкость для воды - %s ;" + "Емкость для молока - %s ;" + "Количество оработанного кофе - %s ;" + "Емкость для оработанного кофе - %s ;",
                name,
                containerForCoffeeCorn,
                containerForWater,
                containerForMilk,
                containerForWastes,
                containerForWastesUp);
        System.out.println(" ");
        System.out.println("------------------------------");
    }

    @Override
    public void Choice() {
        System.out.println("(1)Вкл");
        System.out.println("(2)Выкл");
        System.out.println("(3)Американо");
        System.out.println("(4)Лате");
        System.out.println("(5)Очистка бака отработанного кофе");
        System.out.println("(6)Переключиться на другую кофемашину");
    }

    @Override
    public void workForMachine() {
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        System.out.println("Кофемашина выключена");
        while (check) {
            if (i == 1) {
                isWorked();
            } else {
                isUnWorked();
            }
            Choice();
            switch (scanner.nextInt()) {
                case 1://Включить машину
                    System.out.println("Кофемашина включена");
                    i = 1;
                    break;
                case 2://Выключить машину
                    System.out.println("Кофемашина выключена");
                    i = 0;
                    continue;
                case 3://Американо
                    if (i == 1) {
                        if (containerForWastes >= containerForWastesUp) {
                            errorWastes();
                            System.out.println("Кофе не готово");
                            break;
                        } else {
                            containerForWastes += 10;
                        }
                        if (containerForCoffeeCorn < 22) {
                            errorCoffee();
                            System.out.println("Кофе не готово");
                            break;
                        } else {
                            containerForCoffeeCorn -= 22;
                            containerForCoffee += 22;
                            containerForCoffee -= 22;
                        }
                        if (containerForWater < 100) {
                            errorWater();
                            System.out.println("Кофе не готово");
                            break;
                        } else {
                            containerForWater -= 100;
                        }
                        System.out.println("Зерновой кофе- " + containerForCoffeeCorn + " Вода- " + containerForWater + " Мусор- " + containerForWastes);
                        System.out.println("Ваш кофе(Американо)готово , приятно взбодриться :)");
                        break;
                    }
                    break;
                case 4://Лате
                    System.out.println("Введите количество молока для вашего кофе ");
                    int countMilk = scanner.nextInt();
                    if (i == 1) {
                        if (containerForWastes >= containerForWastesUp || containerForCoffeeCorn < 22 || containerForWater < 30 || countMilk > containerForMilk) {
                            System.out.println("Кофе не готово :(");
                        }
                        if (containerForWastes <= containerForWastesUp && containerForCoffeeCorn > 22 && containerForWater > 30 && countMilk < containerForMilk){
                            containerForWastes += 10;
                            containerForCoffeeCorn -= 22;
                            containerForCoffee += 22;
                            containerForCoffee -= 22;
                            containerForWater -= 30;
                            containerForMilk -= countMilk;
                            System.out.println("Ваш кофе(Лате)готово , приятно взбодриться :)");
                        }else {
                            if (containerForWastes >= containerForWastesUp){errorWastes();}
                            if (containerForCoffeeCorn < 22) {System.out.println("Отсустствие достаточного количества зернового кофе");}
                            if (containerForWater < 30) {errorWater();}
                            if (countMilk > containerForMilk) {errorMilk();}
                        }
                        System.out.println("Зерновой кофе- " + containerForCoffeeCorn + " Вода- " + containerForWater + " Молоко- " + containerForMilk + " Мусор- " + containerForWastes);
                        break;
                    }

                case 5://Очистка бака
                    if (i == 1) {
                        if (containerForWastes == 0) {
                            System.out.println("Можете не переживать , ваш бак для отработанного кофе пуст");
                        } else {
                            cleaner();
                        }
                    }
                    break;
                case 6://Выход из ЭТОЙ кофемашины
                    check = false;
            }
        }
    }
}
