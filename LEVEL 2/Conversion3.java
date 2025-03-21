import java.util.Scanner;
public class Conversion3 {  
    public static double kmtomiles(double km){
        double miles = 0.621371;
        return km * miles;
    }
    public static double milestokm(double miles){
        double km = 1.60934;
        return miles * km;
    }
    public static double meterstofeet(double meters){
        double feet = 3.28084;
        return meters * feet;
    }
    public static double feettometers(double feet){
        double meters = 0.3048;
        return feet * meters;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter kilometers: ");
        double kmInput = input.nextDouble();
        double milesResult = kmtomiles(kmInput);
        System.out.println(kmInput + " kms = " + milesResult + " miles");

        System.out.println("Enter miles: ");
        double milesInput = input.nextDouble();
        double kmResult = milestokm(milesInput);
        System.out.println(milesInput + " miles = " + kmResult + " kms");

        System.out.println("Enter meters: ");
        double metersInput = input.nextDouble();
        double feetResult = meterstofeet(metersInput);
        System.out.println(metersInput + " meters = " + feetResult + " feet");

        System.out.println("Enter feet: ");
        double feetInput = input.nextDouble();
        double metersResult = feettometers(feetInput);
        System.out.println(feetInput + " feet = " + metersResult + " meters");
    }
}

