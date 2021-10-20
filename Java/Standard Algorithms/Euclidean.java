/* GCD of two numbers is the largest number that divides both of them.*/



import java.util.*;

public class Euclidean
{
    
    public static int gcd(int a, int b)
    {
        if (a == 0)
            return b;

          //If we subtract a smaller number from a larger, GCD of the two numbers doesn’t change

        return gcd(b%a, a);

        // In place of subtraction if we perform division, the result will be returned when we find remainder 0.
    }
  

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        int answer=gcd(a,b);
        System.out.println("The GCD of "+a+" and "+b+" is "+answer.);
  
    }
}
