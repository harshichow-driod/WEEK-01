import java.util.Scanner;

public class Program5 {
    public static String checkCharacter(char c) {
        if (c >= 'A' && c <= 'Z') {
            c = (char) (c + 32);
        }
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "vowel";
            } else {
                return "consonant";
            }
        }
        return "not a letter";
    }

    public static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static int[] getCountOfVowel(String s) {
        int len = findLength(s);
        int vowels = 0, consonants = 0;
        for (int i = 0; i < len; i++) {
            String type = checkCharacter(s.charAt(i));
            if (type.equals("vowel")) {
                vowels++;
            } else if (type.equals("consonant")) {
                consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] count = getCountOfVowel(str);
        System.out.println("Vowels: " + count[0] + ", Consonants: " + count[1]);
    }
}
