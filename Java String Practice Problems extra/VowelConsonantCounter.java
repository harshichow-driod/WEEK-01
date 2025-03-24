import java.util.Scanner;

public class VowelConsonantCounter {

    public static void countVowelsAndConsonants(String input) {
        input = input.toLowerCase();
        int vowels = 0;
        int consonants = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        countVowelsAndConsonants(input);

        scanner.close();
    }
}