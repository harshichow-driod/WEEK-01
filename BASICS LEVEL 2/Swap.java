import java.util.Scanner;
public class Swap{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
int num1 = input.nextInt();
int num2 = input.nextInt ();
int temp = num1;
num1 =num2;
num2 = temp;
System.out.println(" The swapped numbers are " + num1 + " and " + num2 );
}
}