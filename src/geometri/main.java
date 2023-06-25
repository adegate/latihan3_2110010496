package geometri;

public class main {
    public static void main(String[] args) {
       lingkaran jumlah1 = new lingkaran(3);
    System.out.println("-- Lingkaran --");
    System.out.println("Hasil luas Lingkaran = " + jumlah1.luasLingkaran());
    System.out.println("Hasil Keliling Lingkaran = " + jumlah1.kelilingLingkaran());
    
    persegiPanjang jumlah2 = new persegiPanjang(15,5);
    System.out.println("\n -- Persegi Panjang --");
    System.out.println("Hasil luas Persegi Panjang = " + jumlah2.luasPersegi());
    System.out.println("Hasil Keliling Persegi Panjang = " + jumlah2.kelilingPersegi()); 
    }
}
