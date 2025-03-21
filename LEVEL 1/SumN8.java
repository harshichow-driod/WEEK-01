import java.util.Scanner;
public class SumN8 {
    public int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;  
        }
        return sum;  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        SumN8 obj = new SumN8();
        int result = obj.sum(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + result);

    
    }
}
