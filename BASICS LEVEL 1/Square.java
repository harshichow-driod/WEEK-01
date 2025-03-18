import java.util.Scanner;
public class Square {
public static void main(String[]args){
Scanner input=new Scanner(System.in);
int perimeter=input.nextInt();
int side = perimeter/4;
System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter);
}
}