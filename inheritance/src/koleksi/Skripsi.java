/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koleksi;

/**
 *
 * @author amel
 */

public class Skripsi extends Buku {
    private String npm;
    
    public Skripsi(String npm, String penulis, String judul, String penerbit, int tahun) {
        super(judul, penulis, penerbit, tahun);
        this.npm = npm;
    }
    
    public void setNpm(String npm) {
        this.npm = npm;
    }
    
    public String getNpm() {
        return this.npm;
    }
}
