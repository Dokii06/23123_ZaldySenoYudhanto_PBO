/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPraktikum6;

/**
 *
 * @author user
 */
public class BilanganGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0;
        System.out.println("Program mengecek bilangan genap.");
        while (i <= 20){
            if (i % 2 == 0){
                System.out.println(i + " Merupakan bilangan genap");
            }else {
                System.out.println(i + " Bukan bilangan genap");
            }
            
            i++;
        }
    }
    
}
