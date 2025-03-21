import java.util.Scanner;
public class BMI10{
public static void Calculation(double[][]arr){
    for(int i =0;i<arr.length;i++){
    double weight=arr[i][0];
    double heightmts=arr[i][1]/100;
    double bmi=weight/(heightmts*heightmts);
    arr[i][2]=bmi;
}
}

public static String logic(double bmiIndex){

    if(bmiIndex<=18.4)
    return ( " UnderWeight");
    else if ((bmiIndex>=18.5 && bmiIndex<24.9))
    return ( " Normal");
    else if((bmiIndex>=25.0 && bmiIndex<39.9))
    return ("OverWeight");
    else
    return("Obese");
}

public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    double[][] arr = new double[10][3];

    for (int i = 0; i < 10; i++) {
        System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
        arr[i][0] = sc.nextDouble();
        System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
        arr[i][1] = sc.nextDouble();
    }

    Calculation(arr);

    System.out.printf("%-10s %-15s %-15s %-15s %-15s\n", "Person", "Weight(kg)", "Height(cm)", "BMI", "Status");
    for (int i = 0; i < 10; i++) {
        double bmi = arr[i][2];
        String status = logic(bmi);
        System.out.printf("%-10d %-15.2f %-15.2f %-15.2f %-15s\n", (i + 1), arr[i][0], arr[i][1], bmi, status);
    }
}
}




