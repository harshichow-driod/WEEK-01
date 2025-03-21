import java.util.Random;
public class Football1 {
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
    public static double calculateMean(int[] heights) {
        int sum = calculateSum(heights);
        return (double) sum / heights.length;
    }
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }

    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random random = new Random();

        System.out.println("Player Heights : ");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150;
            System.out.print(heights[i] + " ");
        }
        System.out.println("\n");
        int totalHeight = calculateSum(heights);
        double meanHeight = calculateMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        System.out.println("Total Height of all players: " + totalHeight + " cm");
        System.out.println("Mean (Average) Height: %.2f cm\n", meanHeight);
        System.out.println("Shortest Player's Height: " + shortest + " cm");
        System.out.println("Tallest Player's Height: " + tallest + " cm");
    }
}