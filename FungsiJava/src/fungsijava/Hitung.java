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
public class Hitung {
    static int kali(int angka1,int angka2){
        int hasil= (angka1 +10)*(angka2 +7);
        return hasil; 
    }
    static int kurang(int angka1,int angka2){
        angka1=angka1 +5;
        angka2=angka2 +3;
        int hasil=kali(angka1, angka2);
        return hasil;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nilai 1 :");
        int nilai1=input.nextInt();
        System.out.print("Masukan nilai 2 :");
        int nilai2=input.nextInt();
        int hasil = kurang(nilai1, nilai2);
        System.out.println("Hasilnya adalah "+hasil);
    }
}
 