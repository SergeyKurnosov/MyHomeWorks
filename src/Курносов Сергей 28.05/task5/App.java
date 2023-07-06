package task5;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        Runner runner1 = new Runner();
        Runner runner2 = new Runner();
        try {
            runner1.halt();
        } catch (IOException e) {

        }catch (RuntimeException e) {
            System.out.println("runner1 :");
            System.out.println("halt");
        }
        try {
            runner2.halt();
        } catch (IOException e) {

        }catch (RuntimeException e) {
            System.out.println("runner2 :");
            System.out.println("halt");
        }
    }
}
