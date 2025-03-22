import java.util.Scanner;
public class Program9 {
    public static final String[] months={"","January","February","March","April","May","June","July","August","September","October","November","December"};
    public static final int[] daysInMonth={'\0',31,28,31,30,31,30,31,31,30,31,30,31};
    public static boolean isLeapYear(int year){
        return ((year%4==0 && year%100!=0)|| year%400==0);
    }  
    public static int getDaysInMonths(int month,int year){
        if(month==2 && isLeapYear(year)) return 29;
        return daysInMonth[month];
    }
    public static int getFirstDayInMonth(int year,int month){
        int d=1;
        int y0=year-(14-month)/12;
        int x=y0+y0/4-y0/100+y0/400;
        int m0=month+12*((14-month)/12)-2;
        int d0=(d+x+31*m0/12)%7;
        return d0;
    }
    public static void printCalendar(int year,int month){
        int firstDay=getFirstDayInMonth(year, month);
        int days=getDaysInMonths(month, year);
        System.out.println("\n "+months[month]+" "+year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
        for(int i=0;i<firstDay;i++){
            System.out.print("    ");
        }
        for(int i=1;i<=days;i++){
            System.out.printf("%4d",i);
            if((i+firstDay)%7==0){
                System.out.println("");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year");
        int year =sc.nextInt();
        System.out.println("Enter month between 1-12");
        int month=sc.nextInt();
        printCalendar(year, month);
    }
}