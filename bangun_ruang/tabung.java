/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_ruang;

/**
 *
 * @author rizky amelia
 */

public class tabung {
    double radius;
    double tinggi;
    double volume;

    public tabung() {
        this.radius = 7;
        this.tinggi = 15;
    }
    public tabung(double radius, double tinggi) {
        setRadius(radius);
        setTinggi(tinggi);
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    double getRadius() {
        return radius;
    }
    double getTinggi() {
        return tinggi;
    }
    void ComputeAndSetVolume(){
        volume = 3.14*radius*radius*tinggi;
    }
    public double getVolume() {
        ComputeAndSetVolume();
        return volume;
    }
}
