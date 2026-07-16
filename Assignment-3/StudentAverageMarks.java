import java.util.*;
public class StudentAverageMarks {
    public static void main(String args[]){
        try{
            int sum=0;
            String a=args[0];
            String b=args[1];
            String c=args[2];
            int marks[]=new int [6];
            for(int i=0;i<6;i++)
            {
                marks[i]=Integer.parseInt(args[(i+3)]);
            }
            for(int i=0;i<6;i++)
            {
                sum=sum+marks[i];
            }
            int avg=sum/6;
            System.out.println("===STUDENT RESULT===");
            System.out.println("SIC:"+a);
            System.out.println("NAME:"+b);
            System.out.println("BRANCH:"+c);
            System.out.println("SUBJECT 1:"+args[3]);
            System.out.println("SUBJECT 2:"+args[4]);
            System.out.println("SUBJECT 3:"+args[5]);
            System.out.println("SUBJECT 4:"+args[6]);
            System.out.println("SUBJECT 5:"+args[7]);
            System.out.println("SUBJECT 6:"+args[8]);
            System.out.println("AVERAGE MARKS:"+avg);
            System.out.println("========================");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
