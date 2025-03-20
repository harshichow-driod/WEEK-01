import java.util.Scanner;

public class FizzBuzz7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num <= 0) {
            System.out.println("Invalid input. ");
            input.close();
            return;
        }

        String[] result = new String[num + 1];

        for (int i = 0; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                result[i] = "FizzBuzz";
            } else if (i % 3 == 0 && i != 0) {
                result[i] = "Fizz";
            } else if (i % 5 == 0 && i != 0) {
                result[i] = "Buzz";
            } else {
                result[i] = String.valueOf(i);
            }
        }

        for (int i = 0; i <= num; i++) {
            System.out.println( i + " = " + result[i]);
        }

     
    }
}
