import java.util.Scanner;
public class SumOfNumbersFor{
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int ogNumber=sc.nextInt();
		int number=ogNumber;
		if(ogNumber>=0){
		int sum=0;
		for(int i=number;i>0;i--){
			sum+=i;
		}
		int formula= ogNumber*(ogNumber+1)/2;
		System.out.println("Both are same? "+(sum==formula));
		}
		else return;	
		sc.close();
    }
}

