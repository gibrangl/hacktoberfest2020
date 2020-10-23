/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3algodat;
import java.util.Scanner;
public class js2 {

    private boolean empty, full;
    private int pos;
    private int max_data = 100;
    private int item []= new int [max_data];

    public js2 (){
        full = false;
        empty = true;
        pos=0;
    }

    public boolean isFull (){
        return (full);
    }

    public boolean isEmpty(){
        return (empty);
    }

    public void push(int data){
        if(!isFull()){
            item[pos++] = data;
            empty = false;
            if(pos == max_data) full = true;
            System.out.println("Data sudah ditambahkan");
        }
        else{
            System.out.println("Stack sudah penuh");
        }
        return;
    }

    public int pop(){
        int x = 0;
        if(!isEmpty()){
            x = item[--pos];
            full = false;
            System.out.println("Data yang di POP adalah :" + item[pos]);
            System.out.println("");
            item[pos]=0;
            if(pos==0)empty = true;
            else{
                System.out.println("Stack Kosong!");
            }
        }else{
            System.out.println("Stack Masih Kosong!\n");
        }
        return(x);
    }
    public void Display(){
        System.out.println("Isi Stack Adalah : ");
        for(int i=0; i<pos; i++){
            System.out.print(item[i]+" ");
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        int pilihan;
        int data;
        js2 result = new js2();
        do{
            System.out.println(" alfan suffa pramana");
            System.out.println(" f1b016009 ");
            System.out.println("-------------------------------");
            System.out.println("1. PUSH Item");
            System.out.println("2. POP Item");
            System.out.println("3. Lihat Isi Data");
            System.out.println("0. Keluar");
            Scanner input = new Scanner(System.in);
            System.out.println("Masukkan Pilihan :");
            pilihan = input.nextInt();
            if(pilihan==1){
                System.out.println("Masukan Jumlah data yang ingin dimasukan : ");
                int n = input.nextInt();
                System.out.println("Masukan data : ");
                for (int i=0; i<n; i++){
                    data = input.nextInt();
                    result.push(data);
                }
            }
            else if(pilihan==3){
                result.Display();
            }
            else if(pilihan==2){
                result.pop();
            }
            else if(pilihan==0){
                System.exit(0);
            }
            else{
                System.out.println("Pilihan Tidak Ada!!");
            }
        } while(pilihan!=0);
    }
}

