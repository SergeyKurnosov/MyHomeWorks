package homework;

public class Numbers {
    int a;
    int b;
    String result = "";

    public void inferenceNumbers() { // Вывести все результаты ;
        System.out.println(result);
    }

    public void valueNumbers() { // Начальные значения ;
        result = "Начальные значения : " + "a = " + a + ";" + " b = " + b + "\n";
    }

    public void changeNumbers() { // Измененые значения ;
        a = a + b;
        b = a - b;
        a = a - b;
        String res = "Измененые значения : " + "a = " + a + ";" + " b = " + b + "\n";
        result = result + res;
    }

    public void sumNumbers() { // Сумма значений ;
        int sum = a + b;
        String sumnubers = "Сумма : = " + sum + "\n";
        result = result + sumnubers;
    }

    public void comprasionNumbers() { // Наибольшее из значений ;
        String comp = a > b ? "Наибольшее : a = " + a : "Наибольшее : b = " + b;
        result = result + comp;
    }
}
