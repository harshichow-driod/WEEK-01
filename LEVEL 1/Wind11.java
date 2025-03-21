import java.util.Scanner;
public class Wind11 {
    public double Chill(double temperature, double windSpeed) {
        double windChill = 35.74 + 0.6215 * temperature 
                         + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Wind11 obj = new Wind11();
        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter the wind speed: ");
        double windSpeed = scanner.nextDouble();
        double windChill = obj.Chill(temperature, windSpeed);
        System.out.println("The wind chill temperature is: " + windChill);
    }
}

