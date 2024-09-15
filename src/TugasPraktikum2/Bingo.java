/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum2;

/**
 *
 * @author user
 */
public class Bingo {
    String nama;
    
    public Bingo(String nama) {
        this.nama = nama;
    }
    
    public void sing(){
        String[] letters = {"B", "I", "N", "G", "O"};

        for (int i = 0; i <= letters.length; i++) {
            System.out.println("There was a farmer who had a dog,");
            System.out.println("And " + nama + " was his name-o.");
            
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < letters.length; k++) {
                    if (k < i) {
                        System.out.print("(clap)");
                    } else {
                        System.out.print(letters[k]);
                        if (k < letters.length - 1) {
                            System.out.print("-");
                        }
                    }
                }
                System.out.println();
            }

            System.out.println("And " + nama + " was his name-o.");
            System.out.println();
        }
    }
}
