/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.prak6;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @Created By Nadya Annisa Juventina 21343060
 */
public class Tugas1 {
        public static void main(String [] args){
      BufferedReader nilai = new BufferedReader(new InputStreamReader(System.in));
        String N="";
        String D="";
        String Y="";
   
  try{
   System.out.print("Masukkan nilai pertama Anda: ");
   N = nilai.readLine();
   System.out.print("Masukkan nilai kedua Anda: ");
   D = nilai.readLine();
   System.out.print("Masukkan nilai ketiga Anda: ");
   Y = nilai.readLine();
  }catch(IOException e){
   System.out.println("Kata yang Anda masukkan salah, silahkan coba lagi.");
  }
  int pertama;
  int kedua;
  int ketiga;
  pertama = Integer.parseInt(N);
  kedua = Integer.parseInt(D);

  ketiga = Integer.parseInt(Y);

  int rata_rata=(pertama+kedua+ketiga)/3;

  System.out.println("Rata-rata nilai Anda: "+rata_rata);
   
   if (rata_rata<=60){System.out.println(":-(");
  }
  else {
   System.out.println(":-)");
  }
 }      
}
    
     