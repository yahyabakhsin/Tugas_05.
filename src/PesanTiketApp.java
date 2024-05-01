import java.util.Scanner;

public class PesanTiketApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Menampilkan pesan selamat datang kepada pengguna :)
        System.out.println("Selamat datang di program pemesanan tiket!");

        // Meminta nama pembeli
        System.out.print("Masukan nama pembeli: ");
        String nama = scanner.nextLine();

        // Memilih tahap pembelian
        System.out.println("\nPilih tahap pembelian: ");
        System.out.println("1. Presale");
        System.out.println("2. Reguler");
        System.out.print("Pilih tahap pembeli (1/2): ");
        int tahap = scanner.nextInt();
        scanner.nextLine();

        // Memproses tahap pembelian yang dipilih
        if (tahap == 1 || tahap == 2) {
            // Menentukan apakah tahap pembelian adalah Presale atau Reguler
            String tahapPembelian = (tahap == 1) ? "Presale" : "Reguler";

             // Menampilkan pilihan jenis tiket sesuai dengan tahap pembelian
            System.out.println("\nPilih jenis tiket: ");
            if (tahap == 1) {
                System.out.println("1. VIP");
                System.out.println("2. VVIP");
            } else {
                System.out.println("1. Festival");
                System.out.println("2. VIP");
                System.out.println("3. VVIP");
            }

            // Meminta input jenis tiket
            System.out.print("Pilih jenis tiket (1/2/3): ");
            int jenisTiket = scanner.nextInt();
            scanner.nextLine();

            // Memproses jenis tiket yang dipilih pengguna
            Tiket tiket = null;
            int hargaTiket = 0;

            if ((tahap == 1 && (jenisTiket == 1 || jenisTiket == 2)) ||
                (tahap == 2 && (jenisTiket >= 1 && jenisTiket <= 3))) {

                // Meminta input jumlah tiket yang ingin dibeli
                int jumlahTiket;
                System.out.print("\nMasukan jumlah tiket yang ingin dibeli: ");
                jumlahTiket = scanner.nextInt();
                
                // Membuat objek tiket sesuai dengan pilihan jenis tiket
                switch (jenisTiket) {
                    case 1:
                        if (tahap == 1) {
                            tiket = new VIP();
                        } else {
                            tiket = new Festival();
                        }
                        break;
                    case 2:
                        tiket = new VIP();
                        break;
                    case 3:
                        tiket = new VVIP();
                        break;
                    default:
                        break;
                }

                // Membuat objek pemesanan tiket dan mencetak nota
                if (tiket != null) {
                    Pemesanan pemesanan = new Pemesanan(nama, tahapPembelian, tiket, jumlahTiket);
                    pemesanan.cetakNota();
                }
            // Menampilkan pesan kesalahan jika input tidak valid
            } else {
                System.out.println("\nInput tidak valid!");
            }
            
            scanner.close();
        }   
    }
}
