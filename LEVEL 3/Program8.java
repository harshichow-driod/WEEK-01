import java.util.Scanner;
public class Program8 {
    private static final String[] months={"","January","February","March","April","May","June","July","August","September","October","November","December"};

    private static final int[] daysInMonth={0,31,28,31,30,31,30,31,31,30,31,30,31};
    public static boolean isLeapYear(int year){
        if((year%4==0 && year%100!=0)||year%400==0) return true;
        return false;
    }
    public static int getDaysInMonth(int month,int year){
        if(month==2 && isLeapYear(year)){
            return 29;
        }
        return daysInMonth[month];
    }
    public static int getFirstDayOfMonth(int month,int year){
        int d=1;
        int y0=year-(14-month)/12;
        int x=y0+y0/4-y0/100+y0/400;
        int m0=month+12*((14-month)/12)-2;
        int d0=(d+x+31*m0/12)%7;
        return d0;
    }
    public static void printCalculator(int month,int year){
        System.out.println("\n "+months[month]+" "+year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
        int firstDay=getFirstDayOfMonth(month, year);
        int numDays=getDaysInMonth(month, year);
        for(int i=0;i<firstDay;i++){
            System.out.print("    ");
        }
        for(int day=1;day<=numDays;day++){
            System.out.printf("%4d",day);
            if((day+firstDay)%7==0) System.out.println("");

        }
        System.out.println("");

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        int month=sc.nextInt();
        if(month<1 || month>12) System.out.println("Invalid month");
        else printCalculator(month, year);


    }
   
}