/*
 *btran8
 *HW07 - class Fishing License
 *Lab section: 9:40 - 10:55 TR
 *TA: Rahaf AlQarni
 *I did not collaborate with anyone on this assignment
 */

import java.time.LocalDate;

public class FishingLicense extends License {
    protected String FishType;

    //Constructor
    public FishingLicense(int num, LocalDate expirationDate, String type) {
        super(num,expirationDate);
        this.FishType = type;
    }

    //Getter
    public String getFishType() {
        return FishType;
    }

    //Setter
    public void setFishType(String fishType) {
        FishType = fishType;
    }

    //Override to-String method
    @Override
    public String toString() {
        return "FishingLicense(" + "FishType: " + FishType + ", LicenseNumber: " + LicenseNumber + ", ExpirationDate: " + ExpirationDate + ')';
    }
}
