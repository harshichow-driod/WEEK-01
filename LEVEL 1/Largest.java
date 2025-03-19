import java.util.Scanner;
public class Largest{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
int num1 = input.nextInt ();
int num2 = input.nextInt ();
int num3 = input.nextInt ();
System.out.println(" Is the first number the Largest?" + (num1>num2 && num1>num3));
System.out.println(" Is the Second number the Largest?" + (num2>num1 && num2>num3));
System.out.println(" Is the Third number the Largest?" + (num3>num1 && num3>num2));
}
}