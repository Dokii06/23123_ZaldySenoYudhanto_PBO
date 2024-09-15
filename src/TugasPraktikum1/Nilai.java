/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum1;

/**
 *
 * @author user
 */
public class Nilai {
    String NIM, Nama;
    double NAbsen, NTugas, NUTS, NUAS, NAkhir;
    void Nilai(){
        System.out.println("Daftar Nilai Anda Sebagai Berikut.");
    }
    void CetakNilai(){
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + Nama);
        System.out.println("Nilai Absen: " + NAbsen);
        System.out.println("Nilai Tugas: " + NTugas);
        System.out.println("Nilai UTS: " + NUTS);
        System.out.println("Nilai UAS: " + NUAS);
        NAkhir = (NAbsen * 0.1) + (NTugas * 0.2) + (NUTS * 0.3) + (NUAS * 0.4);
        System.out.println("Nilai Akhir: " + NAkhir);
        
    }
}
