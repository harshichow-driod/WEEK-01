	import java.util.scanner;
	public class TotalIncome{
		public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int salary= input.nextInt();
		int bonus= input.nextInt();
		int total = salary + bonus;
		System.out.println(" The salary is INR  " + salary+ "  and bonus is INR" + bonus + "  Hence Total Income is INR " + total);
		}
		}
		