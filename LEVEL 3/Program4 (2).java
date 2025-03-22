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
   
    public static String[][] getFrequency(String s){
        int len=findLength(s);
        int[] freq=new int[256];
        for(int i=0;i<len;i++){
            freq[s.charAt(i)]++;
        }
        int uniqueCount=0;
        for(int k=0;k<256;k++){
            if(freq[k]>0){
                uniqueCount++;
            }
        }
        String[][] result= new String[uniqueCount][2];
        int index=0;
        for(int j=0;j<256;j++){
            if(freq[j]>0){
                result[index][0]=Character.toString((char)j);
                result[index][1]=Integer.toString(freq[j]);
                index++;
            }
        }
        return result;
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