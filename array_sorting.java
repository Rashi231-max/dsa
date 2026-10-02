import java.util.*;
public class array_sorting {

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter elements of array");
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();                                                                
    }
    System.out.println("elements of array");
for(int i=0;i<10;i++){
            System.out.println(arr[i]);                                                                
    }
System.out.println("checking if array is sorted or not");     
        for(int j=0;j<arr.length-1;j++){
        if(arr[j+1]>arr[j])
            {
        continue;
        }
        
         else{
            System.out.println("array is not sorted");
            break;
        }
    }
    
     // System.out.println("array is sorted");
      
    
    
}
}



//** JAVA INSTREAM  */import java.util.stream.IntStream;

// public class StreamCheck {
//     public static boolean isSorted(int[] arr) {
//         return IntStream.range(0, arr.length - 1)
//                 .allMatch(i -> arr[i] <= arr[i + 1]);
//     }
// }
