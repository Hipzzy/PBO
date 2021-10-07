public class KelasDua{
static {
System.out.println(5);
}

public static void main(String[] args)
{
    System.out.println(6); // ini pertama karena berada pada paling pertama untuk di eksekusi
        Kelas1 satu = new Kelas1();//ini kedua karena memanggil salah satu fungsi yang berada pada class kelas1
        Kelas1 dua = new Kelas1(10);//ini ketiga 
}
}
