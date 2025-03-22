import java.util.Scanner;
public class Program9 {
    public static String convertUpper(String s){
        char[] s1=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(s1[i]>='a' && s1[i]<='z'){
                s1[i]=(char)(s1[i]-32);
            }
        }
        return new String(s1);
    }
    public static boolean compareStrings(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=s1.toUpperCase();
        String s3=convertUpper(s1);
        if(compareStrings(s2, s3)) System.out.println("Both "+s2+" and "+s3+" are same");
        else System.out.println("Both "+s2+" and "+s3+" are not same");
    }
}