
import java.util.Scanner;
public class Program8 {
    public static int[] generateAge(int n){
        int[] ages= new int[n];
        for(int i=0;i<n;i++){
            ages[i]= 10+(int)(Math.random()*90);
        }
        return ages;
    }
    public static String[][] checkVote(int[] age){
        String[][] vote= new String[age.length][2];
        for(int i=0;i<age.length;i++){
            vote[i][0]=String.valueOf(age[i]);
            if(age[i]>=18){
                vote[i][1]="True";
            }
            else vote[i][1]="False";

        }
        return vote;
    }
    public static void printTable(String[][] vote){
        System.out.println("Age\tCanVote?");
        System.out.println("__________________________");
        for(String[] entry:vote){
            System.out.println(entry[0]+"\t"+entry[1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numOfStudents=10;
        int[] ages=generateAge(numOfStudents);
        String[][] vote=checkVote(ages);
        printTable(vote);
    }
}


