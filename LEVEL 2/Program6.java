import java.util.Scanner;

public class Program6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numOfPersons = sc.nextInt();
        double weights[] =new double[numOfPersons];
        double heights[]=new double[numOfPersons];
        double bmi[] = new double[numOfPersons];
        String status[]= new String[numOfPersons];
        for(int i=0;i<numOfPersons;i++){
            weights[i]=sc.nextDouble();
            heights[i]=sc.nextDouble()/100;
            bmi[i]= weights[i]/(heights[i]*heights[i]);
            if(bmi[i]>=40.0) status[i]="Obese";
            else if(bmi[i]>=25.0) status[i]="Overweight";
            else if(bmi[i]>=18.5) status[i]="Normal";
            else status[i]="Underweight";
        }
        for(int j=0;j<numOfPersons;j++){
            System.out.println("height: "+heights[j]+"m, weight: "+weights[j]+"kg, BMI: "+String.format("%.2f",bmi[j])+", Status: "+status[j]);
        }
    }
}


