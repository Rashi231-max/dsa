import java.util.*;
public class rev {
public static void main(String[] args) {

Scanner sc =new Scanner(System.in);
 //****-string reverse using string builder-****
// System.out.println("enter string to be reversed");
// String str= sc.nextLine();
// String rev=new StringBuilder(str).reverse().toString();
// System.out.println("the reversed string is "+ rev);

//**** reverse of array ****

int arr[]=new int[10];
System.out.println("enters elemnts of array");
for(int i=0;i<10;i++){
arr[i]=sc.nextInt();
}
System.out.println("the reversed array is");
for(int i=9;i>=0;i--)
{
    System.out.println(arr[i]);
}}
}