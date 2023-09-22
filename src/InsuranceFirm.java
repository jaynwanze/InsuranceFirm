//************************************************************
// File name: InsuranceFirm.java      
// Author: Jamin Nwanze
// Student Number: C21438482
// Description of class: Main class for program
//************************************************************

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

//Public class
public class InsuranceFirm {

    ArrayList<Driver> driverList;
    ArrayList<Car> carList;
    ArrayList<Policy> policyList;

    final int maxPoints = 12;// final instance variable for the size of max size points driver can have on
                             // there license
    final int MAX_DRIVERS = 5;// final instance variable for the size of max number of drivers

    // Constructor class
    public InsuranceFirm() {

        for (int i = 1; i <= MAX_DRIVERS; i++) {
            System.out.print("\nDriver number " + i + ": ");

            // Intialise when creating drivers
            driverList = new ArrayList<Driver>();
            createDriver();// Method to add drivers

            // Intialise when creating drivers
            carList = new ArrayList<Car>();
            createCar(); // Method to add cars

            // Intialise when creating policies
            policyList = new ArrayList<Policy>();
            createPolicy(); // Method to add policies

            // Increase premium by 5 percent
            increasePremiumByPercent(0.05);

            // Show total number of claims
            showTotalNumberClaims();

            // Show total amount of premium
            showTotalPremiumAmount();
        }
    }

    // Method to create driver
    public void createDriver() {
        // Intializing car object

        Driver driver1 = null;
        Driver driver2 = null;

        // Enter valid drivers details and Add to list
        driver1 = new Driver("111111111", "John Smith", 7, "0861593429");
        driver2 = new Driver("222222222", "Jay Brady", 12, "0879438493");
        driverList.add(driver1);
        driverList.add(driver2);

    }

    // Method to create car
    public void createCar() {
        // Intializing car object
        Car car1 = null;
        Car car2 = null;

        // Enter valid car details and Add to list
        car1 = new Car("143D23454", 2012, "2.2");
        car2 = new Car("123H44334", 2004, "2.2");
        carList.add(car1);
        carList.add(car2);

    }

    // method to create policy
    public void createPolicy() {
        // Intializing policy object
        Policy policy1 = null;
        Policy policy2 = null;

        // Create New Policy and add to list
        policy1 = new Policy(driverList.get(0), carList.get(0), "1111", 1000.00, 2);
        policy2 = new Policy(driverList.get(1), carList.get(1), "2222", 2000.00, 1);
        policyList.add(policy1);
        policyList.add(policy2);

    }

    public void increasePremiumByPercent(double p) {

    }

    public void showTotalNumberClaims() {

    }

    public void showTotalPremiumAmount() {

    }

    public boolean checkPenaltyPoints(String licenseNumberString) {
        boolean result = false;

        for (Driver d : driverList) {

            if (d.getLicenseNumber().equalsIgnoreCase(licenseNumberString) && d.getNumberOfPoints() >= maxPoints) {
                result = true;
            }
        }
        return result;
    }

    // Method to call driver
    public static void main(String[] args) {
        new InsuranceFirm();
    }
}
