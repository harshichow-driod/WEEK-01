import java.util.Scanner;
	public class Reminder{
		public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int num1= input.nextInt();
		int num2= input.nextInt();
		int Quotient=num1/num2;
		int modul=num1%num2;
		System.out.println(" The Quotient is " +  Quotient + "  and Reminder is "  + modul + "  of two number "  + num1 + " and " + num2  );
		}
		}