package task1;

public class App {
    public static void main(String[] args) {
        Salary salary = new Salary();
        // ставка - 100грн/день ; почасовая - 12,5грн/час ; сдельная - сумма оплат всех работ , выполненных за месяц
        //---------------------------Фамилия---------Вид оплаты------соответствующее значение
        Salary salary1 = new Salary("Иванов", "ставка", 30);
        Salary salary2 = new Salary("Сидоров", "почасовая", 225);
        Salary salary3 = new Salary("Петров", "сдельная", 2000, 600, 50);
        Salary salary4 = new Salary("Игнатенко", "сдельная", 1000, 200, 30, 1, 8);
        salary.displayZero();
        salary1.display();
        salary2.display();
        salary3.display();
        salary4.display();
    }
}
