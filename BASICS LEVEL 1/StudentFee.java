import java.util.Scanner;
	public class StudentFee{
	public static void main(String[]args){
	Scanner input=new Scanner(System.in);
	int fee=input.nextInt();
	int discountPercent=input.nextInt();
	int discountAmount=fee*discountPercent/100;
	int Finalfee=fee - discountAmount;
	System.out.println("The discount Amount is INR " + discountAmount + " and the final discounted fee is INR "  + Finalfee );
	}
}
	
	
	