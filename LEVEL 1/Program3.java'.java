
import java.util.Scanner;
public class Program3{
    public static int findLength(String s){
        int count=0;
        try{
        while(true){
            s.charAt(count);
            count++;
        }
        }catch(IndexOutOfBoundsException e){
            return count;
        }
    }
    public static String[] splitString(String s){
        int len=findLength(s);
        int countSpace=0;
        for(int i=0;i<len;i++){
            if(s.charAt(i)==' ') countSpace++;
        }
        int numOfWords = countSpace+1;
        int[] spaceIndex=new int[countSpace];
        int index=0;
        for(int i=0;i<len;i++){
            if(s.charAt(i)==' '){
                spaceIndex[index]=i;
                index++;
            }
        }
        String[] words=new String[numOfWords];
        int start=0;
        for(int i=0;i<countSpace;i++){
            words[i]=s.substring(start,spaceIndex[i]);
            start=spaceIndex[i]+1;
        }
        words[numOfWords-1]=s.substring(start,len);
        return words;
    }
    public static boolean compareString(String[] s1,String[] s2){
        if(s1.length!=s2.length) return false;
        for(int i=0;i<s1.length;i++){
            if(!s1[i].equals(s2[i])) return false;
        }
        return true;
    }
    public static String[][] getWordsWithLength(String[] words){
        String[][] wordsWithLen=new String[words.length][2];
        for(int i=0;i<words.length;i++){
            wordsWithLen[i][0]=words[i];
            wordsWithLen[i][1]=String.valueOf(findLength(words[i]));
        }
        return wordsWithLen;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] words=splitString(str);
        String[][] wordsWithLen=getWordsWithLength(words);
        System.out.println("Words\tLength");
        System.out.println("_______________");
        for(String[] entry:wordsWithLen){
            System.out.println(entry[0]+"\t"+Integer.parseInt(entry[1]));
        }
       
    }
}

