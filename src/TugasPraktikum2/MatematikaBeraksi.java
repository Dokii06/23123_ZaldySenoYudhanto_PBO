/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPraktikum2;

/**
 *
 * @author user
 */
public class MatematikaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matematika operasi = new Matematika();
        
        System.out.println("Hasil pertambahan dari 20 + 10 = " + operasi.pertambahan(20, 10));
        System.out.println("Hasil pengurangan dari 10 - 5 = " + operasi.pengurangan(10, 5));
        System.out.println("Hasil perkalian dari 10 * 3 = " + operasi.perkalian(10, 3));
        System.out.println("Hasil pembagian dari 21 / 2 = " + operasi.pembagian(21, 2));
    }
    
}
