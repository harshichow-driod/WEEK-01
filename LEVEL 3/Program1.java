import java.util.Scanner;

public class Program1{
   
    public static double calculateBMI(double weight, double height) {
        height = height / 100;
        return weight / (height * height);
    }
   
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal weight";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }
   
    public static String[][] processBMIData(double[][] data) {
        String[][] results = new String[data.length][4];
       
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            double bmi = calculateBMI(weight, height);
            String status = getBMIStatus(bmi);
           
            results[i][0] = String.valueOf(weight);
            results[i][1] = String.valueOf(height);
            results[i][2] = String.format("%.2f", bmi);
            results[i][3] = status;
        }
        return results;
    }
   
    public static void displayResults(String[][] results) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|  Weight (kg)  |  Height (cm)  |   BMI   |  Status             |");
        System.out.println("-----------------------------------------------------------------");
        for (String[] row : results) {
            System.out.printf("|    %-10s  |   %-10s  |  %-6s  |  %-15s  |\n", row[0], row[1], row[2], row[3]);
        }
        System.out.println("-----------------------------------------------------------------");
    }
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i+1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i+1) + ": ");
            data[i][1] = scanner.nextDouble();
        }
   
        String[][] results = processBMIData(data);
        displayResults(results);
       
        scanner.close();
    }
}