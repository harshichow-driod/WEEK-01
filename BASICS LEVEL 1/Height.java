import java.util.Scanner;
	public class Height{
	public static void main(String[]args){
	Scanner input=new Scanner(System.in); 
	int height=input.nextInt();
	double inch=height/2.54;
	int feet=(int)(inch/12);
	double inches=inch%12;
	System.out.println("Your Height in cm is " + height  + " while in feet is " +  feet + " and inches is " + inches );
	}
}