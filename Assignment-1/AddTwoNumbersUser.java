import java.util.*;

public class AddTwoNumbersUser{
    public static void main(String[] args) {
        float num1, num2, sum;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter number 1");
        num1 = obj.nextFloat();
        System.out.println("enter number 2");
        num2 = obj.nextFloat();
        sum = num1 + num2;
        System.out.println("sum="+sum);
        obj.close();
        

        

    }
}
