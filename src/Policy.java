//************************************************************
// File name: Policy.java      
// Author: Jamin Nwanze
// Student Number: C21438482
// Description of class: Policy class for program
//************************************************************

public class Policy {

    // instance variable of Policy class
    private String id;// Policy id
    private Driver driver;
    private Car car;
    private double premium;// Policy name
    private int numClaims;// Number of claims on policy

    // Constructor - With passed in details
    public Policy(Driver driver, Car car, String id, double premium, int claims) {
        this.id = id;
        this.premium = premium;
        this.numClaims = claims;
        this.driver = driver;
        this.car = car;

    }


      //returns driver on policy
    public Driver getDriver() {
        return this.driver;
    }

    // returns car on policy
    public Car getCar() {
        return this.car;
    }

    // returns Policy id
    public String getId() {
        return this.id;
    }

    // returns Policy premium
    public double getPremium() {
        return this.premium;
    }

    // returns number of policy claims
    public int getNumberOfClaims() {
        return this.numClaims;
    }

    // Updates Policy year manufactured
    public void setId(String id) {
        this.id = id;
    }

    // Updates Policy premium
    public void setPremium(double premium) {
        this.premium = premium;
    }

    // Updates number of policy claims
    public void setNumberOfClaims(int claims) {
        this.numClaims = claims;
    }

    // Method to increase policy premiums
    public void increasePremium(double p) {
        //Variable of increased perectage 
        double increasedAmount;

        //Intializing increased amount
        increasedAmount = this.premium * p;

        //Updating and adding increase to current premium
        this.premium = this.premium + increasedAmount;

    }

    // Displays Policy details
    public String toString() {
        return "Policy id: " + this.id + "\n" + "Policy premium: " + this.premium + "\n"
                + "Number of policy claims: " + this.numClaims + "\n" + "Driver Name: " 
                + this.driver.getName() + "\n" + "Car Registration: " + this.car.getRegNumber() + "\n";
    }
}
