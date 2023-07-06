package homework;

public class Box {
    double width, height, depth;

    public void volume() {
        double vol = width * height * depth;
        System.out.printf("Объем вашей коробки : %.2f ",
                vol);
    }
}

