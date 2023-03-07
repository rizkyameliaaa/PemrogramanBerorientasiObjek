/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalkulator;

import java.util.Scanner;

/**
 *
 * @author amel
 */
public class Kalkulator {

    /**
     * @param args the command line arguments
     * angka1, angka2, nilainya disimpan di hasil
     */
    public static void main(String[] args) {
        // TODO code application logic here
        classkalkulator kalkulator = new classkalkulator();
        Scanner input = new Scanner(System.in);
        int pil = 0;
        
        do {
        System.out.println("Input a :");
        kalkulator.a = input.nextInt();

        System.out.println("--- Pilih Operator ---");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        System.out.println("5. selesai");
        System.out.print("Masukan pilihan: ");
        int pilihan = input.nextInt();
        System.out.println("Input b :");
        kalkulator.b = input.nextInt();
        
        switch(pilihan){
            case 1 -> {
                kalkulator.penjumlahan();
                System.out.println("Hasil: " + kalkulator.penjumlahan());
                break;
        }  
            case 2 -> {
                kalkulator.pengurangan();
                System.out.println("Hasil: " + kalkulator.pengurangan());
                break;
        }
            case 3 -> {
                kalkulator.penjumlahan();
                System.out.println("Hasil: " + kalkulator.perkalian());
                break;
        }  
            case 4 -> {
                kalkulator.pengurangan();
                System.out.println("Hasil: " + kalkulator.pembagian());
                break;
             }
            }
        }while(pil !=5);
       
   }
}

