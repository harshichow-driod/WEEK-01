import java.util.Scanner;

public class Program6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;
        for (int i = 0; i < 11; i++) {
            heights[i] = input.nextDouble();
            sum += heights[i];
        }

        double mean = sum / 11;

        System.out.println("Mean height of the players:" + mean);
      
    }
}
