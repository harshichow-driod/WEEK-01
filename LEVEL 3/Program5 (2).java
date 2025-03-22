
import java.util.Scanner;

public class Program4 {
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
            char currentChar=s.charAt(i);
            boolean isUnique=true;
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
        char[] result=new char[uniqueCount];
        for(int k=0;k<uniqueCount;k++){
            result[k]=uniqueChars[k];
        }
        return result;
    }
    public static String[][] getFrequency(String s){
        char[] result=getUnique(s);
        int len=findLength(s);
        int[] freq=new int[256];
        for(int i=0;i<len;i++){
            freq[s.charAt(i)]++;
        }
        int lenOfUnique=result.length;
        String[][] characterWithFreq= new String[lenOfUnique][2];
        for(int j=0;j<lenOfUnique;j++){
            characterWithFreq[j][0]=String.valueOf(result[j]);
            characterWithFreq[j][1]=String.valueOf(freq[result[j]]);
        }
        return characterWithFreq;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        String[][] characterWithFreq=getFrequency(str);
        for(String[] entry:characterWithFreq){
            System.out.println("Character:"+entry[0]+", Frequency:"+entry[1]);
        }
       
    }
}

