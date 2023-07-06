package task1;

import java.util.Scanner;

public abstract class AbstractPattern implements Pattern {
    String name;
    int containerForCoffee;
    int containerForWater;
    int containerForWastes;
    int containerForWastesUp;

    public AbstractPattern(String name, int containerForCoffee, int containerForWater, int containerForWastes, int containerForWastesUp) {
        this.name = name;
        this.containerForCoffee = containerForCoffee;
        this.containerForWater = containerForWater;
        this.containerForWastes = containerForWastes;
        this.containerForWastesUp = containerForWastesUp;
    }


    @Override
    public void isWorked() {
        System.out.println("Кофемашина работает");
    }

    @Override
    public void isUnWorked() {
        System.out.println("Кофемашина не работает");
    }

    public void errorCoffee() {
        System.out.println("Отсутствие достаточного количества молотое кофе !");
    }

    public void errorWater() {
        System.out.println("Отсутствие достаточного количества воды !");
    }

    public void errorWastes() {
        System.out.println("Переполнен бак с отработанным кофе !");
    }

    public void cleaner() {
        containerForWastes = 0;
        System.out.println("Бак с отработанным кофе очищен !");
    }

    public void Choice() {
        System.out.println("(1)Вкл");
        System.out.println("(2)Выкл");
        System.out.println("(3)Эспрессо");
        System.out.println("(4)Американо");
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
                    isUnWorked();
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
