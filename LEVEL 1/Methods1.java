import java.util.Scanner;
public class Methods1{
public double si( int principle,int time,int rate){
    double si=principle*time*rate/100;
    return si;
}
public static void main(String[]args){

Scanner input = new Scanner(System.in);
System.out.println("Enter Principle Amount");
int principle=input.nextInt();
System.out.println("Enter Time Period");
int time=input.nextInt();
System.out.println("Enter rate of Interest");
int rate=input.nextInt();
Methods1 obj=new Methods1();
System.out.println(" The Simple Interest is " +obj.si(principle,time,rate) + " for Principal " + principle + " , Rate of Interest  " + rate + "and Time  " + time );

}

    }
    