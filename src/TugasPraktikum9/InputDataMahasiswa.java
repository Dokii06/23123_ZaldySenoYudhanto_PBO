/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum9;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class InputDataMahasiswa {
    ArrayList<Mahasiswa> listmahasiswa;
    public InputDataMahasiswa() {
        listmahasiswa = new ArrayList ();
    }
    public void insertData(String npm, String nama, String alamat, String mataKuliah, double nilaiAkhir) {
        Mahasiswa mhs = new Mahasiswa(npm, nama, alamat, mataKuliah, nilaiAkhir);
        listmahasiswa.add(mhs);
    }
    public ArrayList<Mahasiswa> getALL() {
        return listmahasiswa;
    }
    public void deleteData(int index) {
        listmahasiswa.remove(index);
    }
}
