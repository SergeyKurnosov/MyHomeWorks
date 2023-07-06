package task3;

public class App {
    public static void main(String[] args) {
        System.out.println("Максимум из 4-х :");
        Max<Integer> max = (t1, t2, t3, t4) -> {
            Help help = new Help();
            System.out.println(help.ReturnMaxValue(t1, t2, t3, t4));
            return t1;
        };
        max.MaxValue(2, 4, 999, 3);
        //------------------------------
        Max<String> max2 = (t1, t2, t3, t4) -> {
            Help help1 = new Help();
            System.out.println(help1.ReturnMaxValue(t1, t2, t3, t4));
            return t1;
        };
        max2.MaxValue("a", "aa", "aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaa");
        //------------------------------
        Max<Double> max3 = (t1, t2, t3, t4) -> {
            Help help2 = new Help();
            System.out.println(help2.ReturnMaxValue(t1, t2, t3, t4));
            return t1;
        };
        max3.MaxValue(2.2, 4.3, 999.3, 3.3);
        //---------------------------------------------------------------------------------------------
        System.out.println("Минимум из 4-х :");
        Min<Integer> min = (t1, t2, t3, t4) -> {
            Help help3 = new Help();
            System.out.println(help3.ReturnMinValue(t1, t2, t3, t4));
            return t1;
        };
        min.MinValue(2, 4, 999, 3);
        //------------------------------
        Min<String> min2 = (t1, t2, t3, t4) -> {
            Help help4 = new Help();
            System.out.println(help4.ReturnMinValue(t1, t2, t3, t4));
            return t1;
        };
        min2.MinValue("a", "aa", "aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaa");
        //------------------------------
        Min<Double> min3 = (t1, t2, t3, t4) -> {
            Help help5 = new Help();
            System.out.println(help5.ReturnMinValue(t1, t2, t3, t4));
            return t1;
        };
        min3.MinValue(2.2, 4.3, 999.3, 3.3);

    }
}