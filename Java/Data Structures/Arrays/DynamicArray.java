/**
 * Dynamic Array using Java
 *
 * @author  Hrithik Sawant
 */
package algorithms;

import java.util.Scanner;

@SuppressWarnings("unchecked")
public class DynamicArray<T> implements Iterable<T> {

    private T[] arr;
    private static int len = 0; // length user thinks array is
    private int capacity = 0; // Actual array size
    static Scanner sc = new Scanner(System.in);

    public DynamicArray() {
        this(16);
    }

    /**
     * This method is used set capacity
     *
     * @param capacity This is the first parameter.
     */
    public DynamicArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + capacity);
        }
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
    }

    // size of an array;
    public int size() {
        return len;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public T get(int index) {
        if (index >= len || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return arr[index];
    }

    public void set(int index, T elem) {
        if (index >= len || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        arr[index] = elem;
    }

    public void clear() {
        for (int i = 0; i < len; i++) {
            arr[i] = null;
        }
        len = 0;
    }

    public void add(T elem) {

        // Time to resize!
        if (len + 1 >= capacity) {
            if (capacity == 0) {
                capacity = 1;
            } else {
                capacity *= 2; // double the size
            }
            T[] new_arr = (T[]) new Object[capacity];
            for (int i = 0; i < len; i++) {
                new_arr[i] = arr[i];
            }
            arr = new_arr; // arr has extra nulls padded
        }

        arr[len++] = elem;
    }

    // Removes an element at the specified index in this array.
    public T removeAt(int rm_index) {
        if (rm_index >= len || rm_index < 0) {
            throw new IndexOutOfBoundsException();
        }
        T data = arr[rm_index];
        T[] new_arr = (T[]) new Object[len - 1];
        for (int i = 0, j = 0; i < len; i++, j++) {
            if (i == rm_index) {
                j--; // Skip over rm_index by fixing j temporarily
            } else {
                new_arr[j] = arr[i];
            }
        }
        arr = new_arr;
        capacity = --len;
        return data;
    }

    public boolean remove(Object obj) {
        int index = indexOf(obj);
        if (index == -1) {
            return false;
        }
        removeAt(index);
        return true;
    }

    public int indexOf(Object obj) {
        for (int i = 0; i < len; i++) {
            if (obj == null) {
                if (arr[i] == null) {
                    return i;
                }
            } else {
                if (obj.equals(arr[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    // Iterator is still fast but not as fast as iterative for loop
    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < len;
            }

            @Override
            public T next() {
                return arr[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public String toString() {
        if (len == 0) {
            return "[]";
        } else {
            StringBuilder sb = new StringBuilder(len).append("[");
            for (int i = 0; i < len - 1; i++) {
                sb.append(arr[i]).append(", ");
            }
            return sb.append(arr[len - 1]).append("]").toString();
        }
    }

    public static boolean checkBounds(int num) {
        boolean f = true;
        if (num >= len || num < 0) {
            System.out.println("IndexOutOfBound, Please Enter Correct Index no\n\n");
            f = false;
        }
        return f;
    }

    public static void main(String[] args) {

        //Test
        DynamicArray DA = new DynamicArray();
        while (true) {
            int Index;
            System.out.println("Enter a choice:");
            System.out.println("1. Add an Element to the Array.");
            System.out.println("2. Remove Index Element from Array.");
            System.out.println("3. Print all the Elements from Array.");
            System.out.println("4. Check the Array is Empty or Not.");
            System.out.println("5. Get Index Element.");
            System.out.println("6. Clear all Element of Array.");
            System.out.println("7. Exit.");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter an Element ");
                    DA.add(sc.next());
                    System.out.println("Element Added Successfully\n\n");
                    break;
                case 2:
                    System.out.println("\n\nEnter Index No. to remove");
                    Index = sc.nextInt();
                    if (checkBounds(Index)) {
                        DA.removeAt(Index);
                        System.out.println("Element Removed Successfully\n\n");
                    }
                    break;
                case 3:
                    System.out.println(DA);
                    System.out.println("Print Successfully\n\n");
                    break;
                case 4:
                    System.out.println(DA.isEmpty() + "\n\n");
                    break;
                case 5:
                    System.out.println("Enter Index No. :");
                    Index = sc.nextInt();
                    if (checkBounds(Index)) {
                        System.out.println("Index " + Index + " is " + DA.get(Index) + "\n\n");
                    }
                    break;
                case 6:
                    DA.clear();
                    System.out.println("Cleared All Element Successfully\n\n");
                    break;
                case 7:
                    System.out.println("Exiting the Application.");
                    System.exit(0);
                default:
                    System.out.println("Enter a correct option.");
            }
        }

    }
}
