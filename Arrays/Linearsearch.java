import java.util.Scanner;

public class Linearsearch {
    public static boolean checknumber(int[] arr,int n, int target){
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == target) return true;
        }
        return false;
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
    System.out.println("Enter the target that u want to find is present or not in the array : ");
    int target = sc.nextInt();
    if(checknumber(arr,n,target)) System.out.println("The number is present in the array");
    else System.out.println("The number is not present in the array");
      sc.close(); 
    }
}
