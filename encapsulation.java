package modul5;

public class js2 {
    public String nama;
    public String nim;
    public int umur;
    public void setmethod(String nama,String nim,int umur) {
        this.nama = nama;
        this.nim=nim;
        this.umur=umur;
    }
    public String getNama() {
        return this.nama;
    }
    public String getnim() {
        return this.nim;
    }
    public int getumur() {
        return this.umur;
}
    public static void main(String[] args) {
        js2 ob=new js2(); ob.setmethod("Mohamad Nurul Ihsan","F1B016060",21);
  System.out.println("Nama :"+ob.getNama());
  System.out.println("Nim  :"+ob.getnim());
 System.out.println("Umur :"+ob.getumur());
    }}
