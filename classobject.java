class Mobil {
    String warna;
    int tahun;
    String merek;
}

class object {
    public static void main(String[]args) {

        Mobil G8 = new Mobil();
        Mobil Jazz = new Mobil();

        G8.warna = "Yellow";
        G8.tahun = 2012;
        G8.merek = "Audi";
        Jazz.warna = "red";
        Jazz.tahun = 2007;
        Jazz.merek = "Honda";
        //menampilkan
        System.out.println("G8");
        System.out.println("warna    :" +G8.warna);
        System.out.println("tahun    :" +G8.tahun);
        System.out.println("merek    :" +G8.merek);
        System.out.println("");
        System.out.println("Jazz");
        System.out.println("warna    :" +Jazz.warna);
        System.out.println("tahun    :" +Jazz.tahun);
        System.out.println("merek    :" +Jazz.merek);
    }
}
