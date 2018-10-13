/*
 *btran8
 *HW07 - class Shape2D
 *Lab section: 9:40 - 10:55 TR
 *TA: Rahaf AlQarni
 *I did not collaborate with anyone on this assignment
 */

public abstract class Shape2D extends Shape{
    public abstract double getArea();

    //Constructor
    public Shape2D(String color, boolean filled) {
        super(color, filled);
    }
}
