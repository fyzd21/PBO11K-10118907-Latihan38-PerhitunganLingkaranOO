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
public class Validasi {
    public boolean isNumeric(String nilai) {
        try {
            Double.parseDouble(nilai);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }
}
