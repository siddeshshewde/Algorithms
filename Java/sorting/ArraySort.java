
import java.util.Arrays; 
  
public class SortExample 
{ 
    public static void main(String[] args) 
    { 
        // Our arr contains 8 elements 
        int[] arr = {132, 17, 405, 2, 90, 11, 10}; 
  
        Arrays.sort(arr); 
  
        System.out.printf("Modified arr[] : %s", 
                          Arrays.toString(arr)); 
    } 
} 
