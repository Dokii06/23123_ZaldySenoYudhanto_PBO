package TugasPraktikum7;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Toko {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] kodeBarang = {"b001", "b002", "b003", "b004", "b005"};
        String[] namaBarang = {"Beras", "Minyak", "Mie", "Gula", "Permen"};
        int[] hargaBarang = {12000, 7000, 3000, 5000, 500};

        String[] transaksiKode = new String[100];
        String[] transaksiNama = new String[100];
        int[] transaksiHarga = new int[100];
        int[] transaksiJumlahBeli = new int[100];
        int[] transaksiTotalHarga = new int[100];

        System.out.println("TOKO SERBA ADA");
        System.out.println("****************");
        System.out.print("Masukkan Item Barang: ");
        int jumlahItem = input.nextInt();
        
        int transaksiIndex = 0;
        int totalHargaSemua = 0;

        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.print("Masukkan Kode Barang: ");
            String kode = input.next();
            System.out.print("Masukkan Jumlah Beli: ");
            int jumlahBeli = input.nextInt();
            
            boolean barangDitemukan = false;

            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeBarang[j].equals(kode)) {
                    int totalHarga = hargaBarang[j] * jumlahBeli;
                    totalHargaSemua += totalHarga;

                    transaksiKode[transaksiIndex] = kodeBarang[j];
                    transaksiNama[transaksiIndex] = namaBarang[j];
                    transaksiHarga[transaksiIndex] = hargaBarang[j];
                    transaksiJumlahBeli[transaksiIndex] = jumlahBeli;
                    transaksiTotalHarga[transaksiIndex] = totalHarga;

                    transaksiIndex++;
                    barangDitemukan = true;
                    break;
                }
            }

            if (!barangDitemukan) {
                System.out.println("Barang dengan kode " + kode + " tidak ditemukan.");
            }
        }

        
        System.out.println("\n\nTOKO SERBA ADA");
        System.out.println("****************");
        System.out.printf("%-5s %-10s %-15s %-10s %-10s %-15s\n", 
                          "No", "Kode", "Nama Barang", "Harga", "Jumlah", "Total");
        System.out.println("======================================================================");

        for (int i = 0; i < transaksiIndex; i++) {
            System.out.printf("%-5d %-10s %-15s %-10d %-10d %-15d\n", 
                              (i + 1), transaksiKode[i], transaksiNama[i], transaksiHarga[i], transaksiJumlahBeli[i], transaksiTotalHarga[i]);
        }
        System.out.println("======================================================================");
        System.out.printf("%-50s %-15d\n", "Total Semua", totalHargaSemua);
        System.out.println("======================================================================");

        input.close();
    }
}
