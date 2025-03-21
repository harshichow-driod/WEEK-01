import java.util.Scanner;
public class Age17{

    public static boolean vote(int age){
    if(age<0)
         return false ;
    
    else if (age>=18)
        return true;
    
    else
       return false;
    }

    public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int [] age = new int[10];

    for(int i=0;i<age.length;i++)
    {
        System.out.print("Enter age of student  " + (i + 1)  );
        age[i] = input.nextInt();
        if (vote(age[i])) 
            System.out.println("Student " + (i + 1) + " is Eligible to Vote");
         else 
            System.out.println("Student " + (i + 1) + " is not Eligible to Vote.");
        
    }
}
}
