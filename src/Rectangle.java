/*
 *btran8
 *HW07 - class Rectangle
 *Lab section: 9:40 - 10:55 TR
 *TA: Rahaf AlQarni
 *I did not collaborate with anyone on this assignment
 */

public class Rectangle extends Shape2D {
    protected int height, width;

    //Constructor
    public Rectangle(int Height,int Width, boolean Filled, String color){
        super(color,Filled);
        this.height = Height;
        this.width = Width;
    }

    //Getters
    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }

    //Setters
    public void setHeight(int height) {
        this.height = height;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    //Override getArea method
    @Override
    public double getArea() {
        double area = height*width;
        return area;
    }

    //to_String method
    public String toString() {
        return "Rectangle(" + "height: " + height + ", width: " + width + ", color: " + color + ", filled: " + filled + ", Area: " + getArea() +  ')';
    }
}
