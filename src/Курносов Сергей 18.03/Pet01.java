package homework;

public class Pet {
    String type ;
    String name ;
    int weight ;

    public void printPet(){
        System.out.println("Домашнее животное " +
                "тип: " + type + " ;\n " +
                "Кличка: " + name + " ;\n " +
                "Вес: " + weight + "кг.\n" );
    }
}
