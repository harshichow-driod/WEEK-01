import java.util.Scanner;
public class StringIndexOutOfBounds{
    public static void  generate(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println("Attempting to access elements");
        System.out.println("Length of a string is " +str.length()+ str. charAt(str.length()));
    }
          public static void handle() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String str = scanner.nextLine();
         try{
             System.out.println("Attempting to access elements");
             System.out.println("Length of a string is " +str.length()+ str. charAt(str.length()));
         }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("Exception Caught  "+ e.getMessage());
        }
}
    public static void main(String args[]){
    handle();
    }
}