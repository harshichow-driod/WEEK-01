import java.util.Scanner;
public class Quotient10 {
public static int[] findQuotient(int number, int divisor) {
 int quotient = number / divisor;
int remainder = number % divisor;
        return new int[]{remainder, quotient};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int number = scanner.nextInt();
        System.out.println("Enter the divisor: ");
        int divisor = scanner.nextInt();

        int[] result = findQuotient(number, divisor);

        System.out.println("Quotient: " + result[1]);
        System.out.println("Remainder: " + result[0]);
    }
}
