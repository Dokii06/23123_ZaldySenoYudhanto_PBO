/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPraktikum5;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Masukan Data Mahasiswa ===");
        System.out.print("NPM: ");
        String npm = input.nextLine();
        System.out.print("Nama Mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("Nilai Kehadiran: ");
        int nK = input.nextInt();
        System.out.print("Nilai Tugas: ");
        int nT = input.nextInt();
        System.out.print("Nilai UTS: ");
        int nUts = input.nextInt();
        System.out.print("Nilai UAS: ");
        int nUas = input.nextInt();
        
        Nilai proses = new Nilai();
        double nAkhir = proses.nilaiRR(nK, nT, nUts, nUas);
        String grade = proses.bobot(nAkhir);
        String keterangan = proses.ket(grade);
        
        System.out.println("\n=== Menampilkan Data Mahasiswa ===");
        System.out.println("NPM: " + npm);
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Nilai Akhir: " + nAkhir);
        System.out.println("Grade: " + grade);
        System.out.println("Keterangan: " + keterangan);   
    }
    
}
