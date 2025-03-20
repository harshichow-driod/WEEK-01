import java.util.Scanner;

public class Program4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int maxDigit=10;
        int arr[]= new int[maxDigit];
        int index=0;
        while(number!=0){
            if(index==maxDigit){
                maxDigit*=2;
                int temp[]=new int[maxDigit];
                System.arraycopy(arr, 0, temp, 0, maxDigit);
                arr=temp;
            }    
            arr[index++]=number%10;
            number/=10;
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int n:arr){
            if(n>first){
                second=first;
                first=n;
            }
            else if (n>second && n!= first) {
                second=n;
            }
        }
        if(second==Integer.MIN_VALUE) System.out.println("No Second Largest Element");
        else{
            System.out.println("Largest: "+first);
            System.out.println("Second Largest: "+second);
        }
    }
}
