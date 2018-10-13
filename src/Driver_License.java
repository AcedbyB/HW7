/*
 *btran8
 *HW07 - class Driver License
 *Lab section: 9:40 - 10:55 TR
 *TA: Rahaf AlQarni
 *I did not collaborate with anyone on this assignment
 */
import java.time.LocalDate;
public class Driver_License extends License {
    protected String State;

    //Constructor
    public Driver_License(int Number,LocalDate Expiration, String state) {
        super(Number, Expiration);
        this.State = state;
    }

    //Getter
    public String getState() {
        return State;
    }

    //Setter
    public void setState(String state) {
        this.State = state;
    }

    //this equals method also compares the state
    public boolean equals(Driver_License dl2) {
        if(super.equals(dl2) &&  this.getState()==dl2.getState()) return true;
        else return false;
    }

    //Override to-String method
    @Override
    public String toString() {
        return "Driver_License(" + "State: " + State + ", LicenseNumber: " + LicenseNumber + ", ExpirationDate: " + ExpirationDate + ')';
    }
}
