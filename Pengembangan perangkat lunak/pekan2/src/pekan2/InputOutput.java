/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pekan2;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class InputOutput {

    public static void main(String[] args) {
        System.out.println("hello world...!!!");
        System.out.println("My name is Fahmy rosyadi");

        int a = 13;
        System.out.println("panjang : " + a);
        int b = 2;
        System.out.println("lebar :" + b);

        Scanner scan = new Scanner(System.in);
        int panjang, lebar;

        System.out.println("masukkan panjang :");
        panjang = scan.nextInt();
        System.out.println("masukkan lebar :");
        lebar = scan.nextInt();

        System.out.println("masukan panjang :" + panjang);
        System.out.println("masukan lebar :" + lebar);
        System.out.println("Luas persegi panjang :" + (panjang * lebar));
        System.out.println("Keliling persegi panjang :" + (2 * (panjang + lebar)));

    }

}
