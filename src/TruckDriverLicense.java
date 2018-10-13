/*
 *btran8
 *HW07 - class Truck Driver License
 *Lab section: 9:40 - 10:55 TR
 *TA: Rahaf AlQarni
 *I did not collaborate with anyone on this assignment
 */
import java.time.LocalDate;

public class TruckDriverLicense extends Driver_License{
    public TruckDriverLicense(int number, LocalDate expirationDate, String state) {
        super(number,expirationDate,state);
    }

    //Override the to-String method
    @Override
    public String toString() {
        return "Truck Driver License(" + "State: " + State + ", LicenseNumber: " + LicenseNumber + ", ExpirationDate: " + ExpirationDate + ')';
    }
}
