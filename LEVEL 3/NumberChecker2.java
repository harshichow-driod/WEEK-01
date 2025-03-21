import java.util.Scanner;

public class NumberChecker2 {

    public static int countfunction(int num) {
        int count = 0;
        int n = num;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static int[] storeDigits(int num) {
        int count = countfunction(num);
        int[] digits = new int[count];
        int index = count - 1;
        while (num != 0) {
            digits[index--] = num % 10;
            num /= 10;
        }
        return digits;
    }

    public static boolean DuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean ArmstrongNumber(int num, int[] digits) {
        int power = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == num;
    }

    public static void Largest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + 
            (secondLargest == Integer.MIN_VALUE ? "Not Available" : secondLargest));
    }

    public static void Smallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        System.out.println("Smallest Digit: " + smallest);
        System.out.println("Second Smallest Digit: " + 
            (secondSmallest == Integer.MAX_VALUE ? "Not Available" : secondSmallest));
    }
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int digitCount = countfunction(num);
        System.out.println("Count of Digits: " + digitCount);

        int[] digits = storeDigits(num);
        
        System.out.print("Digits Array: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();
        System.out.println("Is Duck Number? " + (DuckNumber(digits) ? "Yes" : "No"));
        System.out.println("Is Armstrong Number? " + (ArmstrongNumber(num, digits) ? "Yes" : "No"));
        Largest(digits);
        Smallest(digits);
        scanner.close();
    }
