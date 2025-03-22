import java.util.Scanner;
public class String5{
    public static void generateException(String str) {
        System.out.println("Generating Exception...");
        char ch = str.charAt(str.length());
        System.out.println("Character at out-of-bounds index: " + ch);
    }
    public static void handleException(String str) {
        try {
            System.out.println("Handling Exception...");
            char ch = str.charAt(str.length());
            System.out.println("Character at out-of-bounds index: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        try {
            generateException(userInput);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception Occurred: " + e.getMessage());
        }
        handleException(userInput);
        scanner.close();
    }
}
