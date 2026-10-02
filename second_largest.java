import java.util.*;
public class second_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int largest=0,second_largest=0;
        int arr[] = new int[10];
        System.out.println("Enter elements of array");
        for (int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("elemnts in array are: ");
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    for(int i=0;i<arr.length;i++)
    {
        if(i==0)
        {
            largest=arr[i];
            second_largest=arr[i];
        }
        else
        {if(arr[i]>largest)
        {second_largest=largest;
         largest=arr[i];}
        else if(arr[i]>second_largest && arr[i]!=largest)
        {second_largest=arr[i];}
        }
    }
    
    System.out.println("Second Maximum element in array is: "+second_largest);
}
}