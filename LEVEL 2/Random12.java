import java.util.Arrays;
public class Random12 {
    public int[] array(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return randomNumbers;
    }
    public double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        double sum = 0;
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        double average = sum / numbers.length;
        return new double[]{average, min, max};
    }
    public static void main(String[] args) {
        Random12 obj = new Random12();
        int[] randomArray = obj.array(5);
        System.out.println("Generated 4-digit Random Numbers: " + Arrays.toString(randomArray));
        double[] results = obj.findAverageMinMax(randomArray);
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}
