/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum9;

/**
 *
 * @author user
 */
public class Mahasiswa {
    private String NPM, Nama, Alamat, MataKuliah;
    private double NilaiAkhir;
    public Mahasiswa(String NPM, String Nama, String Alamat, String MataKuliah, double NilaiAkhir) {
        this.NPM = NPM;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.MataKuliah = MataKuliah;
        this.NilaiAkhir = NilaiAkhir;
    }
    public String getAlamat() {
        return Alamat;
    }
    public String getNPM() {
        return NPM;
    }
    public String getNama() {
        return Nama;
    }
    public String getMataKuliah() {
        return MataKuliah;
    }
    public double getNilaiAkhir() {
        return NilaiAkhir;
    }   
}
