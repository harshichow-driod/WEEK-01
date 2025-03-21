import java.util.Scanner;
public class Methods3{
public static void main(String[]args){

Scanner input = new Scanner(System.in);
System.out.println("Enter No.of students");
int students=input.nextInt();
int handshakes=(students * (students - 1)) / 2;;
System.out.println("Possible no.of handshakes "+ handshakes);
}
}