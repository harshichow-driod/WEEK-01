import java.util.Scanner;
public class Triangle{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
int base = input.nextInt();
int height= input.nextInt();
double area = 0.5*base*height;
double inch=area*0.155;
System.out.println("The area of a triangle in square inches is " + inch + " and square centimeters is  " + area);
}
}
