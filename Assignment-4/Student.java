import java.util.*;
 public class Student {
    String name;
    int roll_no;
    String branch;
    Scanner sc=new Scanner(System.in);
    void input()
    {
       System.out.println("Enter Name:");
       name=sc.nextLine();
       System.out.println("Enter Roll No:");
       roll_no=sc.nextInt();
       sc.nextLine();
       System.out.println("Enter The branch:");
       branch=sc.nextLine();

    }
    void display()
    {
        System.out.println("Student Details:");
        System.out.println("Name:" + name);
        System.out.println("Roll No:" + roll_no);
        System.out.println("Branch:" + branch);
    }
}
class Main{
    public static void main(String args[]){
        Student obj=new Student();
        obj.input();
        obj.display();
    }
}
    