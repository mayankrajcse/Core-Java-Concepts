import java.util.*;
class Box{
    float width;
    float height;
    float depth;
    public void printinfo(float width,float height,float depth)
    {
       this.width=width;
       this.height=height;
       this.depth=depth;

    }
    public float volume()
    {
        return width*height*depth;
    }
}
public class   DimensionDemo{
public static void main(String args[])
{
    Box s1=new Box();
    Scanner sc=new Scanner (System.in);
    System.out.println("ENter The The width:");
    float width=sc.nextFloat();
    System.out.println("Enter The height:");
    float height=sc.nextFloat();
    System.out.println("Enter THe depth");
    float depth=sc.nextFloat();
    s1.printinfo(width,height,depth);
  System.out.println(s1.volume());

}
}
