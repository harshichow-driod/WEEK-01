import java.util.Scanner;
	public class Calculator{
		public static void main(String[]args){
Scanner input=new Scanner(System.in);
int num1=input.nextInt();
int num2=input.nextInt();
int add=num1+num2;
int sub=num1-num2;
int mul=num1*num2;
int div=num1/num2;
System.out.println("The addition, subtraction, multiplication and division value of 2 numbers  " + num1 + "  and  "+ num2 +  " is  " + add + "  , " + sub + "  , " + mul + ",  " + div );
}
}