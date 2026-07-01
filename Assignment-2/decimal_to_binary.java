import java.util.*;
public class decimal_to_binary {
    public static void main(String arg[]){
        int binary=0,place=1;
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num>0)
        {
        int digit=num%2;
        binary=binary+(digit*place);
        place=place*10;
        num=num/2;
        }
        System.out.println(binary);

    
    }
    
}
