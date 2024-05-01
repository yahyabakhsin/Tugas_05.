// Kelas turunan untuk tiket VVIP
class VVIP extends Tiket {
    // Do your magic here
    @Override
    double getHarga(){
        return 200;  // Harga tiket Festival yang tetap
    }
}