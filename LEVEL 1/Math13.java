import java.util.Scanner;
public class Math13{
    public double[] Trig(double angle) {
        double radians = Math.toRadians(angle);
        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
        double tanValue = Math.tan(radians);
        double[] results = new double[3];
        results[0] = sinValue;
        results[1] = cosValue;
        results[2] = tanValue;
        return results;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Math13 calculator = new Math13();
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();
        double[] results = calculator.Trig(angle);
        System.out.println(" angle: " + angle );
        System.out.println("Sin: " + results[0]);
        System.out.println("Cos: " + results[1]);
        System.out.println("Tan: " + results[2]);
        scanner.close();
    }
}
