//************************************************************
// File name: Policy.java      
// Author: Jamin Nwanze
// Student Number: C21438482
// Description of class: Policy class for program
//************************************************************

import java.util.HashMap;

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

    public void increasePremium(double p) {

        this.premium = this.premium * 0.05;

    }

    // Displays Policy details
    public String toString() {
        return "Policy id: " + this.id + "\n" + "Policy premium: " + this.premium + "\n"
                + "Number of policy claims: " + this.numClaims + "\n";
    }
}
