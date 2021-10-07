public class Iventori {
    Barang[] barangs;
    
    void iniBarang(){
        barangs = new Barang[2];
        
        barangs[0] = new Barang("001", "Baju",10);
        barangs[1] = new Barang("002", "Celana",20);
    }
    
    void showBarang(){
        System.out.println(barangs[0].nama_barang + "("+ barangs[0].getstok() + ")");
        System.out.println(barangs[1].nama_barang + "("+ barangs[1].getstok() + ")");
    }
    
    void pengadaan(){
        iniBarang();
        barangs[0].add(10);
        barangs[1].add(20);
        
        showBarang();
        
    }
    public static void main(String[]args){
        Iventori beli = new Iventori();
        beli.pengadaan();
    }
}
