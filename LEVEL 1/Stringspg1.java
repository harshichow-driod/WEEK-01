import java.util.Scanner;

public class Stringspg1 {

    public static boolean stringcomp(String str1, String str2) {
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
        System.out.println("Enter First String: ");
        String str1 = sc.nextLine();
        System.out.println("Enter Second String: ");
        String str2 = sc.nextLine();

        boolean charAtComparison = stringcomp(str1, str2);
        boolean builtIn = str1.equals(str2);

        System.out.println("Comparison using charAt: " + charAtComparison);
        System.out.println("Comparison using built-in methods: " + builtIn);

        if (charAtComparison == builtIn) {
            System.out.println("Both the methods give the same output.");
        } else {
            System.out.println("Both the methods give different outputs.");
        }

        sc.close();
    }
}



