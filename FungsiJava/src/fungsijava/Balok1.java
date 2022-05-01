/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsijava;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Balok1 {
    static int hitungLuasPermukaan (int p,int l,int t){
        int hasil = 2 *((p*l)+(p*t)+(l*t));
        return hasil;
    }
    static int hitungVolume(int p,int l,int t){
        int hasil = p* l * t;
        return hasil;
    }
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        System.out.print("Masukan panjang : ");
        int p=input.nextInt();
        System.out.print("Masukan Lebar : ");
        int l=input.nextInt();
        System.out.print("Masukan Tinggi : ");
        int t=input.nextInt();
        
        System.out.println("Luas permukaan balok adalah : "+hitungLuasPermukaan(p, l, t));
        System.out.println("Volume Balok adalah "+hitungVolume(p,l,t));
   }
}
