
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package koleksi;

/**
 *
 * @author amel
 */

public class main {
    
     /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
        Koleksi koleksi = new Koleksi("Laut Bercerita", "Gramedia", 2017);
        System.out.println("Koleksi");

        Buku buku = new Buku("Laut Bercerita", "Leila S. Cudori", "Centrale Courant", 2017);
        System.out.println("\nBuku");
        System.out.println("Judul :"+buku.getJudul());
        System.out.println("Penulis : "+buku.getPenulis());
        System.out.println("Penerbit : "+buku.getPenerbit());
        System.out.println("Tahun Terbit : "+buku.getTahun());

        Majalah majalah = new Majalah("Majalah SCG-Perisai Pesisir Surabaya", "ED 13 2022", "Redaksi Majalah Surabaya", 2022);
        System.out.println("\nMajalah");
        System.out.println("Judul :"+majalah.getJudul());
        System.out.println("Edisi : "+majalah.getEdisi());
        System.out.println("Penerbit : "+majalah.getPenerbit());
        System.out.println("Tahun Terbit : "+majalah.getTahun());

        Skripsi skripsi = new Skripsi("21081010129", "Rizky Amelia", "Skripsi", "UPN Veteran Jatim", 2025);
        System.out.println("\nSkripsi");
        System.out.println("Judul :"+skripsi.getJudul());
        System.out.println("NPM : "+skripsi.getNpm());
        System.out.println("Penulis : "+skripsi.getPenulis());
        System.out.println("Penerbit : "+skripsi.getPenerbit());
        System.out.println("Tahun Terbit : "+skripsi.getTahun());
    }
}
