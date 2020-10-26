#include<iostream>
using namespace std;
int x;
string nama_barang[7];
float harga[7];
int jumlah[7];
double diskon,hdiskon;
int total_belanja=0,jumlah_item=0,subtotal[7];

main()
{
	cout<<"berapa jenis barang yang anda beli: ";
	cin>>x;
	for(int i=1; i<=x; i++){
		cout<<"\nnama barang ke-"<<i<<" = ";
		cin>>nama_barang[i];
		cout<<"harga barang: ";
		cin>>harga[i];
		cout<<"jumlah barang: ";
		cin>>jumlah[i];
		subtotal[i]=harga[i]*jumlah[i];
		cout<<"subtotal-"<<i<<" : "<<subtotal[i]<<endl;
	}
    for(int i=1; i<=x; i++){
		total_belanja=total_belanja+subtotal[i];
		jumlah_item=jumlah_item+jumlah[i];
	}
	cout<<"\ndiskon(persen) :";
	cin>>diskon;
	hdiskon=diskon/100*total_belanja;
	cout<<"\njumlah item: "<<jumlah_item;
    cout<<"\ntotal belanja= "<<total_belanja;
	cout<<"\npotongan harga ("<<diskon<<" persen) = "<<hdiskon;	
	total_belanja=total_belanja-hdiskon;	
	cout<<"\nHarga yang harus dibayar= "<<total_belanja;	
}
