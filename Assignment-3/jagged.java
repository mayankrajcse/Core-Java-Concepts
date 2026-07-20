import java.util.*;
public class jagged {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows 1:");
        int row1=sc.nextInt();
        int a[]=new int[row1];
        System.out.print("Enter 3 element for row 1:");
        for(int i=0;i<row1;i++)
        {
            a[i]=sc.nextInt();

        }
        System.out.println("Enter the number of rows 2:");
        int row2=sc.nextInt();
        int b[]=new int[row2];
        System.out.print("Enter 3 element for row 2:");
        for(int i=0;i<row2;i++)
        {
            b[i]=sc.nextInt();

        }
        System.out.println("Enter the number of rows 3:");
        int row3=sc.nextInt();
        System.out.print("Enter The number of rows 3:");
        int c[]=new int[row3];
        for(int i=0;i<row3;i++)
        {
            c[i]=sc.nextInt();

        }
        System.out.println("===Jagged Array===");
        for(int i=0;i<row1;i++)
        {
        System.out.print(a[i] + " ");
        }
        System.out.println("\n");
        for(int i=0;i<row2;i++)
        {
            System.out.print(b[i] + " ");
            
        }
        System.out.println("\n");
         for(int i=0;i<row3;i++)
        {
            System.out.print(c[i]   + " ");
            
        } 
        System.out.println("\n");
       
    }
    
}