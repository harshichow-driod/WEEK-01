
public class NumberChecker3 {

    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
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

    public static boolean isHarshad(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[] freq = new int[10];
        for (int digit : digits) {
            freq[digit]++;
        }
        int count = 0;
        for (int f : freq) {
            if (f > 0) count++;
        }
        int[][] result = new int[count][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;
                result[index][1] = freq[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 1223;
        int count = countDigits(number);
        int[] digits = getDigitsArray(number);
        int sum = sumOfDigits(digits);
        int squareSum = sumOfSquares(digits);
        boolean isHarshad = isHarshad(number, digits);
        int[][] freq = digitFrequency(digits);

        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + count);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Sum of squares: " + squareSum);
        System.out.println("Is Harshad: " + isHarshad);
        System.out.println("Digit frequencies:");
        for (int[] f : freq) {
            System.out.println(f[0] + " → " + f[1]);
        }
    }
}

