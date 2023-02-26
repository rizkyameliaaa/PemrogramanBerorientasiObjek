/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rizky Amelia
 */

        
public class bangunDatar {
    public int sisi, panjang, lebar, radius, a, b;
    public double pi = 3.14;

    public int squareArea(){
        int luas;
        luas = this.sisi * this.sisi;
        return luas;
    }
    public int squarePerimeter(){
        int keliling;
        keliling = this.sisi * 4;
        return keliling;
    }
    public int rectangleArea(){
        int luas;
        luas = this.panjang * this.lebar;
        return luas;
    } 
    public int rectanglePerimeter(){
        int keliling;
        keliling = 2 * (this.panjang + this.lebar);
        return keliling;
    }
    public double circleArea(){
        double luas;
        luas = pi * this.radius * this.radius;
        return luas;
    }
    public double circlePerimeter(){
        double keliling;
        keliling = 2 * pi * this.radius;
        return keliling;
    }
    public double elipsArea(){
        double luas;
        luas = pi * this.a * this.b;
        return luas;
    }
    public double elipsPerimeter(){
        double parimeter;
        double c = Math.sqrt((this.a*this.a+this.b*this.b)/2);
        parimeter = 2 * pi * c;
        return parimeter;
    }
}
