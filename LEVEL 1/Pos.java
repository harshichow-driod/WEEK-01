import java.util.Scanner;
public class Pos{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
int num = input.nextInt ();
if(num>0)
	System.out.println(" positive" );
else if ( num<0)
	System.out.println(" negative");
else
	System.out.println(" Zero");
}
}