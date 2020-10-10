#include<bits/stdc++.h>
#include<iostream>
using namespace std;

int main(){
	
    int n;
    cout<<"Enter the number of element you want to sort : ";
    cin>>n;
    
    int array[n],i,j;
    
    cout<<"\nEnter all the array values:\n";

    for(i=0 ; i<n ; i++){ //Gets user input values for the elements of the array
    	
        cin>>array[i];
    }
	
	//BUBBLE SORTING ALGORITHM
	
    for(i=0;i<n-1;i++){
    	
        for(j=0;j<n-i-1;j++){

            if(array[j]>array[j+1]){

                int temp=array[j]; //Swapping elements in the array
                array[j]=array[j+1];
                array[j+1]=temp;
            }
        }
    }
    
    cout<<"\nSorted elements using the bubble sort :\n";
    for(i=0;i<n;i++){
    	cout<<array[i]<<" ";
	}
    
    return 0;
}
