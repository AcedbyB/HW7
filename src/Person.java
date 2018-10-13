/*
 *btran8
 *HW07 - class Person
 *Lab section: 9:40 - 10:55 TR
 *TA: Rahaf AlQarni
 *I did not collaborate with anyone on this assignment
 */


public class Person {
    protected int age;
    protected String name, Phone;

    //Constructor
    public Person(int a, String b) {
        this.age = a;
        this.name = b;
    }

    //Setter
    public void setPhone(String num) {
        this.Phone = num;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public void setAge(int newAge) {
        this.age = newAge;
    }

    //Getter
    public String getName() { return this.name; }
    public int getAge() {
        return this.age;
    }
    public String getPhone() {
        return this.Phone;
    }

    //toString method
    public String toString() {
        return(name + ": " + age + " years old. " + name + "'s phone number is: " + Phone);
    }

    //Greeting Method
    public void Greeting() {
        System.out.println("Hello");
    }
}
