/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Constant2 {
    public static final double CM_PER_INCH = 2.54;
    public static void main(String[]args){
        double paperWidht = 8.5;
        double paperHeight = 11;
        System.out.println("Papaer Size in Centimeters : " + paperWidht * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH); 
         System.out.println(" Constant2");
         HelloWorld();
    }
    public static void HelloWorld(){
        System.out.println("Hello");
        System.out.println(+ CM_PER_INCH);
    }
}
