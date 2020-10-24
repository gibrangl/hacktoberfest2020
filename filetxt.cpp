#include <iostream>
#include <fstream>
using namespace std;
 int main()
 {
char nama_mk [20];
char kode_mk[13];
int ulang;
ofstream matkul;
matkul.open("matkul.txt",ios::in);
cout<<"input jumlah mata kuliah :";
cin>>ulang;
for (int i=1; i<=ulang; i++) 
{
cout<<"Nama Mata Kuliah   : ";
cin>>nama_mk;
cout<<"Kode Mata Kuliah   : ";
cin>>kode_mk;
matkul<<"NAMA MATA KULIAH       :"<<nama_mk<<endl;
matkul<<"KODE MATA KULIAH       :"<<kode_mk<<endl; 
}
matkul.close();
}
