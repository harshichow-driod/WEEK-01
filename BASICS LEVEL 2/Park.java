import java.util.Scanner;
public class Park{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double side1=sc.nextDouble();
		double side2=sc.nextDouble();
		double side3=sc.nextDouble();
		double rounds=5000.0/(side1+side2+side3);
		System.out.println("The total number of rounds the athlete will run is " + rounds +  " to complete 5 km");
		}
	}