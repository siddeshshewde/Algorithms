import java.util.Scanner;

public class LinearSearchUsingIteration {

    public static void main(String[] args) {

        int[] arr={1, 2, 55 , 36, 57, 45, 97, 85, 62};
        Scanner sc= new Scanner(System.in);

        int target; // Element that you want to search
        System.out.print("Enter the number you want to search: ");
        target=sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                System.out.println("Element "+ target + " is present at index "+i);
                System.exit(0);
            }
        }
        System.out.println("Element "+ target +" does not exist in the array");
    }
}
