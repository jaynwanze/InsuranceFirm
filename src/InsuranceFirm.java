//************************************************************
// File name: InsuranceFirm.java      
// Author: Jamin Nwanze
// Student Number: C21438482
// Description of class: Main class for program
//************************************************************

import java.util.ArrayList;

//Public class
public class InsuranceFirm {

    // Global Declarations/variables
    ArrayList<Driver> driverList = new ArrayList<Driver>();
    ArrayList<Car> carList = new ArrayList<Car>();
    ArrayList<Policy> policyList = new ArrayList<Policy>();

    Policy policy1;
    Policy policy2;
    Driver driver1, driver2, driver3;
    Car car1, car2, car3;

    // Constructor class
    public InsuranceFirm() {

        createDriver();// Method to add drivers
        createCar(); // Method to add cars
        createPolicy(); // Method to add policies
        increasePremiumByPercent(0.05);// Method to increase premium by 5%
        showTotalNumberClaims();// Show total number of claims
        showTotalPremiumAmount();// Show total amount made from premium

    }

    public void createDriver() {
        // Initialzing driver details
        driver1 = new Driver("647389232", "John Smith", 7, "0861593429");
        driver2 = new Driver("938459423", "Jay Brady", 10, "0879438493");
        driver3 = new Driver("223945854", "Michelle Long", 2, "0839450032");

        // Adding to drivers to list
        driverList.add(driver1);
        driverList.add(driver2);
        driverList.add(driver3);

        // Display driver list details
        System.out.println("************");
        System.out.println("Driver List:");
        System.out.println("************");

        // Displaying driver list details
        for (int i = 0; i < driverList.size(); i++) {

            System.out.println("Driver Number " + (i + 1) + ":" + "\n" + driverList.get(i));

        }

    }

    public void createCar() {
        // Initialzing car details and adding to car list
        car1 = new Car("142D23454", 2014, "2.0", false);
        car2 = new Car("121H44334", 2012, "1.6", true);
        car3 = new Car("05M10222", 2005, "1.2", true);

        // Display car list details
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);

        // Display car list details
        System.out.println("*********");
        System.out.println("Car List:");
        System.out.println("*********");

        // Displaying car list details
        for (int i = 0; i < carList.size(); i++) {

            System.out.println("Car Number " + (i + 1) + ":" + "\n" + carList.get(i));

        }

    }

    public void createPolicy() {
        // Create New Policy and add to list if driver has less than 12 points
        policy1 = new Policy(driver1, car1, "1111", 1000.00, 2);
        policy2 = new Policy(driver2, car2, "2222", 2000.00, 1);
        policyList.add(policy1);
        policyList.add(policy2);

        // Display policy list details
        System.out.println("************");
        System.out.println("Policy List:");
        System.out.println("************");

        // Displaying car list details
        for (int i = 0; i < policyList.size(); i++) {

            System.out.println("Policy Number " + (i + 1) + ":" + "\n" + policyList.get(i));

        }

    }

    public void increasePremiumByPercent(double premium) {
        // Loop to increase policy premiums in list
        for (int i = 0; i < policyList.size(); i++) {

            policyList.get(i).increasePremium(premium);

        }

        // Message to display increase in premium
        System.out.println("*************************************");
        System.out.println("All claims have been increased by 5%:");
        System.out.println("*************************************");

        // Displaying increased premiums
        for (int i = 0; i < policyList.size(); i++) {

            // Displaying increased premiums
            System.out.println("Policy Holder: " + policyList.get(i).getDriver().getName() + "\nPolicy ID:"
                    + policyList.get(i).getId() + "\nPolicy ID: " + policyList.get(i).getPremium() + "\n");

        }

    }

    public void showTotalNumberClaims() {
        // Intial value for total claims
        int totalClaims = 0;
        ;

        // Message to display increase in premium
        System.out.println("************************************************");
        System.out.println("Dislaying total number of claims for all policy:");
        System.out.println("************************************************");

        // Calculating total number of claims
        for (int i = 0; i < policyList.size(); i++) {
            totalClaims = policyList.get(i).getDriver().getNumberOfPoints() + totalClaims;

        }

        // Displaying total number of claims
        System.out.println("Total number of claims: " + totalClaims + "\n");

    }

    public void showTotalPremiumAmount() {
        // Intial value for total premium amount
        double totalPremAmount = 0;
        ;

        // Message to display increase in premium
        System.out.println("**************************************************************");
        System.out.println("Dislaying company profit accumulated from all policy premiums:");
        System.out.println("**************************************************************");

        // Calculating total premium amount
        for (int i = 0; i < policyList.size(); i++) {
            totalPremAmount = policyList.get(i).getPremium() + totalPremAmount;

        }

        // Displaying total premium amount
        System.out.println("Total amount made from all policy premiums: " + totalPremAmount);

    }

    // Method to call driver
    public static void main(String[] args) {
        new InsuranceFirm();
    }
}
