import java.sql.Time;
import java.util.Scanner;

public class SortandRotate {

    public static boolean checksortnrot(int[] arr,int n){

        //Method 1 - using the nested loops to check element is sorted or not
        // Time Complexity: O(N2), as it uses two nested loops to compare every pair of elements in the array.
        // Space Complexity: O(1), as no extra space is used apart from a few variables.
        // for(int i = 0; i < n ; i++){
        //     for(int j = 0 ; j < n - 1 ; j++){
        //         // If any element is smaller than the previous one, return false
        //         if(arr[j] < arr[i])  return false;
        //     }
        // }
        // return true;// Return true if no unsorted elements are found

        //Method 2 - if there is only one cnt of unsorted then it is ok or no count
        // then it is also ok 
        //Time Complexity: O(N), as it checks each adjacent pair once in a single pass through the array.
        // Space Complexity: O(1), as it uses constant extra space regardless of input size.
        int cnt = 0; //to track how many inconsistent rotations in there
        for(int i = 0 ; i < n ; i++){
            if(arr[i] > (arr[(i+1)%n]))cnt++;
            if(cnt > 1 ) return false;
        }
        return true;
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
    if(checksortnrot(arr, n) == true){
        System.out.println("Array is sorted and one time rotate then it is sorted");
    }
    else System.out.println("Array is not sorted");

      sc.close(); 
    }
}
