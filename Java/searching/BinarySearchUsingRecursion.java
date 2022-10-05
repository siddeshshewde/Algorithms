import java.util.Scanner;

public class BinarySearchUsingRecursion {

    public static int binarySearch(int[] arr,int target,int start,int end){
        if(start > end)
            return -1;
        int mid = start + (end - start) / 2;
        if(arr[mid] == target)
            return mid;
        if(arr[mid] > target)
            binarySearch(arr,target,start,mid - 1);

        return binarySearch(arr,target,mid +1 ,end);
    }
    public static void main(String[] args) {

        // To apply binary search on an array the array must be sorted
        int[] arr={1, 2, 36, 45, 55, 57, 62, 85, 97};
        Scanner sc= new Scanner(System.in);

        int target; // Element that you want to search
        System.out.print("Enter the number you want to search: ");
        target=sc.nextInt();

        int ans = binarySearch(arr,target,0,arr.length -1);

        if(ans == -1){
            System.out.println("Element "+ target +" does not exist in the array");
        }else {
            System.out.println("Element " + target + " is present at index " + ans);
        }
    }
}
