import java.util.Scanner;

public class BooleanTest {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter input a:");
        boolean a = keyboard.nextBoolean();
        System.out.println("Please enter input b:");
        boolean b = keyboard.nextBoolean();
        System.out.println("Please enter input c:");
        boolean c = keyboard.nextBoolean();
        System.out.println("Please enter input d:");
        boolean d = keyboard.nextBoolean();
        keyboard.close();

        boolean gate1 = a && b;
        boolean gate2 = c && d;
        boolean gate3 = a && c;
        boolean gate4 = a && d;
        boolean gate5 = b && d;
        boolean gate6 = b && c;
        boolean gate7 = gate1 || gate2;
        boolean gate8 = gate3 || gate4;
        boolean gate9 = gate5 || gate6;
        boolean gate10 = gate7 || gate8;
        boolean gate11 = gate8 || gate9;
        boolean gateFinal= gate10 || gate11;

        System.out.println("The output value is: " + gateFinal);
    }
}