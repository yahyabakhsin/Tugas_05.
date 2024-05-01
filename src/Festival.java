// Kelas turunan untuk tiket Festival
class Festival extends Tiket {
    // Do your magic here
    @Override
    double getHarga() {
        return 100; // Harga tiket Festival yang tetap
    }
}