import java.util.Scanner;
public class FizzBuzz{
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
		int i =1;
		while(i<=input){
			if(i%3==0&&i%5==0)
				System.out.println("FizzBuzz");
			else if (i%3==0)
				System.out.println("Fizz");
			else if (i%5==0)
				System.out.println("Buzz");
			else
				System.out.println(i);
				i++;
	}
}
}	
		
		