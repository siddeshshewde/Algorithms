#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int stack[100],n=100,top=-1;

void search_elem(int val){
    cout<<"Element is: "<<stack[val]<<endl<<"found at: "<<val<<"index"<<endl;
}

string search(int val){
    for (int i=top;i>=0;i--){
        if(stack[i]==val){
            search_elem(i);
            return "True"; 
        }
    }
}

void peek(){
    cout<< "Peek element in the stack: "<<stack[top]<<endl;
}

void push(int val){
    if(top>=n-1){
        cout<<"Stack Overflow"<<endl;
    }
    else{
        top++;
        stack[top]=val;
    }
}

void pop(){
    if(top<=-1){
        cout<<"Stack underflow"<<endl;
    }
    else{
        cout<<"The popped element is: "<<stack[top]<<endl;
        top--;
    }
}

void display(){
    if(top>=0){
        cout<<"Stack elements are: ";
        for(int i=top;i>=0;i--){
            cout<<stack[i]<<" ";
            cout<<endl;
        }
    }
    else cout<<"Stack is empty"<<endl;

}

int main(int argc, const char** argv) {

    int ch,val;
    cout << "1) Push in stack"<<endl;
    cout << "2) Pop from stack"<<endl;
    cout << "3) Peek into stack"<<endl;
    cout << "4) Search in stack"<<endl;
    cout << "5) Display stack"<<endl;
    cout << "6) Exit"<<endl;

    do{
        cout<<"Enter choice: " << endl;
        cin>>ch;
        switch(ch){
            case 1:{
                cout << "Enter value to be push: "<<endl;
                cin >> val;
                push(val);
                break;
            }
            case 2:{
                pop();
                break;
            }
            case 3:{
                peek();
                break;
            }
            case 4:{
                cout << "Enter value to be search: "<<endl;
                cin >> val;
                string s = search(val);
                if(s!="True"){
                    cout<<"Element is not found in the stack"<<endl;
                }
                break;
            }
            case 5:{
                display();
                break;
            }
            case 6:{
                cout << "Exit......"<<endl;
                break;
            }
            default:{
                cout << "Invalid Choice"<<endl;

            }

        }
    }while(ch!=6);

    return 0;
}