package Unit3;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.println("Enter size of matrix");
        m=sc.nextInt();
        n=sc.nextInt();

        int mat1[][] =new int[m][n];
        System.out.println("Enter elements of first matrix");
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++)
                mat1[i][j]=sc.nextInt();
        }
        int mat2[][] =new int[m][n];
        System.out.println("Enter elements of second matrix");
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++)
                mat2[i][j]=sc.nextInt();
        }
        int res[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++)
                res[i][j]=mat1[i][j]+mat2[i][j];
        }

        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++)
                System.out.print(res[i][j]+" ");
            System.out.println();
        }

    }
}
