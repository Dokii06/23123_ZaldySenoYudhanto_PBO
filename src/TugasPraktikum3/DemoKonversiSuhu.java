/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPraktikum3;

/**
 *
 * @author user
 */
public class DemoKonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KonversiSuhu2 konversi = new KonversiSuhu2();
            double celcius = 100;
            System.out.println(celcius + " Celcius = " + konversi.celciusToFahrenheit(celcius) + " Fahrenheit" );
            System.out.println(celcius + " Celcius = " + konversi.celciusToReamur(celcius) + " Reamur" );

            double fahrenheit = 212;
            System.out.println(fahrenheit + " Fahrenheit = " + konversi.fahrenheitToReamur(fahrenheit) + " Reamur" );
    }
    
}
