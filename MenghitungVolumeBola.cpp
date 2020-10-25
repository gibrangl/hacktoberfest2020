#include<iostream>
using namespace std;
int main()
{
const float phi = 3.14;
float jari;
double volume;

cout<<"Menghitung Volume Bola\n";

cout<<"\tMasukkan Panjang Jari-jari Bola : ";
cin>>jari;
volume = ((4 / 3) * (phi * (jari*jari*jari)));
cout<<"\tVolume = ((4 / 3) * (phi * (jari-jari^3)))\n";
cout<<"\tVolume = "<<volume<<" cm^3";
return 0;
}
