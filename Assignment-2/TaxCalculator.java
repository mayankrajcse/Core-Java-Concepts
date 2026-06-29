import java.util.*;
public class TaxCalculator{
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        float tax=0;
        System.out.println("Enter the income:");
        int income=obj.nextInt();
        if(income<=150000)
        {
            tax=0;
        }
        else if (income<=300000)
        {
            tax=(income-150000)*0.1f;
        }
        else if(income<=500000)
        {
            tax=(300000-150000)*0.1f+(income-300000)*0.2f;
            
        }
        else if(income>500001)
        {
            tax=(300000-150000)*0.1f+(500000-300000)*0.2f+(income-500000)*0.3f;
        
        }
        System.out.println("Total Tax:"+tax);
        obj.close();
    }

    }

