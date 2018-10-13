/*
 *btran8
 *HW07 - class School
 *Lab section: 9:40 - 10:55 TR
 *TA: Rahaf AlQarni
 *I did not collaborate with anyone on this assignment
 */
public class School {
    protected String Name;
    protected String Address;

    //Constructor
    public School(String name, String address) {
        Name = name;
        Address = address;
    }

    //Setters
    public void setName(String name) {
        Name = name;
    }
    public void setAddress(String address) {
        Address = address;
    }

    //Getters
    public String getName() {
        return Name;
    }
    public String getAddress() {
        return Address;
    }

    public String toString() {
        return (" " + Name + " , " + Address + " ");
    }
}
