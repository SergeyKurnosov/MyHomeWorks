package task1;

public class CoffeeMachine2 extends AbstractPattern {

    public CoffeeMachine2(String name, int containerForCoffee, int containerForWater, int containerForWastes, int containerForWastesUp) {
        super(name, containerForCoffee, containerForWater, containerForWastes, containerForWastesUp);
    }

    public void List2() {
        System.out.printf("Название - %s ;" + "Емкость кофе - %s ;" + "Емкость для воды - %s ;" + "Количество отработанного кофе - %s ;" + "Емкость для оработанного кофе - %s ;",
                name,
                containerForCoffee,
                containerForWater,
                containerForWastes,
                containerForWastesUp);
        System.out.println(" ");
        System.out.println("------------------------------");
    }
}
