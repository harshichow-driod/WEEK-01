import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 0) {
        } else {
            int factorial = 1;
            int i = 1;
            while (i <= num) {
                factorial *= i;
                i++;
            }
            System.out.println("The factorial of " + num + " is " + factorial);
        }
    }
}
