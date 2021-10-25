/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aggregation;

/**
 *
 * @author ASUS
 */
public class main {
    public static void main(String []args){
        Dosen dosen = new Dosen("1","ADAM");
        Jurusan jurusan = new Jurusan("Teknik Informatika");


        jurusan.setDosen(dosen);
        
        System.out.println("NIP  DOSEN : "+jurusan.getDosen().getNip());
        System.out.println("Nama DOSEN : "+jurusan.getDosen().getNama());
        System.out.println("JURUSAN    : "+jurusan.getnamaJurusan());
    }
}
