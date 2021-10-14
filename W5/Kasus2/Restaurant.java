public class Restaurant {
    private Makanan menuMakanan;
	private static byte idMenu = 0;
	
	public Restaurant() {
		menuMakanan = new Makanan();
	}

	public void tambahMenuMakanan(String nama, double harga, int stok) {
		menuMakanan.setHargaMakanan(harga, idMenu);
		menuMakanan.setNamaMakanan(nama, idMenu);
		menuMakanan.setStok(stok, idMenu);
		idMenu++;
	}

	public void tampilMenuMakanan(){
		for(byte i =0; i<=idMenu;i++){
			if(!isOutOfStock(i)){
				System.out.println(menuMakanan.getNamaMakanan(i) +"["+ menuMakanan.getStok(i) +"]"+"\tRp. "+ menuMakanan.getHargaMakanan(i));
			}
		}
	}

	public boolean isOutOfStock(byte id){
		if(menuMakanan.getStok(id) == 0){
			return true;
		}else{
			return false;
		}
	}

	public void pesanMenuMakanan(int idMenu, int jumlah) {
		byte id = (byte) idMenu;
		if(jumlah < 0)
			System.out.println("Input jumlah makanan salah");
		if((menuMakanan.getStok(id) - jumlah) < 0 )
			System.out.println("Mohon maaf stok tidak mencukupi");
		else {
			System.out.println("Anda Memesan " + menuMakanan.getNamaMakanan(id) + " sebanyak " + jumlah);
			System.out.println("Total Harga adalah Rp." + menuMakanan.getHargaMakanan(id)*jumlah);
			menuMakanan.removeStok(id, jumlah);
			System.out.println("----------------------");
		}
	}
    }
    
/*public class Restaurant {
    public String[] nama_makanan;
    public double[] harga_makanan;
    public int[] stok;
    public static byte id=0;

    public Restaurant() {
    nama_makanan = new String[10];
    harga_makanan = new double[10];
    stok = new int[10];
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
    this.nama_makanan[id] = nama;
    this.harga_makanan[id] = harga;
    this.stok[id] = stok;
    }

    public void tampilMenuMakanan(){
        for(int i =0; i<=id;i++){
            if(!isOutOfStock(i)){
                System.out.println(nama_makanan[i] +"["+stok[i]+"]"+"\tRp. "+harga_makanan[i]);
            }
        }
    }


    public boolean isOutOfStock(int id){
        if(stok[id] == 0){
            return true;
        }else{
            return false;
        }
    }

    public static void nextId(){
        id++;
    }
}
*/
