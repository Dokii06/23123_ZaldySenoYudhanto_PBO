/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum5;

/**
 *
 * @author user
 */
public class Nilai {
    public double nilaiRR(int k, int t, int uts, int uas){
        return (k*0.1) + (t*0.2) + (uts*0.3) + (uas*0.4);
    }
    public String bobot(double nilaiRR){
        if(nilaiRR >= 76 && nilaiRR <= 100){
            return "A";
        } else if(nilaiRR >= 66 && nilaiRR <= 75){
            return "B";
        } else if(nilaiRR >= 56 && nilaiRR <= 65){
            return "C";
        } else if(nilaiRR >= 46 && nilaiRR <= 55){
            return "D";
        } else if(nilaiRR >= 0 && nilaiRR <= 45){
            return "E";
        } else {
            return "Nilai Tidak Valid!";
        }
    }
    public String ket(String bobot) {
        switch (bobot) {
            case "A":
                return "Istimewa\n";
            case "B":
                return "Baik\n";
            case "C":
                return "Cukup\n";
            case "D":
                return "Kurang\n";
            case "E":
                return "Kurang Sekali\n";
            default:
                return "Keterangan Tidak Valid!\n";
        }
    }
}
