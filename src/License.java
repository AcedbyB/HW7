/*
 *btran8
 *HW07 - class License
 *Lab section: 9:40 - 10:55 TR
 *TA: Rahaf AlQarni
 *I did not collaborate with anyone on this assignment
 */
import java.time.LocalDate;

public class License {
    protected int LicenseNumber;
    protected LocalDate ExpirationDate;

    //Constructor
    public License(int licenseNumber, LocalDate expirationDate) {
        LicenseNumber = licenseNumber;
        ExpirationDate = expirationDate;
    }

    //Getters
    public int getLicenseNumber() {
        return LicenseNumber;
    }
    public LocalDate getExpirationDate() {
        return ExpirationDate;
    }

    //Setters
    public void setLicenseNumber(int licenseNumber) {
        LicenseNumber = licenseNumber;
    }
    public void setExpirationDate(LocalDate expirationDate) {
        ExpirationDate = expirationDate;
    }

    //Equals method. If the license number and expiration date are the same then the 2 license are equal.
    public boolean equals(License l2) {
        if(this.LicenseNumber == l2.getLicenseNumber() && this.ExpirationDate.equals(l2.getExpirationDate())) return true;
        else return false;
    }

    //Expired method
    public boolean expired() {
        if (LocalDate.now().isAfter(ExpirationDate)) return true;
        else return false;
    }

    public String toString() {
        return "License(" + "Number: " + LicenseNumber + ", Expiration Date: " + ExpirationDate + ')';
    }
}
