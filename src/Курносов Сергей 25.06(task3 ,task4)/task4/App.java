package task4;

public class App {
    public static int SumVariable(int[] array, Number n) {
        int result = 0;
        for (int i : array) {
            if (n.Variable(i)) {
                result += i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 5, 5, 5};
        int i = 5;
        int A = -3;
        int B = 2;
        //--------------------------------------
        Number number = num -> num == i;
        System.out.println(SumVariable(nums, number));
        //--------------------------------------
        Number number1 = num -> num < A || num > B;
        System.out.println(SumVariable(nums, number1));
        //--------------------------------------
        Number number2 = num -> num > 0;
        System.out.println(SumVariable(nums, number2));
        //---------------------------------------
        Number number3 = num -> num < 0;
        System.out.println(SumVariable(nums, number3));
    }
}
