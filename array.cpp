#include<iostream>
using namespace std;

int main(){
int array[5];

cout<<"Array"<<endl;
for(int a=0; a<5; a++){
cout<<"masukkan nilai ke-"<<a+1<<" :";
cin>>array[a];
cout<<endl;
}
for(int b=0; b<5; b++){
cout<<"nilai ke-"<<b+1<<" adalah :"<<array[b]<<endl;

}
}
