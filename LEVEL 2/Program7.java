import java.util.Scanner;

public class Program7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double personData[][] =new double[number][3];
        String[] weightStatus =new String[number];
        for(int i=0;i<number;i++){
            double weight;
            while(true){
                if(sc.hasNextDouble()){
                    weight=sc.nextDouble();
                    if(weight>0) break;
                }
                System.out.println("Enter positive values");
            }
            personData[i][0]=weight;
            double height;
            while(true){
                if(sc.hasNextDouble()){
                    height=sc.nextDouble()/100;
                    if(height>0) break;
                }
                System.out.println("Enter positive values");
            }
            personData[i][1]=height;
            double bmi= weight/(height*height);
            personData[i][2]=bmi;
            if(bmi>=40.0) weightStatus[i]="Obese";
            else if(bmi>=25.0) weightStatus[i]="Overweight";
            else if(bmi>=18.5) weightStatus[i]="Normal";
            else weightStatus[i]="Underweight";
        }
        for(int j=0;j<number;j++){
            System.out.println("height: "+personData[j][1]+"m, weight: "+personData[j][0]+"kg, BMI: "+String.format("%.2f",personData[j][2])+", Status: "+weightStatus[j]);
        }
    }
}