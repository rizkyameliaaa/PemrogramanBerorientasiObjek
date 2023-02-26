/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rizky Amelia
 */
import java.util.Scanner;

public class main {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaration
        bangunDatar rumus = new bangunDatar();
        Scanner input = new Scanner(System.in);

        System.out.println("--- Program Menghitung Luas dan Keliling Bangun Datar ---");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.println("4. Elipse");
        System.out.print("Masukan pilihan: ");
        int pilihan = input.nextInt();
        
        switch(pilihan){
            case 1 -> {
                System.out.print("Masukan sisi: ");
                rumus.sisi = input.nextInt();
                rumus.squareArea();
                rumus.squarePerimeter();
                System.out.println("Luas: " + rumus.squareArea());
                System.out.println("Keliling: " + rumus.squarePerimeter());
            }
            
            case 2 -> {
                System.out.print("Masukan panjang: ");
                rumus.panjang = input.nextInt();
                System.out.print("Masukan lebar: ");
                rumus.lebar = input.nextInt();
                rumus.rectangleArea();
                rumus.rectanglePerimeter();
                System.out.println("Luas: " + rumus.rectangleArea());
                System.out.println("Keliling: " + rumus.rectanglePerimeter());
            }
            
            case 3 -> {
                System.out.print("Masukan radius: ");
                rumus.radius = input.nextInt();
                rumus.circleArea();
                rumus.circlePerimeter();
                System.out.println("Luas: " + rumus.circleArea());
                System.out.println("Keliling: " + rumus.circlePerimeter());
            }
            
            case 4 -> {
                System.out.print("Masukan sumbu semi mayor (a): ");
                rumus.a = input.nextInt();
                System.out.print("Masukan sumbu semi minor (b): ");
                rumus.b = input.nextInt();
                rumus.elipsArea();
                rumus.elipsPerimeter();
                System.out.println("Luas: " + rumus.elipsArea());
                System.out.println("Keliling: " + rumus.elipsPerimeter());
            }  

        }          
    }
}
