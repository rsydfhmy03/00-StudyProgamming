/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsijava;

import java.text.Normalizer;

/**
 *
 * @author ACER
 */
public class Varags {
    
    static void tampil(String pesan,int... angka){
        System.out.println("string :"+pesan);
        System.out.println("Jumlah Argumen/parameter :"+angka.length);
        
     for (int i=0; i<angka.length; i++){
         System.out.print(angka[i]+" ");
    }
        System.out.println();
   
}
    public static void main(String[] args) {
        tampil("Daspro 2019", 100, 200);
        tampil("Teknologi Informasi", 1, 2, 3,4,5);
        tampil("POLIJE");
        int[]angka={ 1, 2, 3, 4};
        tampil("Bondowoso", angka);
    }
}    
    

