/*
 *btran8
 *HW07 - class Student
 *Lab section: 9:40 - 10:55 TR
 *TA: Rahaf AlQarni
 *I did not collaborate with anyone on this assignment
 */
public class Student extends Person {
    protected School school;
    protected int ID;
    protected String Major;
    //Constructor
    public Student(int age, String name,int id, School school) {
        super(age,name);
        this.ID = id;
        this.school = school;
    }

    //Setters
    public void setSchool(School school) {
        this.school = school;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setMajor(String major) {
        Major = major;
    }

    //Getters
    public School getSchool() {
        return school;
    }
    public int getID() {
        return ID;
    }
    public String getMajor() {
        return Major;
    }

    public String toString() {
        return "Student("  + school + ", ID:" + ID + ", Major: " + Major + ", age: " + age + ", name: " + name + ", Phone: " + Phone + ')';
    }

    //Override Greeting Method
    @Override
    public void Greeting(){
        if(Major.equals("Computer Science")) System.out.println("Greetings Earthling!");
        else System.out.println("Hey.");
    }
}
