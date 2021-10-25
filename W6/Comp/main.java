/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compotition;

/**
 *
 * @author ASUS
 */
public class main {
    public static void main (String []args){
        Mobil mobil = new Mobil();
        mobil.setWarna("biru");
        mobil.setRoda("felaino", 15);
        
        System.out.println("WARNA MOBIL         : "+mobil.getWarna());
        System.out.println("MERK RODA MOBIL     : "+mobil.getMerkRoda());
        System.out.println("Ukuran RING RODA    : "+mobil.getRingRoda());
    } 
}
