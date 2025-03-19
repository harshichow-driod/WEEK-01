import java.util.Scanner;
public class WhileMultiples{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
int num = input.nextInt ();
int counter=num-1;
if(num>0&&num<100)
{
while(counter>1)
{
if (num%counter==0)
System.out.println(counter);
counter--;
continue;
}
 }
 }
 }