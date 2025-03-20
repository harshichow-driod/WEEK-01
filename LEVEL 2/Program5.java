import java.util.Scanner;

public class Program5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp=number;
        int count=0;
        while(temp!=0){
            count++;
            temp/=10;
        }
        int arr[]=new int[count];
        for(int i=count-1;i>=0;i--){
            arr[i]=number%10;
            number/=10;
        }
        for(int j=count-1;j>=0;j--){
            System.out.print(arr[j]);
        }
    }
}
