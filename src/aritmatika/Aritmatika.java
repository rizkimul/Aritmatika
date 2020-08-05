/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmatika;

/**
 *
 * @author Rizki
 */
import java.util.Scanner;
public class Aritmatika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int hasil;
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Masukkan angka pertama : ");
        int angka1 = inp.nextInt();
        System.out.println("Masukkan angka kedua : ");
        int angka2 = inp.nextInt();
        
        hasil = angka1 + angka2;
        
        System.out.println("Hasilnya adalah : "+hasil);
        
        
    }
    
}
