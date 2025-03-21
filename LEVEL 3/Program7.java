public class Program7 {
    public static int generateOTP(){
        return 100000 + (int) (Math.random() * 900000);
    }
    public static boolean isUnique(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] otp=new int[10];
        for(int i=0;i<10;i++){
            otp[i]=generateOTP();
            System.out.println("Generated OTP "+(i+1)+": "+otp[i]);
        }
        if(isUnique(otp)) System.out.println("True");
        else System.out.println("False");
    }
   
}