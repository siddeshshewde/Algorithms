// c program to perform selection sort on a given array

void swap(int *x, int *y) 
{ 
	int temp = *x; 
	*x = *y; 
	*y = temp;
} 

// sort the given array using selection sort
void selection_sort(int arr[], int size) 
{ 
    int i, j, min; 
  
    // One by one move boundary of unsorted subarray 
    for (i = 0; i < size; i++) 
    { 
        // Find the minimum element in unsorted array 
        min = i; 
        for (j = i+1; j < size; j++) 
          if (arr[j] < arr[min]) 
            min = j; 
        print_array(arr, size);
  
        // Swap the found minimum element with the first element 
        swap(&arr[min], &arr[i]); 
    } 
} 

// print the given array of given size
void print_array(int arr[], int size) 
{ 
	int i; 
	for (i=0; i < size; i++) 
		printf("%d ", arr[i]); 
	printf("\n"); 
} 

// Driver program to test above functions 
int main() 
{ 
    int size;
    int choice;
    inp:
    printf("Enter the size of array:\n");
    scanf("%d", &size);
    int arr[size];
    for (int i = 0; i < size; i++)
    {
        printf("Enter the element at position %d in the array: ", i+1);
        scanf("%d", &arr[i]);
    }
    printf("The array you entered is:\n");
    print_array(arr, size);
    
    selection_sort(arr, size);
    printf("The sorted array is:");
    print_array(arr, size);   
	return 0; 
} 
