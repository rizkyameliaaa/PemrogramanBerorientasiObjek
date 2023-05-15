/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koleksi;

/**
 *
 * @author amel
 */
public class Majalah extends Koleksi {
    private String edisi;
    
    public Majalah(String judul, String edisi, String penerbit, int tahun) {
        super(judul, penerbit, tahun);
        this.edisi = edisi;
    }
    
    public void setEdisi(String edisi) {
        this.edisi = edisi;
    }
    
    public String getEdisi() {
        return this.edisi;
    }  
}
