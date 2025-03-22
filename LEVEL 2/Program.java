import java.util.Scanner;
public class Program {
    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Converted Number: " + number);
    }
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String userInput = scanner.nextLine();
        try {
            generateException(userInput);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
        handleException(userInput);
    }
}
