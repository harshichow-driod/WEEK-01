import java.util.Scanner;
class Program6{
    public static String checkCharacter(char c){
        if(c>='A'&&c<='Z'){
            c=(char)(c+32);
        }
        if(c>='a' && c<='z'){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                return "vowel";
            }else return "consonant";
        }
        return "not a letter";
    }
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
    public static String[][] storeVowel(String s){
        int len=findLength(s);
        String[][] type= new String[len][2];
        for(int i=0;i<len;i++){
            type[i][0]=String.valueOf(s.charAt(i));
            type[i][1]=checkCharacter(s.charAt(i));
        }
        return type;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[][] type=storeVowel(str);
        System.out.println("Character\tType");
        System.out.println("__________________________");
        for(String[] entry:type){
            System.out.println(entry[0]+"\t\t"+entry[1]);
        }
    }
}