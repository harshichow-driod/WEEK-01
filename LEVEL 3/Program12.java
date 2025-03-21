import java.util.Scanner;
public class Program12 {
    public static int[][] generateMarks(int n){
        int[][] marks= new int[n][3];
        for(int i=0;i<n;i++){
            marks[i][0]=10+ (int)(Math.random()*90);
            marks[i][1]=10+ (int)(Math.random()*90);
            marks[i][2]=10+ (int)(Math.random()*90);
        }
        return marks;
    }
    public static double[][] generateResults(int[][] marks){
        int n=marks.length;
        double[][] results=new double[n][3];
        for(int i=0;i<n;i++){
            int total=marks[i][0]+marks[i][1]+marks[i][2];
            double average=total/3.0;
            double percentage=(total/300.0)*100;
            results[i][0]=total;
            results[i][1]=Math.round(average);
            results[i][2]=Math.round(percentage);
        }
        return results;
    }
    public static void printResult(int[][] marks,double[][] results){
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for(int i=0;i<marks.length;i++){
            System.out.println((i+1) + "\t" + marks[i][0] + "\t" + marks[i][1] +"\t\t"+ marks[i][2] + "\t" + results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "%");

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int students=sc.nextInt();
        int[][] marks=generateMarks(students);
        double[][] results=generateResults(marks);
        printResult(marks, results);
    }
   
}