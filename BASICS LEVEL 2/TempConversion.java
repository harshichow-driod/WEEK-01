import java.util.Scanner;
public class TempConversion{
public static void main(String[]args){
Scanner input= new Scanner(System.in);
double celsius=input.nextDouble();
double faren=(celsius*9/5) + 32;
System.out.println("The  " + celsius + " Celsius is " + faren + "  in fahrenheit" );
}
}