
import java.util.Scanner;
public class Program13 {
    public static int[][] generateMatrix(int r,int c){
        int[][] matrix=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]= (int)(Math.random()*10);
            }
        }
        return matrix;
    }
    public static void displayMatrix(int[][] matrix){
        for(int[] row:matrix){
            for(int val:row){
                System.out.print(val+" ");
            }
            System.out.println("");
        }
    }
    public static int[][] addMatrices(int[][] a,int[][] b){
        int r=a.length,c=a[0].length;
        int[][] add=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                add[i][j]=a[i][j]+b[i][j];
            }
        }
        return add;
    }
    public static int[][] subMatrices(int[][] a,int[][] b){
        int r=a.length,c=a[0].length;
        int[][] sub=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sub[i][j]=a[i][j]-b[i][j];
            }
        }
        return sub;
    }
    public static int[][] mulMatrices(int[][] a,int[][] b){
        int r=a.length,c=b[0].length,common=a[0].length;
        int[][] mul=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                for(int k=0;k<common;k++){
                    mul[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        return mul;
    }
    public static int[][] transposeMatrix(int[][] a){
        int r=a.length,c=a[0].length;
        int[][] trans=new int[c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                trans[j][i]=a[i][j];
            }
        }
        return trans;
    }
    public static int deter2x2(int[][] a){
        return (a[0][0]*a[1][1]) - (a[0][1]*a[1][0])  ;  
    }
    public static int deter3x3(int[][] a){
        return a[0][0]*(a[1][1]*a[2][2] - a[1][2]*a[2][1]) -a[0][1]*(a[1][0]*a[2][2] - a[1][2]*a[2][0]) +a[0][2]*(a[1][0]*a[2][1]-a[1][1]*a[2][0]);
    }
    public static int[][] inverse2x2(int[][] matrix){
        int det=deter2x2(matrix);
        if(det==0) return null;
        int[][] inverse=new int[2][2];
        inverse[0][0]=matrix[1][1]/det;
        inverse[0][1]=-matrix[0][1]/det;
        inverse[1][0]=-matrix[1][0]/det;
        inverse[1][1]=matrix[0][0]/det;
        return inverse;
    }
    public static int[][] inverse3x3(int[][] matrix){
        int det=deter3x3(matrix);
        if(det==0) return null;
        int[][] inverse=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int[][] minor=new int[2][2];
                for(int m=0,x=0;m<3;m++){
                    if(m==i) continue;
                    for(int n=0,y=0;n<3;n++){
                        if(n==j) continue;
                        minor[x][y] = matrix[m][n];
                        y++;
                    }
                    x++;
                }
                inverse[j][i]= (int)Math.pow(-1,i+j)*deter2x2(minor)/det;
            }
        }
        return inverse;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        int[][] a=generateMatrix(rows, columns);
        int[][] b=generateMatrix(rows, columns);
        int[][] c=generateMatrix(rows+1, columns+1);
        int[][] d=generateMatrix(rows+1, columns+1);
        System.out.println("Matrix A:");
        displayMatrix(a);
        System.out.println("Matrix B:");
        displayMatrix(b);
        System.out.println("Matrix C:");
        displayMatrix(c);
        System.out.println("Matrix D:");
        displayMatrix(d);
        System.out.println("Matrix A+B:");
        displayMatrix(addMatrices(a, b));
        System.out.println("Matrix A-B:");
        displayMatrix(subMatrices(a, b));
        System.out.println("Matrix A*B:");
        displayMatrix(mulMatrices(a, b));
        System.out.println("Transpose of C:");
        displayMatrix(transposeMatrix(c));
        System.out.println("Determinant of A: "+deter2x2(a));
        System.out.println("Determinant of C: "+deter3x3(c));
        int[][] inverse=inverse2x2(a);
        if(inverse!=null) {
            System.out.println("Inverse of A matrix:");
            displayMatrix(inverse);
        }
        else System.out.println("Matrix A has no inverse");
        int[][] inverse2= inverse3x3(d);
        if(inverse2!=null) {
            System.out.println("Inverse of D matrix:");
            displayMatrix(inverse2);
        }
        else System.out.println("Matrix D has no inverse");
    }
   
}

