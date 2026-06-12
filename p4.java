import java.util.*;
public class p4{
    public static void main(String[]args){
        int num,a,b;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number");
        num=obj.nextInt();
        a=num%10;
        b=num/10;
        System.out.println("before swaping a="+a);
        System.out.println(a);
        System.out.println("before swaping b="+b);
        System.out.println(b);
        System.out.println("after swaping a=");
        System.out.println(a);
        System.out.println("after swaping b=");
        System.out.println(b);
        obj.close();
    }
}
/*output is not match*/