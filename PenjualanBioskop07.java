import java.util.Scanner;

public class PenjualanBioskop07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket;
        int hargaTiket = 50000;
        int totalHarga;
        int totalPendapatanSehari = 0;
        double diskon4Tiket = 0.1;
        double diskon10Tiket = 0.15;
        String namaPelanggan;

         do {
            System.out.print("Masukkan nama pelanggan (ketik 'selesai' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("selesai")) {
                System.out.println("Rekap penjualan hari ini");
                break;
            }

            System.out.print("Masukkan jumlah pembelian tiket: ");
            jumlahTiket = sc.nextInt();
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan lagi Jumlah tiket yang valid!");
                continue;
            }
            if (jumlahTiket > 4 && jumlahTiket < 10) {
                diskon4Tiket = (int) ((jumlahTiket * hargaTiket) * 0.1);
                totalHarga = (int) ((jumlahTiket * hargaTiket) - diskon4Tiket);
                System.out.println("Promo diskon 10% diberikan!!");
            } else if (jumlahTiket > 10 ) {
                diskon10Tiket= (int) ((jumlahTiket * hargaTiket) * 0.15);
                totalHarga = (int) ((jumlahTiket * hargaTiket) - diskon10Tiket);
                System.out.println("Promo diskon 15% diberikan!!");
            } else {
                totalHarga = jumlahTiket * hargaTiket;
            }

            System.out.println("Total pembayaran tiket: Rp " + totalHarga );
            totalPendapatanSehari += totalHarga;
            sc.nextLine();
        } while (true);

        System.out.println("Total pendapatan hari ini adalah: Rp " + totalPendapatanSehari);

    sc.close();
   
    }
}