import java.util.Scanner;
public class Harshad{
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
	   int number=input.nextInt();
	   int digit=number;
	   int sum=0;
	   while(digit!=0)
	   {
	    int lastDigit = digit % 10;
            sum += lastDigit;
            digit = digit / 10;
        }

        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number");
        } else {
            System.out.println(number + " is Not a Harshad Number");
        }
    }
}