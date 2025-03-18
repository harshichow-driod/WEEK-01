import java.util.Scanner;
class TravelComputation {
   
   public static void main(String[] args) {
	   

      Scanner sc= new Scanner(System.in);
	  String nm=sc.nextLine();
      String fromCity = sc.nextLine();
	  String viaCity=sc.nextLine();
	  String toCity=sc.nextLine();
      double distanceFromToVia = sc.nextDouble();
      int timeFromToVia = 4 * 60 + 4;
      double distanceViaToFinalCity = sc.nextDouble();
      int timeViaToFinalCity = 4 * 60 + 25;
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;
      int totalTime = timeFromToVia + timeViaToFinalCity;
      System.out.println("The Total Distance travelled by " + nm+ " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");
   }
}
