import java.util.Scanner;

public class PosOrNeg {
    public static void main(String[] args) {
        System.out.println("Test Data");
        System.out.println("Enter a number: ");
        Scanner inputNum = new Scanner(System.in);
        int value;
        value = inputNum.nextInt();

        if (value < 0) {
            System.out.println(value + " is negative.");
        } else if (value > 0) {
            System.out.println(value + " is positive.");
        } else {
            System.out.println(value + " is neither negative nor positive.");
        }
    }
}
