package homework;

public class Task02 {
    public static void main(String[] args) {
        var a = 4;
        var b = 8;
        var c = 9;
        a = a ^ c ^ b;
        c = a ^ c ^ b;
        b = a ^ c ^ b;
        a = a ^ c ^ b;
        System.out.println("a имеет значение b : " + a);
        System.out.println("b имеет значение c : " + b);
        System.out.println("c имеет значение а : " + c);


    }
}
