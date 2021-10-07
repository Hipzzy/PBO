public class Barang {
    public String kode_barang;
    public String nama_barang;
    private int stok;
    
    public Barang(String kode,String nama,int stk){
     kode_barang = kode;
     nama_barang = nama;
     stok = stk;
        
    }
    public int getstok(){
        return stok;
    }
     public void add(int stok){
         this.stok += stok;
    }
}
