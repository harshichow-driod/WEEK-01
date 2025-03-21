import java.util.Scanner;
public class Triangular4 {
public static double calculateRounds(double side1, double side2, double side3) {
            double perimeter = side1 + side2 + side3;
            double distance = 5000;
            double rounds = distance / perimeter;
            return rounds;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print(" length of side 1 : ");
            double side1 = sc.nextDouble();
            System.out.print(" length of side 2 : ");
            double side2 = sc.nextDouble();
            System.out.print(" length of side 3 : ");
            double side3 = sc.nextDouble();
            double roundsNeeded = calculateRounds(side1, side2, side3);
            System.out.println(" Number of rounds user needs to do to complete 5km run is"+ roundsNeeded);
        }
    }
    