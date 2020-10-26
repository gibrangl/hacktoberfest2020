package pkgdouble;
import java.util.LinkedList;
import java.util.Scanner;

public class Double {

    
    public static void main(String[] args) 
    {
        doublelinkedlist list = new doublelinkedlist();
        
        Scanner in = new Scanner(System.in);
        System.out.println("MENU\n1.Tambah Data Awal\n2.Tambah Data Akhir\n3.Hapus data Awal\n"
                + "4.Hapus data Akhir\n5.Hapus Data pada Indeks\n6.Input data di indeks tertentu\n7.EXIT");
        System.out.print("Pilih Menu :");
        
        int pilih = in.nextInt();
        
        while(pilih!=7){
            if (pilih==1){
                Scanner inp1=new Scanner(System.in);
                System.out.print("Masukan Data :");
                int add = inp1.nextInt();
                list.insert_dari_Awal(add);
                list.tampil_ahir_awal();
                System.out.print("Pilih Menu :");
                pilih = in.nextInt();
            }
            else if(pilih==2){
                Scanner inp2=new Scanner(System.in);
                System.out.print("Masukan Data :");
                int add = inp2.nextInt();
                list.insert_dari_ahir(add);
                list.tampil_ahir_awal();
                System.out.print("Pilih Menu :");
                pilih = in.nextInt();
                
            }
            else if(pilih==3){
                list.hapus_data_awal();
                list.tampil_ahir_awal();
                System.out.print("Pilih Menu :");
                pilih = in.nextInt();
            }
            else if(pilih==4){
                
                list.hapus_data_ahir();
                list.tampil_ahir_awal();
                System.out.print("Pilih Menu :");
                pilih = in.nextInt();
                
               
                
            }
            else if (pilih==5){
                Scanner inp4 = new Scanner(System.in);
                System.out.print("Masukan Indeks yang akan di hapus : ");
                int indeks=inp4.nextInt();
                list.hapus_key(indeks);
                list.tampil_ahir_awal();
                System.out.print("Pilih Menu :");
                pilih = in.nextInt();
            }
            else if (pilih==6){
                Scanner inp5 = new Scanner(System.in);
                System.out.print("Masukan Indeks yang akan ditambahkan : ");
                int indeks=inp5.nextInt();
                list.hapus_key(indeks);
                list.tampil_ahir_awal();
                System.out.print("Pilih Menu :");
                pilih = in.nextInt();
            }
            
            else {
                System.out.println("Yang anda inputkan Salah");
                System.out.print("Pilih Menu :");
                pilih = in.nextInt();
            }
        }
        
    }
    
}
