
import java.util.Scanner;

public class Program3 {
    public static int findLength(String s){
        int count=0;
        try{
            while(true){
                s.charAt(count);
                count++;
            }
        }catch(Exception e){
            return count;
        }
       
    }
    public static char getFirstNonRepeating(String s){
        int len=findLength(s);
        int[] freq=new int[256];
        for(int i=0;i<len;i++){
            freq[s.charAt(i)]++;
        }
        for(int j=0;j<len;j++){
            if(freq[s.charAt(j)]==1) return s.charAt(j);
        }
        return '\0';
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        char result=getFirstNonRepeating(str);
        if((result!='\0')){
            System.out.println("First non repeating character: "+result);
        }
        else System.out.println("No non repeating character found");
       
    }
   
}


