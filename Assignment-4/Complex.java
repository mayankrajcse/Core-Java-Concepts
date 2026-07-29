import java.util.*;
public class Complex
{
    float a,b,c,d;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Real Number");
          a=sc.nextFloat();
        System.out.println("Enter The Imaginary");
          b=sc.nextFloat();
        System.out.println("Enter The Real Number");
          c=sc.nextFloat();
        System.out.println("Enter The Imaginary NUmber:");
          d=sc.nextFloat();


    }
    void display()
    {
        System.out.print(a);
        System.out.println("+"+ b+"i");
        System.out.print(c);
        System.out.println("+"+ d +"i");
        System.out.println((a + c)+"+"+(b + d)+ "i");
       

    }

    public static void main(String args[]){
        Complex s1=new Complex();
        s1.input();
        s1.display();

    
}    
}
