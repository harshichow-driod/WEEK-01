import java.util.Scanner;
public class Num5 {

    static boolean isPositive(int num) {
        return num >= 0;
    }

    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 == num2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt(); 
        }

        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                System.out.print("Number " + numbers[i] + " is Positive and ");
                if (isEven(numbers[i])) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else {
                System.out.println("Number " + numbers[i] + " is Negative");
            }
        }

        int result = compare(numbers[0], numbers[numbers.length - 1]);

        if (result == 1) {
            System.out.println("First number is greater than the last number.");
        } else if (result == 0) {
            System.out.println("First number is equal to the last number.");
        } else {
            System.out.println("First number is less than the last number.");
        }

    }
}


