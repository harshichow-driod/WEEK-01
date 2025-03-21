
public class Program11 {
    public static double[][] generateSalaryAndYear(int n){
        double[][] data=new double[n][2];
        for(int i=0;i<10;i++){
            data[i][0]= 10000+(Math.random()*90000);
            data[i][1]= 1+(Math.random()*10);
        }
        return data;
    }
    public static double[][] calculateBonusAndNewSalary(double[][] data,int n){
        double[][] updatedData = new double[n][2];
        for(int i=0;i<n;i++){
            double salary=data[i][0];
            int years=(int)data[i][1];
            double bonusPercentage=(years>5)?0.05:0.02;
            double bonus=salary*bonusPercentage;
            double newSalary=salary+bonus;
            updatedData[i][0]=newSalary;
            updatedData[i][1]=bonus;

        }
        return updatedData;

    }
    public static void printResult(double[][] data,double[][] updatedData,int n){
        double totalOldSalary=0, totalNewSalary=0, totalBonus=0;
        System.out.printf("%-5s %-10s %-10s %-10s %-10s %-10s\n","ID","Old Salary","Years","Bonus","New Salary","Total Bonus");
        System.out.println("________________________________________________________________________");
        for(int i =0;i<n;i++){
            double oldSalary= data[i][0];
            int year=(int)data[i][1];
            double newSalary=updatedData[i][0];
            double bonus=updatedData[i][1];
            totalOldSalary+=oldSalary;
            totalNewSalary+=newSalary;
            totalBonus+=bonus;
            System.out.printf("%-5d %-10.2f %-10d %-10.2f %-10.2f %-10.2f\n",(i+1),oldSalary,year,bonus,newSalary,totalBonus);

        }
        System.out.println("_______________________________________________________________________");
        System.out.printf("%-5s %-10.2f %-10s %-10.2f %-10.2f %-10.2f","Total",totalOldSalary,"-",totalBonus,totalNewSalary,totalBonus);
    }
    public static void main(String[] args) {
        int employees=10;
        double[][] data=generateSalaryAndYear(employees);
        double[][] updatedData=calculateBonusAndNewSalary(data, employees);
        printResult(data, updatedData, employees);

       
    }
   
}


