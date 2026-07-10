import java.util.*;
public class SearchElementInArray{
   public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number:");
        int num1=sc.nextInt();
        int arr[]=new int[num1];
        System.out.println("Enter The Array Element:");
        for(int i=0;i<num1;i++)
        {
            arr[i]=sc.nextInt();
        }
        boolean found=false;
        System.out.println("Enter The Number Which You Want Search In Array Element:");
        int search=sc.nextInt();
        for(int i=0;i<num1;i++)
        {
            if(arr[i]==search)
            {
            System.out.println("Element Found: "+search);
            found=true;
            break;
            }
        }
    if(found==false)
    {
        System.out.println("Element Not Found");
    }
    
}
}
    

