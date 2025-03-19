import java.util.Scanner;
public class GreatestFactors{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
int number=input.nextInt();
int greatestfactor=1;
for(int i=number-1;i>=1;i--)
{
if(number%i==0){ 
	greatestfactor=i;
break;}
}
System.out.println(greatestfactor);
}
}