
import java.util.Scanner;
public class Level2 {
    public static int findLengthWithoutLength(String input) {
        int count = 0;
        try {
            while (true) {
                input.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.next();
        int lengthWithoutLengthMethod = findLengthWithoutLength(userInput);
        int lengthWithLengthMethod = userInput.length();
        System.out.println("Length using user-defined method: " + lengthWithoutLengthMethod);
        System.out.println("Length using built-in length method: " + lengthWithLengthMethod);
        scanner.close();
    }
}


