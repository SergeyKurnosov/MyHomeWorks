package homework;

import java.util.Scanner;

public class Mystery05 {
    int numberOFattemps; // Показывает , сколько попыток у нас осталось ;
    String pravotvet; // Правильный ответ ;
    String pravotvettwo; // Правильный ответ , второй вариант ;
    String condition; // Загадка ;
    String stopword; // Стоп слово (выводит правильный ответ и завершает цикл загадки) ;
    String stopwordtwo; // Стоп слово , второй вариант (выводит правильный ответ и завершает цикл загадки) ;
    int step; // Количество попыток ;

    public void riDDle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Загадка : ");
        System.out.println(condition);
        for (int i = 1; i <= step; i++) {
            if (numberOFattemps == 1) {
                System.out.println("Введи ответ , у тебя ПОСЛЕДНЯЯ попытка");
            } else if (numberOFattemps >= 5) {
                System.out.println("Введи ответ , у тебя " + numberOFattemps + " попыток");
            } else {
                System.out.println("Введи ответ , у тебя " + numberOFattemps + " попытки");
            }
            String otvet = scanner.next();
            if (otvet.equals(pravotvet)) {
                System.out.println("Ты ввел правильный ответ , молодец ");
                break;
            } else if (otvet.equals(pravotvettwo)) {
                System.out.println("Ты ввел правильный ответ , молодец , только надо было с большой буквы ");
                break;
            } else if (otvet.equals(stopword)) {
                System.out.println("Правильный ответ - " + pravotvet);
                break;
            } else if (otvet.equals(stopwordtwo)) {
                System.out.println("Правильный ответ - " + pravotvet);
                break;
            } else if (numberOFattemps == 1) {
                System.out.println("Ты не отгадал загадку");
            } else {
                System.out.println("Подумай еще");
            }
            numberOFattemps--;

        }
        System.out.println("Загадка завершена");
    }
}



