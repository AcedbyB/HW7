/*
 *btran8
 *HW07 - class Ellipse
 *Lab section: 9:40 - 10:55 TR
 *TA: Rahaf AlQarni
 *I did not collaborate with anyone on this assignment
 */
//import java.lang.Math;
public class Ellipse extends Shape2D {
    protected int a,b;

    //Constructor
    public Ellipse(int A,int B, boolean Filled, String color){
        super(color,Filled);
        this.a = A;
        this.b = B;
    }

    //Getters
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }

    //Setters
    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }

    @Override
    public double getArea() {
        return Math.PI*a*b;
    }

    public String toString() {
        return "Ellipse(" + "a: " + a + ", b: " + b + ", color: " + color + ", filled: " + filled + ", Area: " + getArea() + ')';
    }
}
