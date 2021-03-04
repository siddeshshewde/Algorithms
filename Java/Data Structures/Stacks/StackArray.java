import java.util.Scanner;

public class Stack
{
    final int MAX = 1000; 
    int top = -1;
    int stackList[] = new int [top+1];
    static Scanner input = new Scanner(System.in);

    // Adding an Element to the Stack
    public void push()
    {
        System.out.print("Enter an Element to be added: ");
        int element = input.nextInt();

        int newStackList[] = new int [top+2];

        if (top == MAX)
        {
            System.out.println("Stack is Full!");
            return;
        }
        else if (top == -1)
        {
            top += 1;
        }
        else
        {
            for (int i = 0 ; i <= top ; i++)
            {
                newStackList[i] = stackList[i];
            }  
            top += 1;
        }          
        stackList = newStackList;
        stackList[top] = element;
        System.out.println ("Element added to the Stack: " + element);
    }

    // Removing an Element from the Stack.
    public void pop()
    {
        if (top == -1)
        {
            System.out.println("Stack is already Empty.");
            return;
        }
        if (top == 0)
        {
            System.out.println("Element removed from Stack: " + stackList[top]);
            top = -1;
            return;
        }

        int newStackList[] = new int[top];

        for (int i = 0 ; i < top ; i++)
        {
            newStackList[i] = stackList[i];
        }

        stackList = newStackList;
        top -= 1;
    }

    // Returning the Top Element from the Stack.
    public void peek()
    {
        if (top == -1)
        {
            System.out.println ("Stack is Empty!");
            return;
        }
        System.out.println("Top Element: " + stackList[top]);
    }

    // Returning all the Elements from the Stack.
    public void printElements()
    {
        System.out.print ("Elements in the Stack: ");
        for (int i = 0 ; i <= top ; i++)
        {
            System.out.print(stackList[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        Stack s = new Stack();
        while (true)
        {
            System.out.println("Enter a choice:");
            System.out.println("1. Add an Element to the Stack.");
            System.out.println("2. Delete an Element from the Stack.");
            System.out.println("3. Print all the Elements from Stack.");
            System.out.println("4. Check the top Element of the Stack.");
            System.out.println("5. Exit.");

            int choice = input.nextInt();
            switch (choice)
            {
                case 1: 
                    s.push(); 
                    break;
                case 2: 
                    s.pop();  
                    break;
                case 3:
                    s.printElements();
                    break;
                case 4:
                    s.peek();
                    break;
                case 5:
                    System.out.println("Exiting the Application.");
                    System.exit(0);
                default:
                    System.out.println("Enter a correct option.");
            }
        }
    }
}