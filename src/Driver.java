//************************************************************
// File name: Driver.java      
// Author: Jamin Nwanze
// Student Number: C21438482
// Description of class: Driver class for program
//************************************************************

public class Driver {

    // instance variable of Driver class
    private String licenseNum;// Driver license number
    private String name;// Driver name
    private int numPoints;// Number of points on license
    private String contactNum;// Contact Number

    // Constructor - Empty
    public Driver() {
        this.licenseNum = "";
        this.name = "";
        this.numPoints = 0;
        this.contactNum = "";

    }

    // Constructor - With passed in details
    public Driver(String licenseNumber, String name, int points, String contact) {

        this.licenseNum = licenseNumber;
        this.name = name;
        this.numPoints = points;
        this.contactNum = contact;

    }

    // returns driver license number
    public String getLicenseNumber() {
        return this.licenseNum;
    }

    // returns driver name
    public String getName() {
        return this.name;
    }

    // returns number of points on driver license
    public int getNumberOfPoints() {
        return this.numPoints;
    }

    // returns driver contact number
    public String getContactNumber() {
        return this.contactNum;
    }

    // Updates driver license number
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNum = licenseNumber;
    }

    // Updates driver name
    public void setName(String name) {
        this.name = name;
    }

    // Updates driver number of points on license
    public void setNumberOfPoints(int points) {
        this.numPoints = points;
    }

    // Updates driver contact number
    public void setContactNumber(String contact) {
        this.contactNum = contact;
    }

    // Displays Driver details
    public String toString() {
        return "Driver license number: " + this.licenseNum + "\n" + "Driver name: " + this.name + "\n"
                + "Number of points driver currently holds: " + this.numPoints + "\n" + "Driver contact number: "
                + this.contactNum + "\n";
    }
}
