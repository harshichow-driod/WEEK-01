import java.util.Scanner;
public class Conversion5{  
    public static double yardstofeet(double yards){
        double feet = 3;
        return yards * feet;
    }
    public static double feetstoyards(double feets){
        double yards= 0.333333;
        return feets * yards;
    }
    public static double meterstoinches(double meters){
        double inches =  39.3701;
        return meters * inches;
    }
    public static double inchestometers(double inches){
        double meters = 0.0254;
        return inches * meters;
    }
    public static double inchestocm(double inchescm){
        double cm = 2.54;
        return inchescm * cm;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter yards: ");
        double yardsInput = input.nextDouble();
        double feetResult = yardstofeet(yardsInput);
        System.out.println(yardsInput + "   yards  = " + feetResult + "  fts ");

        System.out.println("Enter feet: ");
        double feetInput = input.nextDouble();
        double yardsResult = feetstoyards(feetInput);
        System.out.println(feetInput + " fts = " + yardsResult + "  yards");

        System.out.println("Enter meters: ");
        double metersInput = input.nextDouble();
        double inchesResult = meterstoinches(metersInput);
        System.out.println(metersInput + " meters = " + feetResult + " feet");

        System.out.println("Enter inches: ");
        double inchesInput = input.nextDouble();
        double metersResult = inchestometers(feetInput);
        System.out.println(inchesInput + "  inches = " + metersResult + " meters");

        System.out.println("Enter Inches: ");
        double inchesInput2=input.nextDouble();
        double cm=inchestocm(inchesInput2);
        System.out.println(inchesInput2 + "  inches = " + cm + " cm");

    }
}