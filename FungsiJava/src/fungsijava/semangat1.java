/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsijava;

/**
 *
 * @author ACER
 */
public class semangat1 {

    static void beriSalam(){
        System.out.println("Halo! selamat pagi");    
   
}
    static  void beriUcapan(String ucapan){
        System.out.println(ucapan);
    }
    public static void main(String[] args) {
        beriSalam();
        String salam ="selamat datang di pemograman java";
        beriUcapan(salam);
    }
}