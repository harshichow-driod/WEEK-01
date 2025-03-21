import java.util.Scanner;
public class Methods2{
public int handcal( int students){
    int handshakes=(students * (students - 1)) / 2;
    return handshakes;
}
public static void main(String[]args){
Scanner input = new Scanner(System.in);
System.out.println("Enter No.of students");
int students=input.nextInt();
Methods2 obj=new Methods2();
int max=obj.handcal(students);
System.out.println("Possible no.of handshakes "+ max);
}
}

