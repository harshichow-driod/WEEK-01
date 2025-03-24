import java.util.Scanner;

public class SubstringOccurrences {

    public static int countSubstringOccurrences(String str, String substring) {
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();         }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String str = scanner.nextLine();

        System.out.print("Enter the substring to search for: ");
        String substring = scanner.nextLine();

        int occurrences = countSubstringOccurrences(str, substring);
        System.out.println("The substring occurs " + occurrences + " times.");

        scanner.close();
    }
}
