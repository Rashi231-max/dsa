import java.util.*;
public class sumOfDigits_recursion {
   
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();

      sumOfDigits_recursion obj = new sumOfDigits_recursion();
        int result = obj.sumOfDigits(num);   
        System.out.println("sum of digits is "+result);
        
    }
    public static int sumOfDigits(int num)
    {int sum,rem;
        if(num==0){
            return 0;
        }
        return (num % 10) + sumOfDigits(num / 10);
    }
}
