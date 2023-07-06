package homework;

public class Task01 {
    public static void main(String[] args) {
        Pet animals = new Pet();
        animals.type = "Собака";
        animals.name = "Батыр";
        animals.weight = 20;

        animals.printPet();

        Pet animalsTwo = new Pet();
        animalsTwo.type = "Кошка";
        animalsTwo.name = "Кеша";
        animalsTwo.weight = 2;

        animalsTwo.printPet();
    }
}