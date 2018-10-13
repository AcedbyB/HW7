/*
 *btran8
 *HW07 - class Circle
 *Lab section: 9:40 - 10:55 TR
 *TA: Rahaf AlQarni
 *I did not collaborate with anyone on this assignment
 */
public class Circle extends Ellipse {
    //Constructor
    public Circle(int A,boolean Filled, String Color) {
        super(A,A,Filled,Color);
    }

    @Override
    public void setA(int A) {
        this.a = A;
        this.b = A;
    }

    @Override
    public void setB(int B) {
        this.a = B;
        this.b = B;
    }

    @Override
    public String toString() {
        return "Circle(" + "a: " + a + ", b: " + b + ", color: " + color + ", filled: " + filled + ", Area: " + getArea() + ')';
    }
}
