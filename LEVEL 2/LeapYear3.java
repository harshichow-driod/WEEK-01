import java.nio.charset.CoderResult;
import java.util.Scanner;
public class LeapYear3{
    public static String CheckLeap(int year){
        if (year<=1582)
        return ("Not a valid year");
        else if ((year%4==0&&year%100!=0)||(year%400==0)) 
        return  ( year + " is a Leap year");
        else
        return (year + " is not a Leap year");
    }
 public static void main(String[]args){
Scanner input= new Scanner(System.in);
System.out.print("Enter Year: ");
int year = input.nextInt();
String result=CheckLeap(year);
System.out.println(result);
    }
}