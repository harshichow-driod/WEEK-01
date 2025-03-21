import java.util.Scanner;
public class Strings
public static boolean stringcomp(String str1,String str2){

    if(str1.length()!=str2.length())
         return false;
    for (int i=0;i<str1.length();i++){
         if (str1.charAt(i)!=str2.charAt(i))
        return false;
}
public static void main(String[]args){

Scanner sc=new Scanner(System.in);
String str1=sc.next();
System.out.println("Enter First String: ");
String str2=sc.next();
System.out.println("Enter Second String: ");

}
}




