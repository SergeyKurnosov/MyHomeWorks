package task3;

public class CoffeeMachine4 extends AbstractPattern {

    public CoffeeMachine4(String name, int containerForCoffee, int containerForWater, int containerForMilk, int containerForWastes, int containerForWastesUp) {
        super(name, containerForCoffee, containerForWater, containerForMilk, containerForWastes, containerForWastesUp);

    }

    public void List4() {
        System.out.printf("Название - %s ;" + "Емкость кофе - %s ;" + "Емкость для воды - %s ;" + "Емкость для молока - %s ;" + "Количество оработанного кофе - %s ;" + "Емкость для оработанного кофе - %s ;",
                name,
                containerForCoffee,
                containerForWater,
                containerForMilk,
                containerForWastes,
                containerForWastesUp);
        System.out.println(" ");
        System.out.println("------------------------------");
    }

    @Override
    public void Choice() {
        //  super.Choice();
        System.out.println("(1)Вкл");
        System.out.println("(2)Выкл");
        System.out.println("(3)Эспрессо");
        System.out.println("(4)Американо");
        System.out.println("(5)Лате");
        System.out.println("(6)Капучино");
        System.out.println("(7)Очистка бака отработанного кофе");
        System.out.println("(8)Переключиться на другую кофемашину");
    }


}
