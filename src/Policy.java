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
    private int premium;// Policy name
    private int numClaims;// Number of claims on policy
    private HashMap<Driver, Car> policyHolderId; // Policy holder id


    // Constructor - Empty
    public Policy() {
        this.id = "";
        this.premium = 0;
        this.numClaims = 0;
        this.policyHolderId = null;
    }

    // Constructor - With passed in details
    public Policy(String id, int premium, int claims)
    {
        this.id = id;
        this.premium = premium;
        this.numClaims = claims;

    }

    // returns Policy id
    public String getId() {
        return this.id;
    }

    // returns Policy premium
    public int getPremium() {
        return this.premium;
    }

    // returns number of policy claims
    public int getNumberOfClaims() {
        return this.numClaims;
    }

    // returns policy holderid
    public HashMap<Driver, Car> getPolicyHolderId() {
        return this.policyHolderId;
    }

    // Updates Policy year manufactured
    public void setId(String id) {
        this.id = id;
    }

    // Updates Policy preium
    public void setPremium(int premium) {
        this.premium = premium;
    }

    // Updates number of policy claims
    public void setNumberOfClaims(int claims) {
        this.numClaims = claims;
    }

    // Updates policy holder id
    public void setPolicyHolderId(HashMap<Driver, Car>  policyHolder) {
        this.policyHolderId = policyHolder;

    }

    public void increasePremium() {

    }

    // Displays Policy details
    public String toString() {
        return "Policy id: " + this.id + "\n" + "Policy premium: " + this.premium + "\n"
        + "Number of policy claims: " + this.numClaims + "\n";
    }
}
