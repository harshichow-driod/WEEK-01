import java.util.Scanner;

public class ReverseString {

    public static String reverse(String input) {
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversedString = reverse(input);
        System.out.println("Reversed String: " + reversedString);

        scanner.close();
    }
}
