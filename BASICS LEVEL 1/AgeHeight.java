import java.util.Scanner;
public class AgeHeight{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
int amarage=input.nextInt();
int akbarAge=input.nextInt();
int anthonyAge=input.nextInt();
int height1=input.nextInt();
int height2=input.nextInt();
int height3=input.nextInt();
	if(amarAge<akbarAge)&&(amarAge<anthonyAge)
		System.out.println("Amar is Youngest");
	elif(akbarAge<amarAge)&&(akbarAge<anthonyAge)
		System.out.println("Akbar is Youngest");
	else
		System.out.println("Anthony is Youngest");
	if(height1>height2)&&(height1>height3)
		System.out.println("Amar is the tallest");
	elif(height2>height3)
		System.out.println("Akbar is the tallest");
	else
		System.out.println("Anthony is the tallest");
		}
		}


