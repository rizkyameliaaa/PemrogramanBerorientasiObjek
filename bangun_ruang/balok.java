/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_ruang;

/**
 *
 * @author rizky amelia
 */


public class balok {
    double panjang;
    double lebar;
    double tinggi;
    double volume;

    public balok(){
        this.panjang = 10;
        this.lebar = 5;
        this.tinggi = 5;
    }
    public balok(double panjang, double lebar, double tinggi){
        setlebar(lebar);
        setpanjang(panjang);
        settinggi(tinggi);
    }
    public void setpanjang (double panjang){
        this.panjang = panjang;
    }
    public void setlebar (double lebar){
        this.lebar = lebar;
    }
    public void settinggi (double tinggi){
        this.tinggi = tinggi;
    }
    public double getpanjang() {
        return panjang;
    }
    public double getlebar() {
        return lebar;
    }
    public double gettinggi() {
        return tinggi;
    }
    public void ComputeAndSetVolume ()
    {
        volume=panjang*lebar*tinggi;
    }
    public double getVolume() {
        ComputeAndSetVolume();
        return volume;
    }
}

