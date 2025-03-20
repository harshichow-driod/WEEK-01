import java.util.Scanner;
public class Program8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        int[][] marks = new int[number][3];
        double[] percentage = new double[number];
        char[] grade = new char[number];
        for(int i=0;i<number;i++){
            for(int j=0;j<3;j++){
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                while(true){
                    if(sc.hasNextInt()){
                        marks[i][j] = sc.nextInt();
                        if(marks[i][j] >= 0) break;
                    } else {
                        sc.next(); 
                    }
                    System.out.println("Enter a positive value");
                }
            }
            percentage[i]=(marks[i][0]+marks[i][1]+marks[i][2])/3.0;
            if(percentage[i]<=100 && percentage[i]>=80) grade[i]='A';
            else if(percentage[i]>=70) grade[i]='B';
            else if(percentage[i]>=60) grade[i]='C';
            else if(percentage[i]>=50) grade[i]='D';
            else if(percentage[i]>=40) grade[i]='E';
            else grade[i]='R';
        }
        for(int k=0;k<number;k++){
            System.out.println("Physics: "+marks[k][0]+", Chemistry: "+marks[k][1]+", Maths: "+marks[k][2]+", Percentage: "+String.format("%.2f",percentage[k])+", Grade: "+grade[k]);
        }
    }
}