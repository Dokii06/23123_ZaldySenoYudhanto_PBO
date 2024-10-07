/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPraktikum6;

/**
 *
 * @author user
 */
public class BilanganPrima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Program mengecek bilangan prima.\n");
        for (int i = 0; i <= 20; i++){
            if(cekPrima(i)){
                System.out.println(i + " Merupakan bilangan prima");
            } else{
                System.out.println(i + " Bukan bilangan prima");
            }
        }
    }
    public static boolean cekPrima(int n){
            if (n < 2){
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++){
                if (n % i == 0){
                    return false;
                }
            }
            return true;
        }
}
