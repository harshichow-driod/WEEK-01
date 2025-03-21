import java.util.Scanner;

public class Chocolates10 {

    public static int[] students(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{remainder, quotient};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Number of children: ");
        int numberOfChildren = scanner.nextInt();

        if (numberOfChildren == 0) {
            System.out.println("Number of children cannot be zero.");
        } else {
            int[] result = students(numberOfChocolates, numberOfChildren);
            System.out.println("Each child will get " + result[1] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[0]);
        }
    }
}
