import java.util.Scanner;
public class ForFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 0) {
        } else {
            int factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of " + num + " is " + factorial);
        }
    }
}
