/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPraktikum6;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Lagu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lagu anak ayam turun N");
        
        System.out.print("Masukan jumlah awal anak ayam: ");
        int n = input.nextInt();
        
        System.out.println("\nLagu Anak Ayam Turun " + n + ":");
        for (int i = 0; i < 4; i++){
                System.out.println("Tek kotek kotek kotek anak ayam turun berkotek");
            }
        int m = 0;
        do {
            if (n > 1) {
                if (n > 7) {
                    System.out.println("Anak ayam turun " + n + ", pergi satu tinggal " + (n-1));
                } else if (n <= 7){
                    System.out.println("Anak ayam turunlah " + n + ", pergi satu tinggalah " + (n-1));
                }
            } else {
                System.out.println("Anak ayam turunlah 1, pergi satu tinggal induknya");
                for (int i = 0; i < 2; i++){
                     System.out.println("Tek kotek kotek kotek induk ayam cari anaknya");
                     System.out.println("Tek kotek kotek kotek akhirnya ketemu semua.....");
                }
            }
            n--;
            m++;

            // Setiap dua anak ayam turun, nyanyikan "Tekotek-kotek-kotek"
            if (m == 2 && n > 1) {
                for (int i = 0; i < 2; i++){
                System.out.println("Tek kotek kotek kotek anak ayam turun berkotek");
            }
                m = 0;
            }
        } while (n > 0);
    }
    
}
