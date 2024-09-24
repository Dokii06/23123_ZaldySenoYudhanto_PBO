/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum5;

/**
 *
 * @author user
 */
public class Diskon {
    public double potHarga(double total){
        if (total < 50000){
            return total*0.05;
        } else if( total >= 50000){
            return total*0.2;
        }
        return 0;
    }
    
    public double hasil (double total){
        return total-potHarga(total);
    }
    
}
