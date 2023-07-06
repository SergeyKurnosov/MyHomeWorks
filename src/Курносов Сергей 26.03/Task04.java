package homework;

public class Task04 {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        smartphone.number = 777777777; // Номер который нам надо запомнить ;
        int call = 1; // Звонок идет (1-да ; любое другое число-нет);
        int num = 777777777; // Номер по которому мы звоним;
        switch (call) {
            case 1:
                if (num == smartphone.number) {
                    System.out.println(smartphone.callTheNumber());
                } else {
                    System.out.println(smartphone.callTheNumberelse());
                }
                break;
            default:
                System.out.println(smartphone.callCompleted());

        }
    }
}
