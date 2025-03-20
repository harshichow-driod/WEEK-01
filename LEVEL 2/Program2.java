import java.util.Scanner;

public class Program2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] boys={"Amar","Akbar","Anthony"};
        int age[]=new int[3];
        int height[] = new int[3];
        for(int i=0;i<3;i++){
            age[i]=sc.nextInt();
            height[i]=sc.nextInt();
        }
        int minAge=0;
        int maxHeight=0;
        for (int j=1;j<3;j++){
            if(age[j]<age[minAge]) minAge=j;
            if(height[j]>height[maxHeight]) maxHeight=j;
        }
        System.out.println("Youngest: "+boys[minAge]);
        System.out.println("Tallest: "+boys[maxHeight]);
    }
}
        