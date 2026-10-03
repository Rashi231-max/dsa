import java.util.*;
public class number_recursion {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
number_recursion obj = new number_recursion();
int rev=obj.reverse(num);
System.out.println(rev);

    }
public static int reverse(int num)
{
    if(num==0){
        return 0;}
    
System.out.println(num);
   return reverse(num-1);
    
}

}
