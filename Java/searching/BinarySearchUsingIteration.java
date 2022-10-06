import java.util.Scanner;

public class BinarySearchUsingIteration {

    public static void main(String[] args) {

        // To apply binary search on an array the array must be sorted
        int[] arr={1, 2, 36, 45, 55, 57, 62, 85, 97};
        Scanner sc= new Scanner(System.in);

        int target; // Element that you want to search
        System.out.print("Enter the number you want to search: ");
        target=sc.nextInt();
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end-start)/2 ;

            if(arr[mid]==target){
                System.out.println("Element "+ target + " is present at index "+mid);
                System.exit(0);
            }
            if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        System.out.println("Element "+ target +" does not exist in the array");
    }
}


