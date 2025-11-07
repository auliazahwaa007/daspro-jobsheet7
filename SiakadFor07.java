import java.util.Scanner;

public class SiakadFor07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai = 0;
        double tertinggi = 0;
        double terendah = 100;
        int lulus = 0;
        int tidakLulus = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + "; ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }
        System.out.println("Nilai tertinggi; " + tertinggi);
        System.out.println("Nilai Terendah; " + terendah);
        System.out.println("Banyaknya mahasiswa lulus: " + lulus);
        System.out.println("Banyaknya mahasiswa tidak lulus: " + tidakLulus);

        sc.close();
    }
}
