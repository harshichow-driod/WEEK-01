import java.util.Scanner;
public class MarksGrade{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
int phy = input.nextInt ();
int chem = input.nextInt ();
int math= input.nextInt ();
double percentage=(phy+chem+math)/3;
	if (percentage>=80)
		System.out.println(("(Level 4 , above agency-normalized standards)" ));
	else if (percentage>=70)
		System.out.println(("(Level 3, agency-normalized standards)" ));
	else if(percentage>=60)
		System.out.println(("(Level 2 , but approaching agency-normalized standards)" ));
	else if(percentage>=50)
		System.out.println(("(Level 1 , well below agency-normalized standards)" ));
	else if(percentage>=40)
		System.out.println(("(Level 4 , too below agency-normalized standards)" ));
	else
		System.out.println(("(Remedial standards)" ));
}
}