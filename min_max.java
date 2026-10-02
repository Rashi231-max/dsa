import java.util.*;
public class min_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min=0,max=0;
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
            min=arr[i];
            max=arr[i];
        }
        else
        {if(arr[i]>max)
        {max=arr[i];}
        if(arr[i]<min)
        {min=arr[i];}
        }
    }
    System.out.println("Maximum element in array is: "+max);
    System.out.println("Minimum element in array is: "+min);
}
}