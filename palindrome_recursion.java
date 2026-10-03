import java.util.*;
public class palindrome_recursion {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int num2=num;
         int rev_num = 0;
        palindrome_recursion obj=new palindrome_recursion();
       int pal= obj.reverse(num,rev_num);
      
       if(pal==num2)
       {
           System.out.println("palindrome"+pal);
       }
       else
       {
           System.out.println("not palindrome"+pal);
       }
    }
    public static int reverse(int num, int rev_num)
    {  
        if(num==0)
        {
            return rev_num;
        }
        rev_num= (rev_num * 10) +(num % 10);
        return reverse(num/10, rev_num);
    }
    

}
