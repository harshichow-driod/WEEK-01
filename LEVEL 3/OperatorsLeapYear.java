import java.util.Scanner;
public class OperatorsLeapYear{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
int year = input.nextInt ();
	if(year<=1582)
		System.out.println("Not Valid Year");
	else if ( year%4==0||year%400==0 && year%100!=0)
		System.out.println(year + " is a LeapYear");
	else
		System.out.println(year + " is not a LeapYear");
}
}
		