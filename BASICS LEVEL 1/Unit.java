import java.util.Scanner;
	public class Unit{
		public static void main(String[]args){
		Scanner input=new Scanner(System.in);
int unitPrice= input.nextInt();
int quantity=input.nextInt();
int total=unitPrice*quantity;
System.out.println("The total purchase price is INR   "+ total + "  if the quantity  "  + quantity + "  and unit price is INR  "+ unitPrice);
}
}
