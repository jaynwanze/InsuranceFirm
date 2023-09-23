
//************************************************************
// File name: Car.java      
// Author: Jamin Nwanze
// Student Number: C21438482
// Description of class: Car class for program
//************************************************************

public class Car {

    // instance variable of Car class
    private String regNum;// Car reg number
    private int yearManufactured;// Car name
    private String engineSize;// Number of points on resg
    private boolean nctStatus;// Nct Status

    // Constructor - With passed in details
    public Car(String regNumber, int year, String engine, boolean nct) {

        this.regNum = regNumber;
        this.yearManufactured = year;
        this.engineSize = engine;
        this.nctStatus = nct;

    }

    // returns Car reg number
    public String getRegNumber() {
        return this.regNum;
    }

    // returns car year manufactured
    public int getYearManufactured() {
        return this.yearManufactured;
    }

    // returns car engine size
    public String getEngineSize() {
        return this.engineSize;
    }

    // returns car nct status
    public boolean getNctStatus() {
        return this.nctStatus;
    }

    // Updates Car reg number
    public void setRegNumber(String regNumber) {
        this.regNum = regNumber;
    }

    // Updates car year manufactured
    public void setYearManufactured(int year) {
        this.yearManufactured = year;
    }

    // Updates Car engine size
    public void setEngineSize(String engine) {
        this.engineSize = engine;
    }

    // Updates Car nct status
    public void setNctStatus(boolean nct) {
        this.nctStatus = nct;
    }

    // Displays Car details
    public String toString() {
        return "Car Registration number: " + this.regNum + "\n" + "Car year of manufacture: " + this.yearManufactured
                + "\n" + "Car engine size: " + this.engineSize + "\n" + "Car NCT status: " + this.nctStatus + "\n";
    }
}
