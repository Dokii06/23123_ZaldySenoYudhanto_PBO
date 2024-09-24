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
public class PotonganHarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan total harga: ");
        double jumlah = input.nextDouble();
        
        Diskon dskn = new Diskon();
        System.out.println("Besarnya Potongan harga: " + dskn.potHarga(jumlah));
        System.out.println("Jumlah yang harus dibayarkan: " + dskn.hasil(jumlah));
    }
    
}
