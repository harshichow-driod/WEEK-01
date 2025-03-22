import java.util.Scanner;
public class CharArray3 {
    public static char[] toCharArr(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }
    public static boolean cmpArr(char[] a1, char[] a2) {
        if (a1.length != a2.length) {
            return false;
        }
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        char[] customArr = toCharArr(str);
        char[] builtInArr = str.toCharArray();
        boolean result = cmpArr(customArr, builtInArr);
        System.out.println("Comparison is " + result);
    }
}
