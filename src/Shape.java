/*
 *btran8
 *HW07 - class Shape
 *Lab section: 9:40 - 10:55 TR
 *TA: Rahaf AlQarni
 *I did not collaborate with anyone on this assignment
 */

public abstract class Shape {
    protected String color;
    protected boolean filled;

    //Constructor
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    //Getters
    public String getColor() {
        return color;
    }
    public boolean isFilled() {
        return filled;
    }

    //Setters
    public void setColor(String color) {
        this.color = color;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
