import java.util.Scanner;
public class ArrayException {
    public static void generateException(String[] names) {
        System.out.println("Accessing out of bound index: " + names[names.length]);
    }
    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing out-of-bound index: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of names: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        
        String[] names = new String[size];
        System.out.println("Enter " + size + " names:");
        for (int i = 0; i < size; i++) {
            names[i] = scanner.nextLine();
        }
        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
        handleException(names);
    }
}