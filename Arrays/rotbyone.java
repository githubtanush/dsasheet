import java.util.Scanner;

public class rotbyone {

    public static void leftrotbyoneorn(int[] arr,int n){

        //Method 1 - brute force 
        //Make an array of same size to store the variables of left side of the array 
        // Time Complexity: O(N), where N is the size of the array. This is because we traverse the array once to shift the elements.
        // Space Complexity: O(N), as we are using a temporary array of the same size as the input array to store the shifted elements.
        //Step 1 - Make an array of same size
        int[] arrr = new int[n]; //Temporary array to store the elements
        
        //Step 2 - shift 1 element to the left of the temp array by traversing the whole array 
        for(int i = 1 ; i < n; i++) arrr[i-1] = arr[i];
        
        //Step 3 - put the last element at the end of the array 
        arrr[n-1] = arr[0];

        //Step 4 - assign arrr to arr to show the variations of how element move to the left by doing deep copy
        for(int i = 0; i < n; i++){
            arr[i] = arrr[i];
        }
        


        //Method 2 - Thoda optimal rotation by one we simply make a temp variable and store the left most part in that 
        // and move all towards left and in the end of the array assign temp into it
        // Time Complexity: O(N), where N is the size of the input array. This is because we traverse the array once to shift the elements.
        // Space Complexity: O(1), as we are using only a constant amount of extra space for the temporary variable.
        //Step 1 - store the first element of the array in temp variable
        // int temp = arr[0];
        // //Step 2 - move all elements towards left
        // for(int i = 1; i < n; i++) arr[i-1] = arr[i];
        // //Step 3 - assign temp as the last element of the array 
        // arr[n-1] = temp;
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
    leftrotbyoneorn(arr, n);
    for(int i = 0 ; i < n; i++){
        System.out.print(arr[i] + " ");
    }
      sc.close(); 
    }
}
