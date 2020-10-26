package single;
import java.util.LinkedList;
import java.util.Scanner;

public class Single {
    public static void main(String[] args) 
    {
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner aa = new Scanner(System.in);
        
        String a,b,c,d,e,f,g; 
        
        System.out.print("Data 1 :");
        a=aa.nextLine();
        
        System.out.print("Data 2 :");
        b=aa.nextLine();
        
        System.out.print("Data 3 :");
        c=aa.nextLine();
        
        System.out.print("Data 4 :");
        d=aa.nextLine();
        
        System.out.print("Data 5 :");
        e=aa.nextLine();
        
        System.out.print("Data 6 :");
        f=aa.nextLine();
        
        System.out.print("Data 7 :");
        g=aa.nextLine();
        
        linkedList.add(a);
        linkedList.add(b);
        linkedList.add(c);
        linkedList.add(d);
        linkedList.add(e);
        linkedList.addFirst(f);
        linkedList.addLast(g);
        
        System.out.println("output awal : "+linkedList+", Ukuran : "+linkedList.size());
        linkedList.set(2, "diubah");
        System.out.println("output setelah diubah : "+linkedList+", Ukuran : "+linkedList.size());
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("output setelah dihapus : "+linkedList+", Ukuran : "+linkedList.size());

    }
}
