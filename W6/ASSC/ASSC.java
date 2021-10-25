/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assosiation;

/**
 *
 * @author ASUS
 */
public class ASSC {
    public static void main(String[]args){
        kampus kampus1 = new kampus ("POLITEKNIK NEGERI BANDUNG");
        jurusan jurusan1 = new jurusan("TEKNIK INFORMATIKA");
        
       
        System.out.println("KAMPUS : "+ kampus1.getNama());
        System.out.println("JURUSAN : "+jurusan1.getNama());

          
    }
   
}