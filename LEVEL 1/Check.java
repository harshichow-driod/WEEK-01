import java.util.Scanner;
public class Check {
    public static int checkNumber(int num) {
        if (num > 0) {
            return 1; 
        } else if (num < 0) {
            return -1; 
        } else {
            return 0;  
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int result = checkNumber(number);
        if (result == 1) {
            System.out.println(" positive");
        } else if (result == -1) {
            System.out.println(" negative");
        } else {
            System.out.println("  zero");
        }
    }
}
                                           