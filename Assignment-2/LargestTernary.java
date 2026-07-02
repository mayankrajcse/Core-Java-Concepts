import java.util.*;
public class LargestTernary {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int largest;
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();
        System.out.println("Enter the value of c");
        int c=sc.nextInt();
        largest=(a>b)?
                     ((a>c)?a:c):
                     ((b>c)?b:c);
    System.out.println("Largest no is:"+largest);    
    }
    
}
