/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_ruang;

/**
 *
 * @author rizky amelia
 */

public class bola {
    double radius;
    double volume;

    public bola(){
        this.radius = 7;
    }
    public bola(double radius){
        setRadius(radius);
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    double getRadius() {
        return radius;
    }
    void ComputeAndSetVolume(){
        volume = 4/3*3.14*radius*radius*radius;
    }
    public double getVolume() {
        ComputeAndSetVolume();
        return volume;
    }

}
