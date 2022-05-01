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
public class persegi {
    static int luaspersegi(int sisi){
        int luas= sisi*sisi;
        return luas;
    }
    public static void main(String[] args) {
        int luasan = luaspersegi(5);
        System.out.println("Luas Persegi sama dengan sisi 5 : "+luasan);
    }

}
