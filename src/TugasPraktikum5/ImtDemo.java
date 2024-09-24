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
public class ImtDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("=== Program menentukan kriteria kegemukan ===");
        
        System.out.print("Masukan berat badan: ");
        int berat = input.nextInt();
        System.out.print("Masukan tinggi badan: ");
        int tinggi = input.nextInt();
        
        double imt = berat/(tinggi*tinggi);
        
        Imt tes = new Imt();
        System.out.println("\nIndeks Massa Tubuh: " + tes.cek(imt));
        
    }
    
}
