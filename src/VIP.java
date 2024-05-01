// Kelas turunan untuk tiket VIP
class VIP extends Tiket {
   // Do your magic here
   @Override
   double getHarga() {
      return 150;  // Harga tiket Festival yang tetap
   }
}