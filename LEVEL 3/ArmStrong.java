import java.util.Scanner;
public class ArmStrong {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int sum = 0;
        int number = input.nextInt();
        int originalNumber = number;
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += digit * digit * digit;
            originalNumber = originalNumber / 10;
        }
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is NOT an Armstrong Number");
        }
    }
}
