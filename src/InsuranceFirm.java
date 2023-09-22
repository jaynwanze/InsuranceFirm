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

    HashMap<Driver, Car> policyHolderList;
    ArrayList<Driver> driverList;
    ArrayList<Car> carList;
    ArrayList<Policy> policyList;

    final int maxPoints = 12;// final instance variable for the size of max size points driver can have on
                             // there license
    final int MAX_DRIVERS = 5;// final instance variable for the size of max number of drivers

    // Constructor class
    public InsuranceFirm() {

        for (int i = 1 ; i <= MAX_DRIVERS; i++) {
            System.out.print("\nDriver number " + i + ": ");
            
            // Intialise when creating drivers
            driverList = new ArrayList<Driver>();
            createDriver();// Method to add drivers

            // Intialise when creating drivers
            carList = new ArrayList<Car>();
            createCar(); // Method to add cars

            // Intialise when creating policies
            policyHolderList = new HashMap<Driver, Car>();
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

    public void createDriver() {

        Driver newDriver = null;

        String licenseNum, name, contactNum, ans;
        int numPoints;

        Scanner scan = new Scanner(System.in);

        // Enter valid drivers license
        System.out.print("\nEnter the drivers license number - Must be integer values and 4 characters long: ");

        do {
            licenseNum = scan.nextLine();

            if (licenseNum.isBlank() || (!licenseNum.matches("^\\d+(\\.\\d+)?")) || (licenseNum.length() != 4)) {
                System.out.println(
                        "\nPlease re-enter a drivers license number - Must be integer value and 4 characters long: ");
            }
        } while (licenseNum.isBlank() || (!licenseNum.matches("^\\d+(\\.\\d+)?")) || (licenseNum.length() != 4));

        // Enter valid name
        System.out.print("Enter the full name of driver: ");
        do {
            name = scan.nextLine();
            if (!name.matches("^[\\p{L} .'-]+$")) {
                System.out.println("Please re-enter a valid full name: ");
            }
        } while ((!name.matches("^[\\p{L} .'-]+$")));

        // Enter valid number of points
        System.out.print("Enter number of points on license: ");
        do {
            ans = scan.nextLine();

            if (!ans.matches("^\\d+(\\.\\d+)?") || ans.isBlank()) {
                System.out.println("\nInvalid entry- Please enter an integer: ");
            }

        } while ((!ans.matches("^\\d+(\\.\\d+)?")) || ans.isBlank());

        numPoints = Integer.parseInt(ans);

        // Enter contact number
        System.out.print("Enter contact number: ");
        do {
            contactNum = scan.nextLine();

            if (contactNum.isBlank() || (!licenseNum.matches("^\\d+(\\.\\d+)?")) || (contactNum.length() != 9)) {
                System.out.println(
                        "\nPlease re-enter a drivers license number - Must be integer value and 9 characters long: ");
            }
        } while (contactNum.isBlank() || (!contactNum.matches("^\\d+(\\.\\d+)?")) || (contactNum.length() != 9));

        newDriver = new Driver(licenseNum, name, numPoints, contactNum);

        driverList.add(newDriver);
        System.out.print("\nThis driver has now been created and is now added to the list!\n");

    }

    public void createCar() {
        Car newCar = null;

        String carReg, engineSize, ans;
        int yearManufactured;

        Scanner scan = new Scanner(System.in);

        // Enter valid car reg number
        System.out.print("\nEnter the car registration number - Must be integer values and 4 characters long: ");

        do {
            carReg = scan.nextLine();

            if (carReg.isBlank() || (carReg.length() != 4)) {
                System.out.println(
                        "\nPlease re-enter a car registration number - Must be integer value and 4 characters long: ");
            }
        } while (carReg.isBlank() || (carReg.length() != 4));

        // Enter car year of manufacture
        System.out.print("Enter the year of manufacture: ");
        do {

            ans = scan.nextLine();

            if (!ans.matches("^\\d+(\\.\\d+)?") || ans.isBlank() || (ans.length() != 4)) {
                System.out.println("\nInvalid entry- Please enter an integer and 4 characters long: ");
            }

        } while ((!ans.matches("^\\d+(\\.\\d+)?")) || ans.isBlank() || (ans.length() != 4));

        yearManufactured = Integer.parseInt(ans);

        // Enter car engine size
        System.out.print("Enter car engine size: ");

        do {
            engineSize = scan.nextLine();

            if (engineSize.isBlank()) {
                System.out.println(
                        "\nInvalid entry - Try Again: ");
            }
        } while (engineSize.isBlank());

        newCar = new Car(carReg, yearManufactured, engineSize);

        // Enter nct status
        System.out.print("Enter NCT status(True or False): ");
        do {

            ans = scan.nextLine();

            if (ans.isBlank() || !ans.equalsIgnoreCase("true") || !ans.equalsIgnoreCase("false")) {
                System.out.println(
                        "\nInvalid entry - Try Again: ");
            } else if (ans.equalsIgnoreCase("true")) {
                newCar.setNctStatus(true);
            }

        } while (ans.isBlank());

        carList.add(newCar);
        System.out.print("\nThis car has now been created and is now added to the list!\n");

    }

    public void createPolicy() {

        Driver d = null;
        Car c = null;
        Policy newPolicy;

        String licenseNum, carReg, id, ans;
        int numsClaims;
        double premium;

        Scanner scan = new Scanner(System.in);

        // Policy Creation
        System.out.print("\nNow lets create a policy!!!!!!!!!!!!!!!: ");
        // yes or no to create policy
        do {
            System.out.print("\nWould you like to create policy - (Yes/No): ");
            ans = scan.nextLine();
            if (ans.equalsIgnoreCase("yes")) {
                System.out.print("\nEnter the drivers license number - Must be integer values and 4 characters long: ");

                do {
                    licenseNum = scan.nextLine();

                    if (licenseNum.isBlank() || (!licenseNum.matches("^\\d+(\\.\\d+)?"))
                            || (licenseNum.length() != 4)) {
                        System.out.println(
                                "\nPlease re-enter a drivers license number - Must be integer value and 4 characters long: ");
                    }
                } while (licenseNum.isBlank() || (!licenseNum.matches("^\\d+(\\.\\d+)?"))
                        || (licenseNum.length() != 4));

                // If driver has less the 12 points on license
                if (checkPenaltyPoints(licenseNum) == false) {

                    // Enter valid drivers license
                    System.out.print(
                            "\nEnter the car registration number - Must be integer values and 4 characters long: ");

                    do {
                        carReg = scan.nextLine();

                        if (carReg.isBlank() || (!carReg.matches("^\\d+(\\.\\d+)?")) || (carReg.length() != 4)) {
                            System.out.println(
                                    "\nPlease re-enter a car registration number - Must be integer value and 4 characters long: ");
                        }
                    } while (carReg.isBlank() || (!carReg.matches("^\\d+(\\.\\d+)?")) || (carReg.length() != 4));

                    // Enter valid policy id
                    System.out.print("\nEnter valid policy id - Must be integer values and 4 characters long: ");
                    do {
                        id = scan.nextLine();

                        if (id.isBlank() || (!id.matches("^\\d+(\\.\\d+)?")) || (id.length() != 4)) {
                            System.out.println(
                                    "\nPlease re-enter a drivers license number - Must be integer value and 4 characters long: ");
                        }
                    } while (id.isBlank() || (!id.matches("^\\d+(\\.\\d+)?")) || (id.length() != 4));

                    // Enter policy premium
                    System.out.print("Enter policy premium: ");
                    do {

                        ans = scan.nextLine();

                        if (!ans.matches("^\\d+(\\.\\d+)?") || ans.isBlank()) {
                            System.out.println("\nInvalid entry- Please enter an integer: ");
                        }

                    } while ((!ans.matches("^\\d+(\\.\\d+)?")) || ans.isBlank());

                    premium = Double.parseDouble(ans);

                    // Enter number of claims
                    System.out.print("Enter number of claims: ");
                    do {

                        ans = scan.nextLine();

                        if (!ans.matches("^\\d+(\\.\\d+)?") || ans.isBlank()) {
                            System.out.println("\nInvalid entry- Please enter an integer: ");
                        }

                    } while ((!ans.matches("^\\d+(\\.\\d+)?")) || ans.isBlank());

                    numsClaims = Integer.parseInt(ans);

                    // Create New Policy
                    newPolicy = new Policy(id, premium, numsClaims);
                    // Set policyholder id
                    policyHolderList.put(d, c);
                    newPolicy.setPolicyHolderId(policyHolderList);
                    System.out.print(
                            "\n*******************************************************************************\n");
                    System.out.print("\nYour policy has been created!!!!!\n");
                    System.out.print(
                            "\n*******************************************************************************\n");
                }

                // Else error message policy operation cannot be completed
                else {

                    System.out.print(
                            "\n*******************************************************************************\n");
                    System.out.print("\nNot able to provide policy as driver has 12 or more penalty points\n");
                    System.out.print(
                            "\n*******************************************************************************\n");

                }
            } else if (ans.equalsIgnoreCase("false")) {
                System.out.print("\n*******************************************************************************\n");
                System.out.print("\nNo worries, Have a good day!!!!\n");
                System.out.print("\n*******************************************************************************\n");
            }
        } while (ans.isBlank());

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
