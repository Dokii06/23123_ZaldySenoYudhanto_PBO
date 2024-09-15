/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPraktikum1;

/**
 *
 * @author user
 */
public class DemoNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai Mhs1 = new Nilai();
        Mhs1.Nama = "Zaldy Seno Yudhanto";
        Mhs1.NIM = "231063117023";
        Mhs1.NAbsen = 100;
        Mhs1.NTugas = 92.5;
        Mhs1.NUTS = 90;
        Mhs1.NUAS = 82.5;
       
        Mhs1.Nilai();
        Mhs1.CetakNilai();
    }
    
}
