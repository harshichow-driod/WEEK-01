import java.util.Scanner;
public class SimpleInterest{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
int principle = input.nextInt();
int rate = input.nextInt ();
int time = input.nextInt();
int simint=principle*rate*time/100;
System.out.println("The Simple Interest is  " + simint + " for Principal "+ principle + "  Rate of Interest " + rate + "  and Time  "  + time);
}
}
