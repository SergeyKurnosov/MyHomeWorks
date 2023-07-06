package task2;

public class App {
    public static void main(String[] args) {
        DisplayInfo displayInfo = new DisplayInfo();
        // ставка - 100грн/день ; почасовая - 12,5грн/час ; сдельная - сумма оплат всех работ , выполненных за месяц
        //-----------------------------------------Фамилия--------Вид оплаты--------соответствующее значение
        DisplayInfo displayInfo1 = new DisplayInfo("Иванов", "ставка", 30);
        DisplayInfo displayInfo2 = new DisplayInfo("Сидоров", "почасовая", 225);
        DisplayInfo displayInfo3 = new DisplayInfo("Петров", "сдельная", 2000, 600, 50);
        DisplayInfo displayInfo4 = new DisplayInfo("Игнатенко", "сдельная", 1000, 200, 30, 1, 8);
        displayInfo.displayZero();
        displayInfo1.display();
        displayInfo2.display();
        displayInfo3.display();
        displayInfo4.display();
    }
}
