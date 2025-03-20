import java.util.Scanner;
public class Program1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double salaries[] =new double[10];
        double years[]= new double[10];
        for(int i=0;i<10;i++){
            double salary;
            while(true){
                if(sc.hasNextDouble()){
                    salary=sc.nextDouble();
                    if(salary>=1) break;

                }
                System.out.println("Invalid, Enter again");
            }
            salaries[i]=salary;
            double year;
            while(true){
                if(sc.hasNextDouble()){
                    year=sc.nextDouble();
                    if(year>0) break;
                }
                System.out.println("Invalid, Enter again");
            }
            years[i]=year;
        }
        double newSalaries[]=new double[10];
        double bonus[]=new double[10];
        double totalBonus=0.0;
        double totalOldSalary=0.0;
        double totalNewSalary=0.0;
        for(int j=0;j<10;j++){
            bonus[j]=(years[j]>5)? salaries[j]*0.05:salaries[j]*0.02;
            newSalaries[j]= salaries[j]+bonus[j];
            totalBonus +=bonus[j];
            totalOldSalary+=salaries[j];
            totalNewSalary+=newSalaries[j];
        }
        System.out.println("Total Bonus Payout: "+totalBonus+"\n Total old salary: "+totalOldSalary+" \n Total new salary: "+totalNewSalary);

    }
}