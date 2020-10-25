#include<iostream>
using namespace std;
int main()
{
float panjang,lebar;
double luas;
cout<<"1. Menghitung Luas Persegi Panjang\n";
cout<<"Masukkan Nilai Panjang : ";
cin>>panjang;
cout<<"Masukkan Nilai Lebar   : ";
cin>>lebar;
cout<<"\tLuas Persegi Panjang = Nilai Panjang x Nilai Lebar ";
cout<<"\n\tLuas Persegi Panjang = "<<panjang<<" x "<<lebar;
luas=panjang*lebar;
cout<<"\n\tLuas Persegi Panjang = "<<luas<<" cm^2"<<endl;
return 0;
}
