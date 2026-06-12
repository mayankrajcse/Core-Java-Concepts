import java.util.*;
public class p8{
    public static void main(String[]args){
        int num,b,a,c,d,x,y;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number");
        num=obj.nextInt();
        a=num%10;
        b=(num/10)%10;
        x=(num/10)/10;
        c=x%10;
        y=(num/10)/10;
        d=x/10;
        System.out.print("Reversed Number:");
        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
        System.out.print(d);


    }
}