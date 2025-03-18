import java.util.Scanner;
	public class Handshakes{
		public static void main(String[]args){
		Scanner input=new Scanner(System.in);
int n= input.nextInt();
int max= (n * (n - 1)) / 2 ;
System.out.println("The number of possible handshakes are  " + max + " and the number of students are " + n );
}
}
