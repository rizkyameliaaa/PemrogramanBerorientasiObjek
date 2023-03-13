/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bangun_ruang;

/**
 *
 * @author rizky amelia
 */

import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;
        
        do{
        System.out.println("---Program Menghitung Volume Bangun Ruang---");
        System.out.println(("1.Kubus"));
        System.out.println(("2.Balok"));
        System.out.println(("3.Tabung"));
        System.out.println(("4.limas segi empat"));
        System.out.println(("5.Bola"));

        System.out.println("Masukkan pilihan: ");
        int menu = input.nextInt();
        System.out.println("Metode Pengambilan Data:");
        System.out.println("1. Deklarasi");
        System.out.println("2. Input");
        System.out.println("Masukkan pilihan: ");
        int pilihan = input.nextInt();
        switch(menu){
            case 1 -> {
                double sisi;
                if (pilihan == 1){
                    kubus Kubus = new kubus();
                    System.out.println("Sisi kubus: " + Kubus.getSisi());
                    System.out.println("Volume kubus: " + Kubus.getVolume());
                }
                else if (pilihan == 2){
                    System.out.println("Masukkan sisi kubus: ");
                    sisi = input.nextDouble();
                    kubus Kubus = new kubus(sisi);
                    System.out.println("Volume kubus: " + Kubus.getVolume());
                }
                else {
                    System.out.println("Pilihan tidak tersedia");
        
                }
            }
            case 2 -> {
                double panjang;
                double lebar;
                double tinggi;
                if (pilihan == 1){
                    balok Balok = new balok();
                    System.out.println("Panjang balok: " + Balok.getpanjang());
                    System.out.println("Lebar balok: " + Balok.getlebar());
                    System.out.println("Tinggi balok: " + Balok.gettinggi());
                    System.out.println("Volume balok: " + Balok.getVolume());
                }
                else if (pilihan == 2){
                    System.out.println("Masukkan panjang balok: ");
                    panjang = input.nextDouble();
                    System.out.println("Masukkan lebar balok: ");
                    lebar = input.nextDouble();
                    System.out.println("Masukkan tinggi balok: ");
                    tinggi = input.nextDouble();
                    balok Balok = new balok(panjang, lebar, tinggi);
                    System.out.println("Volume balok: " + Balok.getVolume());
                }
                else {
                    System.out.println("Pilihan tidak tersedia");
                }
            }
            case 3 -> {
                double radius;
                double tinggi;
                if (pilihan == 1){
                    tabung Tabung = new tabung();
                    System.out.println("Radius tabung: " + Tabung.getRadius());
                    System.out.println("Tinggi tabung: " + Tabung.getTinggi());
                    System.out.println("Volume tabung: " + Tabung.getVolume());
                }
                else if (pilihan == 2){
                    System.out.println("Masukkan radius tabung: ");
                    radius = input.nextDouble();
                    System.out.println("Masukkan tinggi tabung: ");
                    tinggi = input.nextDouble();
                    tabung Tabung = new tabung(radius, tinggi);
                    System.out.println("Volume tabung: " + Tabung.getVolume());
                }
                else {
                    System.out.println("Pilihan tidak tersedia");
                }
            }
            case 4 -> {
                double alas;
                double tinggi;
                if (pilihan == 1){
                    LimasSegiEmpat limas = new LimasSegiEmpat();
                    System.out.println("Alas limas: " + limas.getSisi());
                    System.out.println("Tinggi limas: " + limas.getTinggi());
                    System.out.println("Volume limas: " + limas.getVolume());
                }
                else if (pilihan == 2){
                    System.out.println("Masukkan alas limas: ");
                    alas = input.nextDouble();
                    System.out.println("Masukkan tinggi limas: ");
                    tinggi = input.nextDouble();
                    LimasSegiEmpat limas = new LimasSegiEmpat(alas, tinggi);
                    System.out.println("Volume limas: " + limas.getVolume());
                }
                else {
                    System.out.println("Pilihan tidak tersedia");
                }
            }
            case 5 -> {
                double radius;
                if (pilihan == 1){
                    bola Bola = new bola();
                    System.out.println("Radius bola: " + Bola.getRadius());
                    System.out.println("Volume bola: " + Bola.getVolume());
                }
                else if (pilihan == 2){
                    System.out.println("Masukkan radius bola: ");
                    radius = input.nextDouble();
                    bola Bola = new bola(radius);
                    System.out.println("Volume bola: " + Bola.getVolume());
                }
                else {
                    System.out.println("Pilihan tidak tersedia");
                }
            }
               
        } 
            System.out.println("Apakah Anda ingin Menlanjutkan? (1.Ya/2.Tidak) : ");
            pilih = input.nextInt();
            
        }while(pilih != 2);
    }
}
