/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasus3;

/**
 *
 * @author ASUS
 */
public class Sasuke extends Itachi{

	String Dojutsu = "Sharingan";
	
	void printDojutsu() {
		super.printDojutsu();				// Menampilkan output dari method printDojutsu 
		System.out.println(this.Dojutsu);
	}
}