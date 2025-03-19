import java.util.Scanner;
public class Calci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        double first = input.nextDouble();   
        double second = input.nextDouble();
        System.out.print("Enter any operator  ");
        String op = input.next();
        double result;
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;
            case "/":
                    result = first / second;
                    System.out.println("Result: " + result);
          
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
    }
}
