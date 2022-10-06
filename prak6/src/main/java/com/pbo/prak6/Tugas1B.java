/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.prak6;
import javax.swing.JOptionPane;
/**
 *
 * @Created By Nadya Annisa Juventina 21343060
 */
public class Tugas1B {
    public static void main(String args[]) {
        String N="";
        String D="";
        String Y="";
        N=JOptionPane.showInputDialog("Masukkan nilai pertama Anda");
        int pertama = Integer.valueOf(N).intValue();
        D=JOptionPane.showInputDialog("Masukkan nilai kedua Anda");
        int kedua = Integer.valueOf(D).intValue();
        Y=JOptionPane.showInputDialog("Masukkan nilai ketiga Anda");
        int ketiga = Integer.valueOf(Y).intValue();

        int rata_rata=(pertama+kedua+ketiga)/3;

        String hasil= "";
        hasil += "Nilai pertama: " +pertama +"\n";
        hasil += "Nilai kedua: " +kedua +"\n";
        hasil += "Nilai ketiga: " +ketiga +"\n";
        hasil += "Rata-rata nilai Anda adalah " +rata_rata+"\n";
         if (rata_rata<=60){
         hasil +=":-("+"\n";
        }
        else {hasil +=":-)"+"\n";
        }
        JOptionPane.showMessageDialog(null, hasil);
    }
}

