public class Program2{
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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] words1=splitString(str);
        String[] word2=str.split(" ");
        System.out.println(String.join(", ",words1));
        System.out.println(String.join(", ",word2));
        if(compareString(words1, word2)) System.out.println("Both are same");
        else System.out.println("Both are not same");
    }
}