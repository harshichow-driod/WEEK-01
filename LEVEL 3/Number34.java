import java.util.Scanner;

public class Number3 {

    public static int countDigits(int num) {
        int count = 0;
        int n = num;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }
    public static int[] storeDigits(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];
        int index = count - 1;
        while (num != 0) {
            digits[index--] = num % 10;
            num /= 10;
        }
        return digits;
    }
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }
    public static boolean isHarshad(int num, int[] digits) {
**        int sum = sumOfDigits(digits);
        return num % sum == 0;
    }

    public static int[][] digitFrequency(int num) {
        int[] count = new int[10];

        while (num != 0) {
            int digit = num % 10;
            count[digit]++;
            num /= 10;
        }

        int[][] frequencyArray = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequencyArray[i][0] = i;
            frequencyArray[i][1] = count[i];
        }

        return frequencyArray;
    }
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int[] digits = Number3.storeDigits(num);

        System.out.println("Count of Digits: " + Number3.countDigits(num));

        System.out.print("Digits Array: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();
        System.out.println("Sum of Digits: " + Number3.sumOfDigits(digits));
        System.out.println("Sum of Squares of Digits: " + Number3.sumOfSquares(digits));
        System.out.println("Is Harshad Number? " + (Number3.isHarshad(num, digits) ? "Yes" : "No"));
        int[][] frequency = Number3.digitFrequency(num);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + " appears " + frequency[i][1] + " times");
            }
        }
        scanner.close();
    }
}


