import java.util.*;
public class AddTwoMatrices {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.print("Enter the Row & columns For matrix 1:");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int mat1[][]=new int[row][col];
        int [][] sum =new int[row][col];
        System.out.print("Enter the matrix 1 element:");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter the no.of row & columns matrix 2:");
        int row1=sc.nextInt();
        int col1=sc.nextInt();
        int mat2[][]=new int[row1][col1];
        System.out.println("Enter the matrix 2 element:");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                mat2[i][j]=sc.nextInt();

            }
            
        } 
        System.out.println("The Addition Result of Two Matrices:");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                sum[i][j]=mat1[i][j]+mat2[i][j];
                System.out.print( sum[i][j]+"  ");
            }
            System.out.println();
        }
        
            
        
    }

    
}
