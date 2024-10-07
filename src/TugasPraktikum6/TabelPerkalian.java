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
public class TabelPerkalian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Program tabel perkalian");

        System.out.print("Masukkan nilai n (n <= 10): ");
        int n = input.nextInt();

        if (n < 1 || n > 10) {
            System.out.println("Inputan tidak valid.");
            return;
        }

        System.out.println("Tabel perkalian " + n + " x " + n + ":");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

        input.close();
    }
    
}
