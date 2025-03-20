import java.util.Scanner;
public class NumProgram2{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num[]=new int[5];
        for(int i=0;i<5;i++)
        {
            num[i]=input.nextInt();
    
        }
        for (int j=0;j<5;j++)
        {
        if(num[j]>0){
            if(num[j]%2==0)
            System.out.println("Number is Even");
            else
            System.out.println("Number is Odd");
        }
        else if (num[j]<0)
            System.out.println("Negative");
        else    
            System.out.println("Zero");
    }
        if(num[0]>num[4])
        System.out.println("First element is greater than last element");
        else if(num[0]==num[4])
        System.out.println("First element and last elements are equal");
        else
        System.out.println("Last element is greater than first element");

        
    }
}