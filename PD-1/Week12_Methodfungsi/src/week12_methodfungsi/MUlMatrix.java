/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12_methodfungsi;

import java.util.Scanner;

public class MUlMatrix {
     
static boolean isRun = true;
public static void main(String args[]) {
do {
    showmenu();
}while (isRun);


    
}

static void showmenu(){
 Scanner sc = new Scanner(System.in);
    System.out.println("=====o0Menu0o=====");
    System.out.println("[1] Tambah Matrix");
    System.out.println("[2] Kurang Matrix");
    System.out.println("[3] Nilai maxsimum matriks");
    System.out.println("[4] keluar");
    System.out.println("=====oo000oo=====");
    System.out.print("Pilih menu ->");
    
 int PilihMenu ;
 PilihMenu = Integer.valueOf(sc.nextInt());
 switch (PilihMenu){
    case 1 : 
       TambahMatrix();
       break;
    case 2 :
        kurangMatrix();
        break;
    case 3 :
        MaximumMatriks();
        break;
    case 4 :
        System.exit(0);
           
 }
}
static void TambahMatrix() {
     int r1, r2,c1,c2,i,j,k,sum;
Scanner in = new Scanner(System.in);
 
System.out.print("Enter the number of rows of matrix1 :");
r1 = in.nextInt();
 
System.out.print("Enter the number columns of matrix1 :");
c1 = in.nextInt();

System.out.print("Enter the number of rows of matrix2 :");
r2 = in.nextInt();
 
System.out.print("Enter the number of columns of matrix2 :");
c2 = in.nextInt();
 
if(c1==r2) {
 
int mat1[][] = new int[r1][c1]; 
int mat2[][] = new int[r2][c2]; 
int res[][] = new int[r1][c2];
 
System.out.print("Enter the elements of matrix1 :");
 
for ( i= 0 ; i < r1 ; i++ ){ 
 
for ( j= 0 ; j < c1 ;j++ )
mat1[i][j] = in.nextInt();
 
}
System.out.print("Enter the elements of matrix2 :");
 
for ( i= 0 ; i < r2 ; i++ ){ 
 
for ( j= 0 ; j < c2 ;j++ )
mat2[i][j] = in.nextInt();
 
}

System.out.println("\n\noutput matrix:-");
for ( i= 0 ; i < r1 ; i++ )
 
for ( j= 0 ; j <c2;j++){
sum=0;
for ( k= 0 ; k <r2;k++ ){
sum +=mat1[i][k]*mat2[k][j] ;

}
res[i][j]=sum;
}
for ( i= 0 ; i < r1; i++ )
{
for ( j=0 ; j < c2;j++ )
System.out.print(res[i][j]+" ");
 
System.out.println();
}
}
else
System.out.print("multipication does not exist ");
 }
static void kurangMatrix(){
    int r1, r2,c1,c2,i,j,k,min;
Scanner in = new Scanner(System.in);
 
System.out.print("Enter the number of rows of matrix1 :");
r1 = in.nextInt();
 
System.out.print("Enter the number columns of matrix1 :");
c1 = in.nextInt();

System.out.print("Enter the number of rows of matrix2 :");
r2 = in.nextInt();
 
System.out.print("Enter the number of columns of matrix2 :");
c2 = in.nextInt();
 
if(c1==r2) {
 
int mat1[][] = new int[r1][c1]; 
int mat2[][] = new int[r2][c2]; 
int res[][] = new int[r1][c2];
 
System.out.print("Enter the elements of matrix1");
 
for ( i= 0 ; i < r1 ; i++ ) { 
for ( j= 0 ; j < c1 ;j++ )
mat1[i][j] = in.nextInt(); 
}
System.out.print("Enter the elements of matrix2");
 
for ( i= 0 ; i < r2 ; i++ ){ 
 
for ( j= 0 ; j < c2 ;j++ )
mat2[i][j] = in.nextInt();
 
}

System.out.print("\n\noutput matrix:-");
for ( i= 0 ; i < r1 ; i++ )
 
for ( j= 0 ; j <c2;j++){
min=0;
for ( k= 0 ; k <r2;k++ )
{
min -=mat1[i][k]*mat2[k][j] ;
 
}
res[i][j]=min;
}
for ( i= 0 ; i < r1; i++ )
{
for ( j=0 ; j < c2;j++ )
System.out.print(res[i][j]+" ");
 
System.out.println("");
}
}
else
System.out.print("multipication does not exist ");
 }
static void MaximumMatriks(){
    int maksimum, jumlah, i, lokasi = 1, array[];
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan jumlah elemen: ");
    jumlah = scan.nextInt();
    array = new int[jumlah];
    
    System.out.println("Masukkan "+jumlah+" angka");
    for(i = 0; i < jumlah; i++) {
      System.out.print("Elemen ke-"+ (i+1) +": " );
      array[i] = scan.nextInt();
    }
    maksimum = array[0];
    for(i = 0; i < jumlah; i++) {
      if (array[i] > maksimum){
        maksimum = array[i];
        lokasi = i+1;
      }
    }
    System.out.println("Nilai makasimum adalah "+maksimum+" berada di elemen ke "+lokasi);
    
  }
}


 

