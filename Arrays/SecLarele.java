import java.sql.Time;
import java.util.*;

public class SecLarele {
    public static int seclargeelement(int[] arr,int n){
        //Method 1 - if there is no duplicate then simply we can do it by sorting
        // Time Complexity: O(N log N), for sorting the array.
        // Space Complexity: O(1), as we are using a constant amount of space for variables.
        // Arrays.sort(arr);
        // return arr[arr.length - 2];

        //Method 1 - if there is duplicate exists then we firstly sort the array and the element which is second
        // largest which is just smaller than largest element return it 
        //Step 1 - Firstly sort the array 
        // Arrays.sort(arr);
        //Step 2 - take the largest element and from the last to start check when we find the largest element 
        //which is just smaller than the largest element return it
        // int lar = arr[n-1];
        // for(int i = n-2 ; i >= 0; i-- ){
        //     if(arr[i] != lar){
        //         lar = arr[i];
        //         break;
        //     }
        // }
        // return lar;

        //Method 2 - find the largest element 
        // Time Complexity: O(N), we do two linear traversals in our array.
        // Space Complexity: O(1), as we are using a constant amount of space for variables.
        // int lar = -1;
        // int seclar = -1;
        // for(int i = 0; i < n ; i++)
        //     if(arr[i] > lar) lar = arr[i];

        // for(int i = 0 ; i < n; i++)
        //     if(seclar < arr[i] && arr[i] < lar) seclar = arr[i];

        // return seclar;

        //Method 3 - Optimized approach 
        // Time Complexity: O(N), we do two linear traversals in our array.
        // Space Complexity: O(1), as we are using a constant
        int lar = arr[0];
        int seclar = -1;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] > lar){
                seclar = lar;
                lar = arr[i];
            }
            else if(seclar < arr[i] && arr[i] < lar){
                seclar = arr[i];
            }
        }
        return seclar;
    }
    public static void main(String[] args){
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
    System.out.println("The Largest number in the array is : " + seclargeelement(arr,n));

      sc.close();
    }
}
