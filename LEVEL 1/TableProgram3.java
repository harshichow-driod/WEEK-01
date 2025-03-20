import java.util.Scanner;
public class TableProgram3{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num[]=new int[10];
        int multiple=input.nextInt();
        for(int i=0;i<10;i++)
        {
            num[i]=multiple * (i + 1);
    
        }
        for (int j=0;j<10;j++)
        {
            System.out.println(multiple + " * " + (j + 1) + " = " + num[j]);
        
    }
}
}