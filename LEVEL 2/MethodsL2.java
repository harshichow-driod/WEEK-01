import java.util.Scanner;
public class MethodsL2{
    static int recursiveSum(int n) {
        if (n == 1)
            return 1;
        return n + recursiveSum(n - 1);
    }
    static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  number: ");
        int n = sc.nextInt();
        int sumRec = recursiveSum(n);
        int sumForm = formulaSum(n);
        System.out.println("Sum using recursion: " + sumRec);
        System.out.println("Sum using formula: " + sumForm);
        if (sumRec == sumForm) {
            System.out.println("Both results are same. Correct calculation.");
        } else {
            System.out.println("Results are noy Same");
        }
    }
}
