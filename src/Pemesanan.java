// Kelas untuk menyimpan informasi pemesanan tiket
class Pemesanan {
    private String nama;
    private String tahap;
    private Tiket tiket;
    private int jumlah;
    
    // Konstruktor untuk membuat objek Pemesanan dengan informasi yang diberikan
    public Pemesanan(String nama, String tahap, Tiket tiket, int jumlah) {
        this.nama = nama;
        this.tahap = tahap;
        this.tiket = tiket;
        this.jumlah = jumlah;        
    }
    // Metode untuk mencetak nota pemesanan tiket
    public void cetakNota() {
        // Do your magic here
        double totalHarga = tiket.getHarga() * jumlah;

        // Menampilkan nota pemesanan sesuai dengan tahap pembelian
        if (tahap == "Presale"){
            System.out.println("--- Nota Pemesanan ---");
            System.out.println("Nama Pembeli: " + nama);
            System.out.println("Tahap Pembelian: " + tahap);
            System.out.println("Jenis Tiket: " + tiket.getClass().getSimpleName());
            System.out.println("Jumlah Tiket: " + jumlah);
            System.out.println("Total Harga: Rp " + totalHarga * 0.8); // Menampilkan total harga dengan diskon 20% untuk tahap Presale
        } else{
            System.out.println("--- Nota Pemesanan ---");
            System.out.println("Nama Pembeli: " + nama);
            System.out.println("Tahap Pembelian: " + tahap);
            System.out.println("Jenis Tiket: " + tiket.getClass().getSimpleName());
            System.out.println("Jumlah Tiket: " + jumlah);
            System.out.println("Total Harga: Rp " + totalHarga); // Menampilkan total harga tanpa diskon untuk tahap Reguler
        }
    }
}