import java.sql.Time;
import java.util.*;

public class Largestelement{

    public static int largeelement(int[] arr,int n){
        //Method 1 - simply i can sort the array and give the last element in the output
    // Time Complexity: O(N log N), where N is the size of the array, as we are sorting the array.
    // Space Complexity: O(1), as we are using a constant
        // Arrays.sort(arr);
        // return arr[arr.length - 1];

        //Method 2 - i can find it by doing searching algorithm in the array 
        // Time Complexity: O(N), where N is the size of the array, as we are iterating through the array once.
        // Space Complexity: O(1), as we are using a constant
        int lar = arr[0];
        for(int i = 0 ; i < n; i++)
            if(lar < arr[i]) lar = arr[i];
        return lar;
        
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      //take the size of the array 
    System.out.println("Enter the size of the array : ");
    int n = sc.nextInt();
     //Declaring the array 
    int[] arr = new int[n];
      //iterate into loop 
    for(int i = 0 ; i < n ;  i++){
        System.out.println("Enter the element for "+i + " index of the array : ");
        arr[i] = sc.nextInt();
    }
    System.out.println("The Largest number in the array is : " + largeelement(arr,n));

      sc.close();
    }
}