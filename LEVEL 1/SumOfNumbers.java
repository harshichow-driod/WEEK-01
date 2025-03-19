import java.util.Scanner;
public class SumOfNumbers{
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int ogNumber=sc.nextInt();
		int number=ogNumber;
		if(number>=0){
		int sum=0;
		while(number>0){
			sum+=number;
			number--;
		}
		int formula= ogNumber*(ogNumber+1)/2;
		System.out.println("Both are same? "+(sum==formula));
		}
		else return;	
		sc.close();
    }
}