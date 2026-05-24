import java.sql.Time;
import java.util.HashSet;
import java.util.Scanner;

public class removedup {

    public static int removedup(int[] arr,int n){
        //Method 1 - We simply use hashset to find the unique elements in the array 
        // Time Complexity: O(N), We traverse the entire array and insert elements into set.
        // Space Complexity: O(N), additional space used to store elements in set.
        //Step 1 - create one set which is help us to find the unique elements in the set
        // HashSet<Integer> seen = new HashSet<>();
        // //Step 2 - take the index variable so that we keep the track of the whole array that where we going
        // int index = 0;
        // //Step 3 - traverse in the loop and when there is no unique element enter in the set so and move the index 
        // // so that unique elements is at the start of the corner
        // for(int num : arr){
        //     //if there is not element that is not present in the set then we do this
        //     if(!seen.contains(num)){
        //         //if there is a unique element in the set then add in set
        //         seen.add(num);
        //         // at the index location put the element of the array 
        //         arr[index] = num;
        //         //increment the index variable
        //         index++;
        //     }
        // }
        // return index;


        //Method 2 - when there is something remove duplicate means traverse the array we can use the two pointers 
        // technique and easily remove duplicates
        // Instead of using a set to store the unique elements, we can implement a two pointer strategy to optimize the space. 
        // Since the array is sorted, we know that all the duplicate values will be adjacent to each other.
        // Time Complexity: O(N), We traverse the entire original array only once.
        // Space Complexity: O(1), constant additional space is used to check unique elements.
        int i = 1; // start using with one pointer with one more step 
        int j = 0; // this pointer is used to check if in next step the value is same or not
        while(i < n){
            if(arr[i] == arr[j]) i++;
            else{
                j++;
                arr[j] = arr[i];
                i++;
            }
        }
        return j+1;


        
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
    System.out.println("After removing duplicates from the array array size will be : "+removedup(arr, n));
      sc.close(); 
    }
}
