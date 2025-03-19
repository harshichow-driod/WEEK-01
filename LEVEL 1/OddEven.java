import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Not a Valid number");
        } else {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) 
                    System.out.println(i + " is Even");
                else 
                    System.out.println(i + " is Odd");
            }
        }
        input.close();
    }
}
