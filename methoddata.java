public class Hewan {
    //membuat atribut array
    String[] arrHewan = {"anjing","kucing","ayam"}; 

    //method
    void namaHewan(){
        for(int x=0;x<=2;x++)
            System.out.println(arrHewan[x]);
    }

    public static void main (String [] args){
        System.out.println("Nama - nama Hewan :");

        Hewan ob = new Hewan();//membuat objek dari kelas Hewan
        ob.namaHewan();
    }
}
