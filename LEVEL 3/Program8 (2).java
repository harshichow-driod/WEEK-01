
import java.util.Scanner;
public class Program8 {
    public static boolean isAnagram(String s1,String s2){
        s1=s1.replace(" ", "").toLowerCase();
        s2=s2.replace(" ", "").toLowerCase();
        int[] freq1=new int[256];
        int[] freq2=new int[256];
        if(s1.length()!=s2.length()) return false;
        for(int i=0;i<s1.length();i++){
            freq1[s1.charAt(i)]++;
            freq2[s2.charAt(i)]++;
        }
        for(int i=0;i<256;i++){
            if(freq1[i]!=freq2[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        System.out.println(s1);
        String s2=sc.nextLine();
        System.out.println(s2);
        if(isAnagram(s1, s2)) System.out.println("Anagram");
        else System.out.println("Not an Anagram");
    }
}

