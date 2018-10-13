/*
 *btran8
 *HW07 - Test/Main Class
 *Lab section: 9:40 - 10:55 TR
 *TA: Rahaf AlQarni
 *I did not collaborate with anyone on this assignment
 */

import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        test_All_Shapes();
        test_Students();
        test_All_License();
    }

    public static void test_All_Shapes(){
        Rectangle rec = new Rectangle(10,20, true, "olive");
        Square square = new Square(15,true, "red");
        Ellipse ell = new Ellipse(15,25,false, "blue");
        Circle circle = new Circle(20, true, "red");

        System.out.println(circle);
        System.out.println(rec);
        System.out.println(ell);
        System.out.println(square);
    }

    public static void test_Students() {
        System.out.println();
        School UofR = new School("University of Rochester","Rochester, NY, US");
        Student me = new Student(18, "Bao Tran",31319683, UofR);
        Student notme = new Student(21, "Alex",2321232,UofR);
        me.setMajor("Computer Science");
        notme.setMajor("Political Science");
        me.setPhone("123456789");
        notme.setPhone("98767642");
        System.out.println(me);
        System.out.println(notme);
        notme.Greeting();
        me.Greeting();
    }

    public static void test_All_License() {
        System.out.println();
        License L1 = new License(1221, LocalDate.of(2000,9,18));
        System.out.println(L1);
        if(L1.expired() == true) System.out.println("This license has expired");
        License L2 = new License(1221, LocalDate.of(2020,9,18));
        License L3 = new License(1221, LocalDate.of(2020,9,18));
        System.out.println(L2);
        System.out.println(L3);
        if(L2.equals(L3)==true) System.out.println("This 2 licenses are the same!");

        System.out.println();

        Driver_License DL1 = new Driver_License(3421,LocalDate.of(2020,03,12),"New York");
        System.out.println(DL1);
        if(DL1.expired() == false) System.out.println("This license has not expired yet");
        Driver_License DL2 = new Driver_License(3421,LocalDate.of(2020,03,12),"Ohio");
        System.out.println(DL2);
        if(DL2.equals(DL1)==false) System.out.println("These 2 driver licenses are different!");

        System.out.println();

        TruckDriverLicense TDL = new TruckDriverLicense(3020,LocalDate.of(2010,11,11),"California");
        System.out.println(TDL);

        FishingLicense FL = new FishingLicense(9092,LocalDate.of(2011,2,21),"Shark");
        System.out.println(FL);
    }
}

