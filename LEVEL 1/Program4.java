import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            
            double num = input.nextDouble();
            

            if (num <= 0) {
                break;
            }

            if (index == 10) {
                break;
            }

            numbers[index] = num;
            index++;
        }

      
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        System.out.println("sum: " + total);
        input.close();
    }
}
