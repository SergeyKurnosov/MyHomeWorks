package task2;

import java.util.Scanner;

public class CoffeeMachine2 extends AbstractPattern {

    public CoffeeMachine2(String name, int containerForCoffee, int containerForWater, int containerForWastes, int containerForWastesUp) {
        super(name, containerForCoffee, containerForWater, containerForWastes, containerForWastesUp);
    }

    public void List2() {
        System.out.printf("Название - %s ;" + "Емкость кофе - %s ;" + "Емкость для воды - %s ;" + "Количество оработанного кофе - %s ;" + "Емкость для оработанного кофе - %s ;",
                name,
                containerForCoffee,
                containerForWater,
                containerForWastes,
                containerForWastesUp);
        System.out.println(" ");
        System.out.println("------------------------------");
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
                case 3://Эспрессо
                    if (i == 1) {
                        if (containerForWastes >= containerForWastesUp) {
                            errorWastes();
                            System.out.println("Кофе не готово :(");

                        } else {
                            containerForWastes += 10;
                        }
                        if (containerForCoffee < 22) {
                            errorCoffee();
                            System.out.println("Кофе не готово :(");

                        } else {
                            containerForCoffee -= 22;
                        }
                        if (containerForWater < 30) {
                            errorWater();
                            System.out.println("Кофе не готово :(");
                            break;
                        } else {
                            containerForWater -= 30;
                        }
                        System.out.println("Кофе- " + containerForCoffee + " Вода- " + containerForWater + " Мусор- " + containerForWastes);
                        System.out.println("Ваш кофе(Эспрессо)готово , приятно взбодриться :)");
                        break;
                    }
                case 4://Американо
                    if (i == 1) {
                        if (containerForWastes >= containerForWastesUp) {
                            errorWastes();
                            System.out.println("Кофе не готово");
                            break;
                        } else {
                            containerForWastes += 10;
                        }
                        if (containerForCoffee < 22) {
                            errorCoffee();
                            System.out.println("Кофе не готово");
                            break;
                        } else {
                            containerForCoffee -= 22;
                        }
                        if (containerForWater < 100) {
                            errorWater();
                            System.out.println("Кофе не готово");
                            break;
                        } else {
                            containerForWater -= 100;
                        }
                        System.out.println("Кофе- " + containerForCoffee + " Вода- " + containerForWater + " Мусор- " + containerForWastes);
                        System.out.println("Ваш кофе(Американо)готово , приятно взбодриться :)");
                        break;
                    }
                    break;
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

