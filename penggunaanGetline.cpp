// penggunaan getline()

#include <iostream>
#include <string>

using namespace std;

int main ()
{
	string szPenampung;
	
	cout << " masukkan sembarang input : ";
	getline(cin, szPenampung); //penggunaan perintah getline()
	cout << "\nhasil output dari getline () adalah : "
		 << szPenampung << endl << endl; // hasil output perintah getline ()
		 
	cout << "masukkan sembarang input : ";
	cin >> szPenampung; // penggunaan perintah cin
	cout << "\nhasil output dari cin adalah : "
	     << szPenampung << endl << endl; // hasil output perintah cin
	     
	system ("PAUSE");
	return 0;
}