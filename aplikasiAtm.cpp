#include <iostream>
#include <stdlib.h>
#include <conio.h>
#include <string>
using namespace std;

main(){
	system("cls");
	int pin,menu,pilihan,awal;
	double transfer,tarik, setor;
	string rekening;
	char a;
	int saldo=1000000;
	
	awal:
	cout<<"==========Simulasi Mesin ATM==========\n\n";
	cout<<"masukkan pin Anda : ";
	cin>>pin;
	system("cls");
	if (pin==160015){
		system("cls");
			menu:
		cout<<"==========Simulasi Mesin ATM==========\n\n";
		cout<<"Selamat Datang\nSilahkan masukkan pilihan:";
		cout<<"\n\n1. Cek Saldo\n2. Setoran\n3. Transfer";
		cout<<"\n\nmasukkan pilihan Anda : ";
		cin>>menu;
		switch(menu){
		case 1:
			system("cls");
			cout<<"==========Simulasi Mesin ATM=========\n\n";
			cout<<"Jumlah saldo Anda sebesar:\nRp."<<saldo;
			break;
		case 2:
			system("cls");
			cout<<"==========Simulasi Mesin ATM=========\n\n";
			cout<<"Masukkan jumlah uang yang ingin disetor:\n";
			cin>>setor;
			cout<<"\nAnda melakukan penyetoran sebesar: Rp. " << setor;
			cout<<"\nJumlah saldo anda sebelumnya sebesar: Rp. "<< saldo;
			saldo=saldo+setor;
			cout<<"\nJumlah Saldo Anda menjadi: Rp. " << saldo;
			break;
		case 3:
			system("cls");
			cout<<"==========Simulasi Mesin ATM==========\n\n";
			cout<<"Masukkan jumlah uang yang ingin ditransfer:\n";
			cin>>transfer;
			cout<<"\nMasukkan nomor rekening penerima:\n ";
			cin>>rekening;
			cout<<"\nTransfer ke nomor rekening ( "<<rekening<< " )\n";
			cout<<"dengan jumlah sebesar Rp. "<< transfer;
			cout<<"\ntelah berhasil dilakukan.\n\n";
			 saldo=saldo-transfer;
			cout<< "Sisa Saldo Anda sebesar: Rp. "<<saldo;  
			break;
		}
		cout<<"\n\nApakah Anda ingin melanjutkan transaksi? (y/n)"<<endl;
		cin>>a;
		if(a=='y'||a=='Y'){
			system("cls");
			goto menu;
			}
			else if (a=='n'||a=='N'){
				cout<<"\nTerima kasih telah menggunakan ATM kami";		
		}
	}
		else{
			cout<<"PIN Anda Salah, coba lagi!\n\n";
			goto awal;			
			}
		}
