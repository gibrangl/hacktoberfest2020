package P2J1Dinamis;
import java.util.LinkedList;
import java.util.Scanner;

public class P2J1Dinamis {
    public static void main (String[] args){
        LinkedList<String> linkedList=new LinkedList <>();
        int jumlah, index;

        System.out.println("Masukan jumlah data");
        jumlah = new Scanner(System.in).nextInt();
        System.out.println("isi data ke linkedlist");
        for (int i = 1; i<=jumlah; i++){
            linkedList.add(new Scanner(System.in).nextLine());
        }
        System.out.println("output : " +linkedList+ ", ukuran " +linkedList.size());

        System.out.println("masukan data pertama dan terakhir linked list");
        linkedList.addFirst(new Scanner(System.in).nextLine());
        linkedList.addLast(new Scanner(System.in).nextLine());
        System.out.println("output : " +linkedList+ ", ujuran " +linkedList.size());

        System.out.println("hapus data pertama dan terakhir linkedlist");
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("output : " +linkedList+ ", ujuran " +linkedList.size());

        System.out.println("masukan index yang akan di hapus ");
        index=new Scanner(System.in).nextInt();
        linkedList.remove(index);
        System.out.println("output : " +linkedList+ ", ujuran " +linkedList.size());

    }
}

