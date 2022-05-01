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
public class Balok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan panjang : ");
        int p =input.nextInt();
        System.out.print("Masukan Lebar : ");
        int l =input.nextInt();
        System.out.print("Masukan Tinggi : ");
        int t =input.nextInt();
        
        int luasPermukaan = 2*((p*l)+(p*t)+(l*t));
        System.out.println("Luas permukaan Balok adalah : "+luasPermukaan);
        
        int volume = p*l*t;
        System.out.println("Volume Balok adalah : "+volume);
    }

}
