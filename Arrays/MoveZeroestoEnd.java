import java.sql.Time;
import java.util.Scanner;

public class MoveZeroestoEnd {

    public static void moveZerotoEnd(int[] arr,int n){
        // //Method 1 - Make the temporary array and store all the number except zero in first and then in 
        // // the last store zeroes 
        // // Time Complexity: O(N), we can move all zeroes to end in linear time.
        // // Space Complexity: O(N), additional space used for temporary array.
        // //Step 1 - create one temp arr of same size
        // int[] temp = new int[n];
        // //Step 2 - traverse through the array and store all the number except zero first
        // int index = 0;
        // for(int i = 0; i < n ; i++)
        //     if(arr[i] != 0) temp[index++] = arr[i];
        // //Step 3 - fill the rest of whole array with zeroes
        // while(index < n) temp[index++] = 0;
        // //Step 4 - fill the array in the original array by deep copy
        // for(int i = 0; i < n ; i++) arr[i] = temp[i];

        //Method 2 - we can optimize this approach by using two pointers and in-place 
        //Step 1 - I declare the pointer which move towards with zero
        int j = -1; // this pointer points the zero
        //Step 2 - now let us find the first zero in the array 
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                j = i ;
                break;
            }
        }
        //Step 3 - It is possible that in array no zero is present 
        if(j == -1) return ;

        //Step 4 - But wait if we find the zero then , 
        //start just next from the jth pointer and swap where we find the non - zero value with zeroth value
        //and move the jth pointer
        for(int i = j+1; i < n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                //move to the zeroth value location
                j++;
            }
        }

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
    moveZerotoEnd(arr,n);
    for(int i = 0 ; i < n; i++){
        System.out.print(arr[i] + " ");
    }
      sc.close(); 
    }
}
