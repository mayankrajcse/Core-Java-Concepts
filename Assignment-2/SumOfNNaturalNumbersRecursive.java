import java.util.*;
public class SumOfNNaturalNumbersRecursive {
    public static int sum(int value){
        if(value==0)
        return 0;
        return value + sum(value-1);
}
    public static void main(String args[]){
        System.out.println("Enter the Number:");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
    System.out.println("Sum of natual number: " + sum(num1));
        sc.close();
    }
}
        
    

