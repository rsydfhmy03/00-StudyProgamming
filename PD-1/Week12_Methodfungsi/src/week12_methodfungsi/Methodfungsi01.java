/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12_methodfungsi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Methodfungsi01 {
    
static boolean isRun = true;
static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
static BufferedReader input = new BufferedReader(inputStreamReader);

     
    public static void main(String[] args) throws IOException {
       do {
           showMenu();
       }while(isRun) ;
    }
 public static void showMenu() throws IOException{
 System.out.println("========= MENU ========");
 System.out.println("[1] Anda hanya membawa SIM");
 System.out.println("[2] Anda hanya membawa STNK");
 System.out.println("[3] Anda membawa SIM dan STNK");
 System.out.println("[0] Exit");
 System.out.println("=========ooOOoo========");
 System.out.print("PILIH MENU -> ");
 
 int pilihmenu = Integer.valueOf(input.readLine());
 switch (pilihmenu){
    case 1 :
        showSatu();
    break ;
    
    case 2 :
        showDua();
    break;
    
    case 3 :
        showTiga();
    break;
    
    case 0 :
        System.exit(0);
    
    default: 
        System.out.println("Pilihan anda salah");
 }

}
static void showSatu(){
 System.out.println("Anda akan ditilang");
 }
 static void showDua(){
 System.out.println("Anda akan ditilang");
 }
 
 static void showTiga(){
 System.out.println("Anda tidak akan ditilang");
 }

}   
