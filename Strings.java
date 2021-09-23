/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Strings {
  public static void main (String [] args){
    String myStringA = "Hello";
    String myStringB = "Java";
    String myStringC = "haban";
    
        int Jumlah_A = myStringA.length();
        int Jumlah_B = myStringB.length();
        int total = Jumlah_A + Jumlah_B;
        
        System.out.println(total);
        
        int cek = myStringA.compareTo(myStringB);
            if(cek < 0){
                System.out.println(" No ");
            }else if (cek == 0){
                System.out.println(" No ");
            }else{
                System.out.println(" Yes ");
            }
        System.out.println("Kata Asli : " + myStringC);
        String firstletter = myStringC.substring(0,1);
        String lastletter = myStringC.substring(1);
        
        firstletter = firstletter.toUpperCase();
        String Last = firstletter + lastletter;
        
        System.out.println("Last Word adalah : " + Last);
  } 
        
}