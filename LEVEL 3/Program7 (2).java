import java.util.Scanner;

public class Program7 {
    public static boolean checkPalindrome(String s){
        int end =s.length()-1;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(end-i)) return false;
        }
        return true;

    }
    public static boolean isPalindromeRecursive(String s,int start,int end){
        if(start>=end) return true;
        if(s.charAt(start)!=s.charAt(end)) return false;
        return isPalindromeRecursive(s, start+1, end-1);
    }
    public static boolean isPalindromeArray(String s){
        char[] original=s.toCharArray();
        char[] reversed=new char[original.length];
        for(int i=0;i<original.length;i++){
            reversed[i]=original[original.length-1-i];
        }
        for(int j=0;j<original.length;j++){
            if(reversed[j]!=original[j]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(checkPalindrome(s)) System.out.println("Palindrome");
        else System.out.println("Not a Palindrome");
        if(isPalindromeRecursive(s,0,s.length()-1)) System.out.println("Palindrome");
        else System.out.println("Not a Palindrome");
        if(isPalindromeArray(s)) System.out.println("Palindrome");
        else System.out.println("Not a Palindrome");
    }
}