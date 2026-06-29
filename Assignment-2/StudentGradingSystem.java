import java.util.*;
public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        float avg;
        System.out.println("Enter the marks of 1 subject: ");
        float marks1 = obj.nextFloat();
        System.out.println("enter the marks of 2 subject: ");
        float marks2 = obj.nextFloat();
        System.out.println("enter the marks of 3 subject: ");
        float marks3 = obj.nextFloat();
        System.out.println("enter the marks of 3 subject: ");
        float marks4 = obj.nextFloat();
        avg = (marks1 + marks2 + marks3 + marks4) / 4;
        if (avg >= 90)
            System.out.println("Grade:O");
        else if (avg >= 80 && avg < 90) {
            System.out.println("Grade:E");
        }

        else if (avg >= 70 && avg < 80) {
            System.out.println("Grade:A");
        }

        else if (avg >= 60 && avg < 70) {
            System.out.println("Grade:B");
        }

        else if (avg >= 50 && avg < 60) {
            System.out.println("Grade:C");
        } else if (avg < 50) {
            System.out.println("Grade:F");
        } else 
        {
            System.out.println("invalid");

        }
        obj.close();

    }

}
