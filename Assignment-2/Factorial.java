import java.util.*;
public class Factorial {
    public static void main(String[]args){
        int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Positive number:");
        int num=sc.nextInt();
        for(;1<num;num--)
        {
            fact=fact*num;   
        }
        System.out.println("Factorial is :"+fact);
        
    }
    
}
