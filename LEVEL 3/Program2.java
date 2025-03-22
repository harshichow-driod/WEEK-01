import java.util.Scanner;

public class Program2 {
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
    public static char[] getUnique(String s){
        int len=findLength(s);
        char[] uniqueChars=new char[len];
        int uniqueCount=0;
        for(int i=0;i<len;i++){
            boolean isUnique=true;
            char currentChar=s.charAt(i);
            for(int j=0;j<uniqueCount;j++){
                if(s.charAt(j)==currentChar){
                    isUnique=false;
                    break;
                }
            }
            if(isUnique){
                uniqueChars[uniqueCount]=currentChar;
                uniqueCount++;
            }
        }
        char[] results=new char[uniqueCount];
        for(int k=0;k<uniqueCount;k++){
            results[k]=uniqueChars[k];
        }
        return results;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        char[] results=getUnique(str);
        System.out.println("Unique characters:");
        for(char c:results){
            System.out.println(c+" ");
        }
    }
   
}