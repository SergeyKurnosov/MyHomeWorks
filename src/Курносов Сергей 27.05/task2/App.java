package task2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Эспрессо - 22г кофе , 30мл воды
        //Американо - 22г кофе , 100мл воды
        while (true) {
            CoffeeMachine1 coffeeMachine1 = new CoffeeMachine1("Модель-1", 100, 100, 0, 50);
            CoffeeMachine2 coffeeMachine2 = new CoffeeMachine2("Модель-2", 150, 150, 0, 100);
            CoffeeMachine3 coffeeMachine3 = new CoffeeMachine3("Модель-3", 200, 200, 0, 150);
            CoffeeMachine4 coffeeMachine4 = new CoffeeMachine4("Модель-4",200,200,200,0,150);//Новая кофемашина
            CoffeeMachine5 coffeeMachine5 = new CoffeeMachine5("Модель-5",250,250,250,0,250);//Новая кофемашина
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ваш выбор - Продолжить(1) или завершить программу(2)");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Список кофемашин:");
                    coffeeMachine1.List1();
                    coffeeMachine2.List2();
                    coffeeMachine3.List3();
                    coffeeMachine4.List4();
                    coffeeMachine5.List5();
                    System.out.println("Выберите номер кофемашины для тестирования :");
                    switch (scanner.nextInt()) {
                        case 1:
                            coffeeMachine1.workForMachine();
                            break;
                        case 2:
                            coffeeMachine2.workForMachine();
                            break;
                        case 3:
                            coffeeMachine3.workForMachine();
                            break;
                        case 4:
                            coffeeMachine4.workForMachine();
                            break;
                        case 5:
                            coffeeMachine5.workForMachine();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Программа завершена.");
                    System.exit(0);
            }
        }
    }
}

