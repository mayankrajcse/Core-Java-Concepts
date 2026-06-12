import java.util.*;
public class p7{
    public static void main(String[]args){
        int hour,minute,second,time;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the time in second");
        time=obj.nextInt();
        hour=time/3600;
        minute=(time%3600)/60;
        second=(time%3600)%60;
        System.out.print(hour);
        System.out.print("hour:");
        System.out.print(minute);
        System.out.print("minute:");
        System.out.print(second);
        System.out.print("second:");


    }
}