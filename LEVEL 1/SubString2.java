import java.util.Scanner;

public class SubString2 {

    public static String Substringcreate(String str, int start, int end) {
        String substring = "";
        for (int i = start; i < end; i++) {
            substring += str.charAt(i);
        }
        return substring;
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String substringUsingCharAt = Substringcreate(str, start, end);
        String substringUsingBuiltIn = str.substring(start, end);

        boolean comparisonResult = compareStrings(substringUsingCharAt, substringUsingBuiltIn);

        System.out.println("Substring using charAt: " + substringUsingCharAt);
        System.out.println("Substring using substring: " + substringUsingBuiltIn);

        if (comparisonResult) {
            System.out.println("Both substrings are the same");
        } else {
            System.out.println("Both substrings are different");
        }

        sc.close();
    }
}
