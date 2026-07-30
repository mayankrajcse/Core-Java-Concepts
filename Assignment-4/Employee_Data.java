import java.util.*;
class Employee{
    String Empid;
    String Ename;
    String dep;
    int sal;
    public void getData(String Empid,String Ename,String dep,int sal)
    {
        this.Empid=Empid;
        this.Ename=Ename;
        this.dep=dep;
        this.sal=sal;
    }

public void putData()
{
    
    System.out.println("Employe detail");
    System.out.println("Employee ID: " + Empid);
    System.out.println("Employee Name: " + Ename);
    System.out.println("Department: " + dep);
    System.out.println("Salary: " + sal);
}
}
public class Employee_Data{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

        System.out.println("Enter The no. of employees:");
        int n = sc.nextInt();
        sc.nextLine();
        Employee emp[]=new Employee[n];
        for (int i=0;i<n;i++)
{

    emp[i]=new Employee();
    System.out.println("\n enter the employee"+(i+1)+"details"); 
    
    System.out.println("Enter The Employee ID:");
    String empid=sc.nextLine();
    System.out.println("Enter The Employee Name:");
    String ename=sc.nextLine();
    System.out.println("Enter The Department:");
    String dept=sc.nextLine();
    System.out.println("Enter The Salary:");
    int sal=sc.nextInt();
    sc.nextLine();
    emp[i].getData(empid,ename,dept,sal);
}
System.out.println("\nEmployee Detail\n");
for(int i=0;i<n;i++)
{
    emp[i].putData();
    System.out.println();
}
}
}

