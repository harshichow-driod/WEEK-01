import java.util.Scanner;
public class Program6{
    public static int findCount(int n){
        int count=0;
        while(n!=0){
            count+=1;
            n/=10;
        }
        return count;
    }
    public static int[] storeArray(int n) {
        int count = findCount(n);
        int[] digits = new int[count];
        int index = count - 1;
   
        while (n != 0) {
            digits[index] = n % 10;
            n /= 10;                
            index--;                
        }
       
        return digits;
    }
    public static int[] reverseArray(int[] digits){
        int len=digits.length;
        int[] reverse = new int[len];
        for(int i=0;i<len;i++){
            reverse[i]=digits[len-1-i];
        }
        return reverse;
    }
    public static boolean compareArray(int[] arr1,int[] arr2){
        if(arr1.length!=arr2.length) return false;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
    }
    public static boolean isPalindrome(int[] digits){
        int[] reversed= reverseArray(digits);
        return compareArray(digits, reversed);
    }
    public static int sumArray(int[] digits){
        int sum=0;
        for(int n:digits){
            sum+=n;
        }
        return sum;
    }
    public static int sumOfSquare(int[] digits){
        int sum=0;
        for(int n:digits){
            sum+=Math.pow(n,2);
        }
        return sum;
    }
    public static boolean isHarshad(int n){
        int[] digits=storeArray(n);
        int sum=sumArray(digits);
        return n%sum==0;
    }
    public static int[][] digitFrequency(int[] digits){
        int[][] freq= new int[10][2];
        for(int i=0;i<10;i++){
            freq[i][0]=i;
            freq[i][1]=0;
        }
        for(int n:digits){
            freq[n][1]++;
        }
        return freq;
    }
    public static boolean isDuck(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]==0) return true;
        }
        return false;
    }
    public static boolean isArmstrong(int n){
        int sum=0;
        int count=findCount(n);
        int temp=n;
        while(temp!=0){
            int digit=temp%10;
            sum=sum+(int)Math.pow(digit, count);
            temp/=10;
        }
        return (n==sum);
    }
    public static int[] largeAndSecondLarge(int[] arr){
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int n:arr){
            if(n>first){
                second=first;
                first=n;
            }
            else if(n>second && n!=first) second=n;
        }
        return new int[]{first,second};

    }
    public static int[] smallAndSecondSmall(int[] arr){
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for(int n:arr){
            if(n<first){
                second=first;
                first=n;
            }
            else if(n<second && n!=first) second=n;
        }
        return new int[]{first,second};

    }
    public static boolean isPrime(int n){
        if(n==0 || n==1) return false;
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static boolean isNeon(int n){
        int square = n*n;
        int sum=0;
        while(square>0){
            sum+=square%10;
            square/=10;
        }
        return (sum==n);
    }
    public static boolean isSpy(int[] digits){
        int sum=sumArray(digits);
        int product=1;
        for(int n:digits){
            product*=n;
        }
        return sum==product;
    }
    public static boolean isAutomorphic(int n){
        int square=n*n;
        return square%(int)Math.pow(10, Integer.toString(n).length()) ==n;
    }
    public static boolean isBuzz(int n){
        if(n%7==0 || n%10==7) return true;
        return false;
    }
    public static int[] findFactrs(int n){
        int count=0;
        for(int i=1;i<n;i++){
            if(n%i==0) count++;
        }
        int[] factors=new int[count];
        int ind=0;
        for(int i=1;i<n;i++){
            if(n%i==0) factors[ind++]=i;
        }
        return factors;
    }
    public static int greatestFactor(int[] arr){
        return arr[arr.length-1];
    }
    public static int sumOfFactors(int[] arr){
        int sum=0;
        for(int n:arr){
            sum+=n;
        }
        return sum;
    }
    public static int productOfFactors(int[] arr){
        int product=1;
        for(int n:arr){
            product*=n;
        }
        return product;
    }
    public static int productOfCube(int[] arr){
        int product=1;
        for(int n:arr){
            product*=(int)Math.pow(n, 3);
        }
        return product;
    }
    public static boolean isPerfect(int n){
        int[] factors=findFactrs(n);
        int sum=sumOfFactors(factors);
        return n==sum;
    }
    public static boolean isAbundant(int n){
        int[] factors=findFactrs(n);
        int sum=sumOfFactors(factors);
        return (sum>n);
    }
    public static boolean isDeficient(int n){
        int[] factors=findFactrs(n);
        int sum=sumOfFactors(factors);
        return (sum<n);
    }
    public static boolean isStrong(int n){
        int sum=0;
        int[] digits=storeArray(n);
        for(int digit:digits){
            int fact=1;
            for(int i=1;i<=digit;i++){
                fact*=i;
            }
            sum+=fact;
        }
        return sum==n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int[] digits=storeArray(number);
        System.out.print("Factors Array: ");
        int[] factors=findFactrs(number);
        for (int num : factors) System.out.print(num + " ");
        System.out.println();
        System.out.println("The Greatest Factor: "+greatestFactor(factors));
        System.out.println("The sum of factors: "+sumOfFactors(factors));
        System.out.println("The product of Factors: "+productOfFactors(factors));
        System.out.println("The product of cube of factors: "+productOfCube(factors));
        if(isPerfect(number)) System.out.println(number+" is a Perfect Number");
        else System.out.println(number+" is not a Perfect Number");
        if(isAbundant(number)) System.out.println(number+" is an Abundant Number");
        else System.out.println(number+" is not an Abundant Number");
        if(isDeficient(number)) System.out.println(number+" is a Deficient Number");
        else System.out.println(number+" is not a Deficient Number");
        if(isStrong(number)) System.out.println(number+" is a Strong Number");
        else System.out.println(number+" is not a Strong Number");
        sc.close();
    }
   
}