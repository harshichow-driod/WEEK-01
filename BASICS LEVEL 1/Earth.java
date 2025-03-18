public class Earth{
	public static void main(String[]args){
	int radius=6378;
	double volume=(4/3)*3.14*radius*radius*radius;
	double mile=volume*0.2399193;
	System.out.println("The volume of earth in cubic kilometers is "  + volume + " and cubic miles "  +  mile );
	}
}
