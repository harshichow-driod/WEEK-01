import java.util.Scanner;
public class TempConversion2{
public static void main(String[]args){
Scanner input= new Scanner(System.in);
double faren=input.nextDouble();
double celsius= (faren - 32)*5/9 ;
System.out.println("The  " + faren + "   fahrenheit is  " + celsius + "  in celsius" );
}
}