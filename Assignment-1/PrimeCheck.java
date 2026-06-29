import java.util.*;

public class PrimeCheck{
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the number");
        Scanner obj = new Scanner(System.in);
        num = obj.nextInt();
        
        int count = 0;
        
        if (num <= 1) {
            count = 1;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }
        }
        
        if (count == 0) {
            System.out.println(num + " is a prime no");
        } else {
            System.out.println(num + " it not a prime");
        }
        
        obj.close();
    }
}
