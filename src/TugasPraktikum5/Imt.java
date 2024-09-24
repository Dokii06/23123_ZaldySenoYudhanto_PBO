/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum5;

/**
 *
 * @author user
 */
public class Imt {
    public String cek(double hasil){
        if (hasil >= 40){
            return "Sangat Gemuk";
        } else if(hasil >= 30 && hasil <= 39.9){
            return "Gemuk";
        } else if(hasil >= 25 && hasil <= 29.9){
            return "Berat Badan Lebih";
        } else if (hasil >= 18.5 && hasil <= 24.9){
            return "Berat Badan Ideal";
        } else if (hasil >= 0 && hasil <= 18.4){
            return "Berat Badan Kurang";
        } else {
            return "Berat Badan Tidak Normal:)";
        }
    }
}
