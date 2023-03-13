/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_ruang;

/**
 *
 * @author rizky amelia
 */

public class LimasSegiEmpat {
    double sisi;
    double tinggi;
    double volume;

    LimasSegiEmpat () {
        this.sisi = 7;
        this.tinggi = 10;
    }
    LimasSegiEmpat(double sisi, double tinggi) {
        setTinggi(tinggi);
        SetSisi(sisi);
    }

    public void SetSisi (double sisi){
        this.sisi = sisi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
        
    }
    double getSisi() {
        return sisi;
    }
    double getTinggi() {
        return tinggi;
    }
    void ComputeAndSetVolume () {
        volume = (sisi*sisi*tinggi)/3;
    }
    public double getVolume (){
        ComputeAndSetVolume();
        return volume;
    }
    

}
