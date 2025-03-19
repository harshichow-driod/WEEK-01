import java.util.Scanner;
public class WhileGreatest{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
int number=input.nextInt();
int greatestfactor=1;
int i=number-1;
while(i>=1)
{
if(number%i==0){ 
	greatestfactor=i;
	break;}
	i--;
}
System.out.println(greatestfactor);
}
}