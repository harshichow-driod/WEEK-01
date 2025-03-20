import java.util.Scanner;
public class Program1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=input.nextInt();
    
        }
      
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]<0) System.out.println("Invalid");
            else if(arr[j]>=18)
            System.out.println("The student with the age  " + arr[j] + "  can vote");
            else
            System.out.println("The student with the age  " + arr[j]+"  cannot vote");
        }
    }

}
