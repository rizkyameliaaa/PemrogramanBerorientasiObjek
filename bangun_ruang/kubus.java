/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_ruang;


/**
 *
 * @author rizky amelia
 */

public class kubus {
    
    //atribut
    double sisi;
    double volume;

    public kubus(){
        this.sisi = 5;
    }
    public kubus(double sisi){
        setSisi(sisi);
    }
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    public double getSisi() {
        return sisi;
    }
    public void ComputeAndSetVolume ()
    {
        volume=sisi*sisi*sisi;
    }
    public double getVolume() {
        ComputeAndSetVolume();
        return volume;
    }
}