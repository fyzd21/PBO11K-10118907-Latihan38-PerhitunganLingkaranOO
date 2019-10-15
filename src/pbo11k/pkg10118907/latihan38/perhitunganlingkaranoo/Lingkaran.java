/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan38.perhitunganlingkaranoo;

/**
 *
 * @author programmer
 */
public class Lingkaran {
    private double diameter, jari, keliling, luas;
    
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    
    public double jari() {
        
        jari = 0.5 * diameter;
        
        return jari;
    }
    
    public double keliling() {
        
        jari = jari();
        keliling = 2 * 3.14 * jari;
        
        return keliling;
    }
    
    public double luas() {
        
        jari = jari();
        luas = 3.14 * (jari*jari);
        
        return luas;
    }
}
