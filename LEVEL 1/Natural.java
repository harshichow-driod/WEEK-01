import java.util.Scanner;
public class Natural{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
int number = input.nextInt ();
if(number>=0)
{
	int total = number * (number+1) / 2 ;
	System.out.println(" The sum of "+ number + "  natural numbers is " + total); 
	}
else
{
System.out.println(" The number" + number + "is not a natural number" );
	}
}
}