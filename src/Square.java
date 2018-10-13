/*
 *btran8
 *HW07 - class Square
 *Lab section: 9:40 - 10:55 TR
 *TA: Rahaf AlQarni
 *I did not collaborate with anyone on this assignment
 */

public class Square extends Rectangle {

    //Constructor
    public Square(int Height, boolean Filled, String color) {
        super(Height,Height, Filled, color);
    }

    //Override setters for the squareness.
    @Override
    public void setHeight(int Height) {
        this.height = Height;
        this.width = Height;
    }

    @Override
    public void setWidth(int Width) {
        this.height = Width;
        this.width = Width;
    }

    @Override
    public String toString() {
        return "Square(" + "height: " + height + ", width: " + width + ", color: " + color + ", filled: " + filled + ", Area: " + getArea() + ')';
    }
}
