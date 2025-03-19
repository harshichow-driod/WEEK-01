import java.util.Scanner;
public class BMIStatus {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        double weight = input.nextInt();
        double height = input.nextInt();
        double height2=height/100;
		double BMI=weight/(height2*height2);
	if(BMI<=18.4)
	System.out.println("UnderWeight");
	else if(BMI<=24.9)
	System.out.println("Normal");
	else if (BMI<=39.9)
	System.out.println("OverWeight");
	else
	System.out.println("Obese");
	}
}
	