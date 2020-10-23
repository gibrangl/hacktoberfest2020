package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class EditArrayList {
    public static  void main (String [] args) {
        ArrayList Data = new ArrayList();        
        Data.add("Satria Karara ");
        Data.add("F1B016090");
        Data.add("Teknik Elektro");
        Data.add(22);
        Data.add("Sekarbela");
        System.out.println(Data);

        System.out.println("edit data pada array list ");
        System.out.println("silahkan isi data pengganti");
        for (int i = 0; i <= Data.size(); i++) {
            Data.set(i, new Scanner(System.in).nextLine());
        }
        System.out.println("tampilkan data yang sudah di edit ");
        System.out.println(Data);

    }
}
