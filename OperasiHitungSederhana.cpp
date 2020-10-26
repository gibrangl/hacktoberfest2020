#include<iostream>
using namespace std;
int main()
{

float panjang,lebar,kali,bagi,jumlah,kurang;

cout<<"Operasi Hitung Sederhana\n";

cout<<"\tPanjang = "<<panjang<<endl;
cout<<"\tLebar   = "<<lebar<<endl;

cout<<"\t=>Operasi Penjumlahan : \n";
cout<<"\t\tJumlah = Panjang + Lebar\n";
jumlah = panjang + lebar; 
cout<<"\t\tJumlah =  "<<jumlah<<" cm"<<endl;

cout<<"\t=>Operasi Pengurangan : \n";
cout<<"\t\tKurang = Panjang - Lebar\n";
kurang = panjang - lebar; 
cout<<"\t\tKurang = "<<kurang<<" cm"<<endl;

cout<<"\t=>Operasi Pembagian : \n";
cout<<"\t\tBagi = Panjang / Lebar\n";
bagi = panjang / lebar; 
cout<<"\t\tBagi = "<<bagi<<" cm"<<endl;

cout<<"\t=>Operasi Perkalian \n";
cout<<"\t\tJumlah = Panjang x Lebar\n";
kali = panjang * lebar; 
cout<<"\t\tJumlah = "<<kali<<" cm"<<endl;

return 0;
}
