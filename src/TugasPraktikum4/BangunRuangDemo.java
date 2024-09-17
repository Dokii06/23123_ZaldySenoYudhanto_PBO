/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPraktikum4;

/**
 *
 * @author user
 */
public class BangunRuangDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BangunRuang bngn = new BangunRuang();
        
        int sisiKbs = 8;
        System.out.println("Menghitung luas permukaan dan volume kubus.");
        System.out.println("Panjang sisi kubus: " + sisiKbs);
        System.out.println("Luas permukaan kubus adalah: " + bngn.luasPermukaan(sisiKbs));
        System.out.println("Volume kubus adalah: " + bngn.volume(sisiKbs));
        
        int panjangBlk = 6, lebarBlk = 4, tinggiBlk = 10;
        System.out.println("\nMenghitung luas permukaan dan volume balok.");
        System.out.println("Panjang balok: " + panjangBlk);
        System.out.println("Lebar balok: " + lebarBlk);
        System.out.println("Tinggi balok: " + tinggiBlk);
        System.out.println("Luas permukaan balok adalah: " + bngn.luasPermukaan(panjangBlk, lebarBlk, tinggiBlk));
        System.out.println("Volume balok adalah: " + bngn.volume(panjangBlk, lebarBlk, tinggiBlk));
    }
    
}
