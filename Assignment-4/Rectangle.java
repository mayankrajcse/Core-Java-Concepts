import java.util.*;
class Area
{
    int length;
    int breadth;
    public void setDim(int length,int breadth)
    {
       this.length=length;
       this.breadth=breadth;
    }

public int getArea()
{
    return length * breadth;

}
}
public class Rectangle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Area s1=new Area();
        System.out.println("Enter The Length:");
        int a=sc.nextInt();
        System.out.println("Enter The Breadth:");
        int b=sc.nextInt();
        s1.setDim(a,b);
        System.out.println("Area"+s1.getArea());
    }
}

