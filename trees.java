package p8j5;

import java.util.Scanner;

public class Latihan5 {
    class node {
        int key;
        node left, right;

        public node(int item)
        {
            key=item;
            left=right=null;
        }
    }

    node root;

    Latihan5()
    {
        root=null;
    }

    void deleteKey(int key){
        root= deleteRec(root, key);
    }

    node deleteRec(node root, int key)
    {
        if (root== null)
            return root;
        if (key<root.key)
            root.left = deleteRec(root.left,key);
        else if (key>root.key)
            root.right=deleteRec(root.right,key);
        else
        {
            if (root.left==null)
                return root.right;
            else if (root.right==null)
                return root.left;

            root.key = minValue(root.right);
            root.right=deleteRec(root.right, root.key);
        }
        return root;
    }

    int minValue (node root){
        int minv= root.key;
        while (root.left != null)
        {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    void insert (int key)
    {
        root = insertRec(root, key);
    }

    node insertRec (node root, int key)
    {
        if (root==null)
        {
            root=new node(key);
            return root;
        }

        if (key<root.key)
            root.left=insertRec(root.left,key);
        else if (key<root.key)
            root.right=insertRec(root.right, key);

        return root;
    }

    void inorder()
    {
        inorderRec(root);
    }

    void inorderRec(node root)
    {
        if (root != null)
        {
            inorderRec(root.left);
            System.out.println(root.key+" ");
            inorderRec(root.right);
        }
    }

    public static void main (String[] args){
        Latihan5 tree= new Latihan5();
        int pilihan;
        Scanner in= new Scanner(System.in);
        do {
            System.out.println("Masukan Pilihan Menu");
            System.out.println("1. Masukan Data");
            System.out.println("2. Hapus Data");
            System.out.println("0. Keluar");
            pilihan = in.nextInt();
            if (pilihan == 1) {
                int n;
                System.out.println("masukan jumlah data yang di inginkan");
                n = in.nextInt();
                System.out.println("silahkan masukan data");
                for (int i = 1; i <= n; i++) {
                    tree.insert(in.nextInt());
                }
                System.out.println("Data tree");
                tree.inorder();

            } else if (pilihan == 2) {
                int z;
                System.out.println("Masukan Jumlah data yang ingin di hapus");
                z = in.nextInt();
                System.out.println("masukan nilai data yang ingin dihapus");
                for (int i = 1; i <= z; i++) {
                    tree.deleteKey(in.nextInt());
                }
                System.out.println("Data tree terbaru");
                tree.inorder();
            }
        } while(pilihan!=0);
    }
}

