#include <stdio.h>
#include <stdbool.h>

int arr[50];
int in,n,i,a,j,p;
bool run = true;

int main()
{
    input();
    mergesort(arr,0,n-1);
    display();
    return 0;
}

void input()
{
    printf("Enter size of array \n");
    scanf("%d",&n);
    printf("Enter elements : \n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a);
        arr[i] = a;
    }
    printf("Original Array\n");
    {
        for(i=0;i<n;i++)
        {
            printf("%d ",arr[i]);
        }
    }
    printf("\n\n");
}

void display()
{
    printf("The sorted array is : \n");
    for(i=0;i<n;i++)
    {
        printf("%d ",arr[i]);
    }
    printf("\n\n");
}

void mergesort(int a[],int lo,int hi)
{
    int mid;
    if(lo<hi)
    {
        mid=(lo+hi)/2;
        mergesort(a,lo,mid);
        mergesort(a,mid+1,hi);
        merge(a,lo,mid,mid+1,hi);
  }
}

void merge(int a[],int a1,int b1,int a2,int b2)
{
    int z[50];
    int i,j,k;
    i=a1;
    j=a2;
    k=0;

    while(i<=b1 && j<=b2)
    {
        if(a[i]<a[j])
        {
            z[k++]=a[i++];
        }
        else
        {
            z[k++]=a[j++];
        }
}

    while(i<=b1)
    {
        z[k++]=a[i++];
    }

    while(j<=b2)
    {
        z[k++]=a[j++];
    }

    for(i=a1,j=0;i<=b2;i++,j++)
    {
        a[i]=z[j];
    }


}


