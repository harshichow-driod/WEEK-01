import java.util.Scanner;
	public class yards{
		public static void main(String[]args){
		Scanner input=new Scanner(System.in);
int distanceInFeet= input.nextInt();
double distanceInYard=distanceInFeet/3;
double distanceInmile=distanceInYard/1760;
System.out.println(" Distance in Feet is " + distanceInFeet + "  while Yard is " + distanceInYard + "  and In mile is " + distanceInmile);
}
}