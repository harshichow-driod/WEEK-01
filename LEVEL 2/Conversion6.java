import java.util.Scanner;
public class Conversion6{
    public static double fartocel(double farhenheit){
        return  (farhenheit - 32) * 5 / 9;
    
    }
    public static double celtofar(double celsius){
         return  (celsius * 9 / 5) + 32;
        

    }
    public static double poundstokgs(double pounds){
        return pounds*0.453592;
       
    }
    public static double gallonstolts(double gallons){
        return gallons*3.78541; 
        
    }
    public static double ltstogallons(double lts){
        return lts*0.264172;
    
    }

public static void main(String[]args){
     
    System.out.println("Enter farhenheit:" );
    Scanner input = new Scanner(System.in);
    double farhenheitinput=input.nextDouble();
    double celsiusoutput=fartocel(farhenheitinput);
    System.out.println(farhenheitinput + " F is equal to   " + celsiusoutput + "  celsius");

    System.out.println("Enter Celsius:" );
    double Celsiusinput=input.nextDouble();
    double farhenheitoutput=celtofar(Celsiusinput);
    System.out.println(" F = " + farhenheitoutput );

    System.out.println("Enter Pounds:" );
    double poundsInput=input.nextDouble();
    double kgsOutput=poundstokgs(poundsInput);
    System.out.println(poundsInput + " pounds is equal to" + kgsOutput + "kgs" );

    System.out.println("Enter Gallons:" );
    double gallonsInput=input.nextDouble();
    double ltsOutput=gallonstolts(gallonsInput);
    System.out.println(gallonsInput + " gallons is equal to" + ltsOutput + "lts" );

}
}
   




    


