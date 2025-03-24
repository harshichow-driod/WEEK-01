import java.util.Scanner;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

    public static String removeDuplicates(String input) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (char c : input.toCharArray()) {
            set.add(c);
        }

        StringBuilder result = new StringBuilder();
        for (char c : set) {
            result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + result);

        scanner.close();
    }
}
