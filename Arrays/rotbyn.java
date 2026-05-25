import java.sql.Time;
import java.util.Arrays;
import java.util.Scanner;

public class rotbyn {

    public static void reverseArr(int[] arr,int s,int e){
        while(s <= e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    public static void rotByN(int[] arr,int n,int k){
        // if(n == 0) return ; 
        // k = k % n ; 
        // //Method 1 - Make temporary array and store all the elments in that by doing left shift and 
        // //then placed the remaining rotated elements
        // // Time Complexity: O(n), We are performing a constant number of linear operations copying `k` elements and shifting up to `n-k` elements.
        // // Space Complexity: O(k) ,A temporary array of size `k` is used to store either the first `k` or last `k` elements depending on the direction of rotation.
        // //Step 1 - create one temp array of size k 
        // //For storing last k elements we directly do this
        // int[] temp = Arrays.copyOfRange(arr, n-k, n);
        // //Step 2 - move iterations and move the k elements to the temp array
        // // shift remaining elements to the right  
        // for(int i = n-k-1; i >= 0 ; i--) arr[i+k] = arr[i];
        // //Step 3 - simply assign all the temp variables to the array in front
        // for(int i = 0; i < k; i++) arr[i] = temp[i]; 

        //Method 2 - just modification of m1 
        //Time complexity - O(N)
        //Space complexity - O(N)
        //Step 1 - make the temporary egzactly size as k rotations elements
        // int[] temp = new int[n];
        // //Step 2 - iterate the loop and store the right side elements in k 
        // for(int i = 0; i < n ; i++) temp[i] = arr[(i+k)%n];
        // //Step 3 - move all elements to the arr
        // for(int i = 0; i < n ; i++) arr[i] = temp[i];


        //Method 3 - The most optimal way to handle this is. using the reverse method 
        // Time Complexity: O(N), We reverse parts of the array each reverse takes linear time. So total work is 3 × O(N) = O(N).
        // Space Complexity: O(1) All modifications are done in-place, using only a few temporary variables.
        //Step 1 - make the reverse function and reverse from start to kth element;
        reverseArr(arr, 0, k-1);
        //Step 2 - now we reverse from the k to end
        reverseArr(arr, k, n-1);
        //Step 3 - now reverse the whole array 
        reverseArr(arr, 0, n-1);

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
    System.out.println("For How many iterations do you want to rotate ? ");
    int k = sc.nextInt();
    rotByN(arr,n,k);
    for(int i = 0 ; i < n; i++){
        System.out.print(arr[i] + " ");
    }
      sc.close(); 
    }
}
