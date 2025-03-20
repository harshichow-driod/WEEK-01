import java.util.Scanner;

public class Program10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int temp = number;
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        int[] arr = new int[count];
        temp = number; 
        for (int i = 0; i < count; i++) {
            arr[i] = temp % 10;
            temp /= 10;
        }
        int[] frequency = new int[10];
        for (int n : arr) {
            frequency[n]++;
        }
        for (int j = 0; j < 10; j++) {
            if (frequency[j] > 0) {
                System.out.println("Digit " + j + ": " + frequency[j]);
            }
        }
        
        sc.close();
    }
}

