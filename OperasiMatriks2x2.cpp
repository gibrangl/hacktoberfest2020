#include <iostream>
#include <conio.h>
#include <iomanip>
using namespace std;

void input(float *p){
for(int i=0; i<4; i++)
  {
     cout<<" Masukkan nilai ke - "<<(i+1)<<" = ";
     cin>>*(p+i);
  }
}
void output(float *p){
   cout<<"\t+-       -+\n";
   cout<<"\t| "<<setiosflags(ios::left)<<setw(2)<<*(p+0);
   cout<<setiosflags(ios::right)<<setw(5)<<*(p+1)<<" |\n";
   cout<<"\t|         |\n";
   cout<<"\t| "<<setiosflags(ios::left)<<setw(2)<<*(p+2);
   cout<<setiosflags(ios::right)<<setw(5)<<*(p+3)<<" |\n";
   cout<<"\t+-       -+\n";
   cout<<"\n =================================\n\n";
}
void tambah(float *x, float *y, float *z){
for(int i=0; i<4; i++)
   *(z+i) = *(x+i) + *(y+i);
}
void kurang(float *x, float *y, float *z){
for(int i=0; i<4; i++)
   *(z+i) = *(x+i) - *(y+i);
}
void kali(float *x, float *y, float *z){
   *(z+0) = (*(x+0)**(y+0)) + (*(x+1)**(y+2));
   *(z+1) = (*(x+0)**(y+1)) + (*(x+1)**(y+3));
   *(z+2) = (*(x+2)**(y+0)) + (*(x+3)**(y+2));
   *(z+3) = (*(x+2)**(y+1)) + (*(x+3)**(y+3));
}
main(){
   char kembali;
   int pilih;
   float MA[4];
   float MB[4];
   float MC[4];
   float *a = MA;
   float *b = MB;
   float *c = MC;
   do
   {
      system("cls");
	  cout<<"\n\t Kalkulator Matrik Ordo 2 x 2\n\n";
      cout<<"   Pilih Operasi\n\n";
      cout<<" [1] Penjumlahan\n [2] Pengurangan\n [3] Perkalian\n\n";
      cout<<" Pilihan : ";cin>>pilih;
      switch(pilih)
      {
	case 1:
	system("cls");
            cout<<"\n Penjumlahan Matrik A + Matrik B\n\n";
            cout<<" Matriks A:\n";
	input(a);
            cout<<"\n\tMatriks A:\n";
            output(a);
            cout<<" Matriks B:\n";
	input(b);
            cout<<"\n\tMatriks B:\n";
            output(b);
            tambah(a,b,c);
            cout<<"\t   Hasil Penjumlahan\n\n";
            output(c);
getch();
            break;
         case 2:
	system("cls");
            cout<<"\n Pengurangan Matrik A - Matrik B\n\n";
            cout<<" Matriks A:\n";
	input(a);
            cout<<"\n\tMatriks A:\n";
            output(a);
            cout<<" Matriks B:\n";
	input(b);
            cout<<"\n\tMatriks B:\n";
            output(b);
            kurang(a,b,c);
            cout<<"\t   Hasil Pengurangan\n\n";
output(c);
getch();
            break;
         case 3:
            system("cls");
            cout<<"\n Perkalian Matrik A x Matrik B\n\n";
            cout<<" Matriks A:\n";
	input(a);
            cout<<"\n\tMatriks A\n";
            output(a);
            cout<<" Matriks B:\n";
	input(b);
            cout<<"\n\tMatriks B\n";
            output(b);
            kali(a,b,c);
            cout<<"\t   Hasil Perkalian\n\n";
            output(c);
getch();
            break;
      }
      cout<<" Apakah Anda ingin kembali [Y/N] ";
      cin>>kembali;
}while(kembali=='Y' || kembali=='y');
}		
