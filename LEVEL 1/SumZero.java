import java.util.Scanner;
public class SumZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;  
        double number;      
        number = scanner.nextDouble();
        while (number != 0) {
            total += number;  
            number = scanner.nextDouble(); 
        }
        System.out.println("Total sum: " + total);
    }
}
