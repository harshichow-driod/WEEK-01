import java.util.Scanner;

public class Program9 {
    public static double findDistance(double x1,double x2,double y1,double y2){
        double distance= Math.sqrt((Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
        return distance;
    }
    public static double[] findSlopeAndIntercept(double x1,double x2,double y1,double y2){
        double m=(y2-y1)/(x2-x1);
        double b=y1-m*x1;
        return new double[]{m,b};
    }
   
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double x1=sc.nextDouble();
        double y1=sc.nextDouble();
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();
        double[] slopeAndIntercept=findSlopeAndIntercept(x1, x2, y1, y2);
        System.out.println("Euclidean Distance: "+findDistance(x1, x2, y1, y2));
        System.out.println("Line Equation: y = "+slopeAndIntercept[0]+"x"+" + "+slopeAndIntercept[1]);
    }
}