import java.util.Scanner;

public class LinearSearchUsingRecursion {
    public static int linearSearch(int[] arr,int target,int index){
        if(index == arr.length)
            return -1;
        if(arr[index]==target)
            return index;
        return linearSearch(arr,target,index+1);
    }
    public static void main(String[] args) {

        int[] arr={1, 2, 55 , 36, 57, 45, 97, 85, 62};
        Scanner sc= new Scanner(System.in);

        int target; // Element that you want to search
        System.out.print("Enter the number you want to search: ");
        target=sc.nextInt();
        int ans = linearSearch(arr,target,0);

        if(ans == -1){
            System.out.println("Element "+ target +" does not exist in the array");
        }else{
            System.out.println("Element "+ target + " is present at index "+ans);
        }
    }
}
