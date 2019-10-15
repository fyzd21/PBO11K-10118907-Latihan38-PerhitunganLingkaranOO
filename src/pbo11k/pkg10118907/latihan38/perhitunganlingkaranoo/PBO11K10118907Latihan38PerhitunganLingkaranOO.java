/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan38.perhitunganlingkaranoo;

import java.util.Scanner;

/**
 *
 * @author programmer
 */
public class PBO11K10118907Latihan38PerhitunganLingkaranOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String diameter;
        
        Validasi v = new Validasi();
        
        do {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            Scanner scanner = new Scanner(System.in);
            diameter = scanner.next();
            
            Lingkaran l = new Lingkaran();
            if(v.isNumeric(diameter)) {
                
                l.setDiameter(Double.parseDouble(diameter));
                System.out.println("Jari-jari lingkaran : "+l.jari()+" cm");
                System.out.println("Luas lingkaran : "+l.luas()+" cm");
                System.out.println("Keliling lingkaran : "+l.keliling()+" cm");
            } else {
                System.out.println("Nilai diameter tidak sesuai ");
            }
        } while(!v.isNumeric(diameter));
    }
    
    
    
}
