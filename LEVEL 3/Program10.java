import java.util.Scanner;

public class Program10 {
    public static boolean isCollinear(int x1,int y1,int x2,int y2,int x3,int y3){
        double ab=(y2-y1)/(x2-x1);
        double bc=(y3-y2)/(x3-x2);
        double ac=(y3-y1)/(x3-x1);
        if(ab==bc && bc==ac) return true;
        return false;
    }
    public static boolean isCollinearArea(int x1,int y1,int x2,int y2,int x3,int y3){
        double area = 0.5*(x1*(y2-y3) + x2*(y3-y1)+x3*(y1-y2));
        return area==0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int x3=sc.nextInt();
        int y3=sc.nextInt();
        if(isCollinear(x1, y1, x2, y2, x3, y3)) System.out.println("Yes, Collinear");
        else System.out.println("No, Not Collinear");
        if(isCollinearArea(x1, y1, x2, y2, x3, y3)) System.out.println("Yes, Collinear");
        else System.out.println("No, Not Collinear");

    }
   
}