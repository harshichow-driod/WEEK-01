import java.util.Scanner;
public class WhileFactors{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
int number=input.nextInt();
int i=1;
while(i<number)
{
	if(number%i ==0)
	System.out.println(i);
	i++;
}
}
}