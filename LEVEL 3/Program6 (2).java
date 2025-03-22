
import java.util.Scanner;
public class Program6 {
    public static String[] getFrequency(String s){
        s=s.replace(" ", "");
        char[] character=s.toCharArray();
        int[] freq= new int[character.length];
        for(int i=0;i<character.length;i++){
            if(character[i]!='\0'){
                freq[i]=1;
                for(int j=i+1;j<character.length;j++){
                    if(character[i]==character[j]){
                        freq[i]++;
                        character[j]='\0';
                    }
                }
            }
        }
        int count=0;
        for(char c:character){
            if(c!='\0') count++;
        }
        String[] result=new String[count];
        int index=0;
        for(int i=0;i<character.length;i++){
            if(character[i]!='\0'){
                result[index]=character[i]+": "+freq[i];
                index++;
            }
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] result=getFrequency(s);
        for(String str:result){
            System.out.println(str);
        }
    }
}


