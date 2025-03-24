import java.util.Scanner;

public class ToggleCase {

    public static String toggleCase(String str) {
        StringBuilder toggledString = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                toggledString.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggledString.append(Character.toUpperCase(ch));
            } else {
                toggledString.append(ch); 
            }
        }

        return toggledString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = toggleCase(input);
        System.out.println("Toggled string: " + result);

        scanner.close();
    }
}
