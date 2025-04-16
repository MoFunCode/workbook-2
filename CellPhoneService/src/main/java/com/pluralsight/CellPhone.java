package com.pluralsight;
/*
* Add a class named CellPhoneApplication and add the main() method.
Create a class named CellPhone. The class should have the following data
members:
- serialNumber (ex: 1000000 - 9999999)
- model (ex: iPhone X)
- carrier (ex: AT&T)
- phoneNumber (ex: 800-555-5555)
- owner (ex: Dana Wyatt)
Add a parameterless constructor. Provide the following default values for all
string data types in the constructor.
- serialNumber = 0
- model = ""
- carrier = ""
- phoneNumber = ""
- owner = ""
Provide getter and setter methods for all 5 data members.
*
*
* */
public class CellPhone {

    // Basic phone information
    public int serialNumber;
    String model;
    String carrier;
    String phoneNumber;
    String owner;

    // Constructor that takes all values when creating a phone object
    public CellPhone(int serialNumber, String model, String carrier, String phoneNumber, String ownerName) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = ownerName;
    }

    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    // Method to print out all the phone info for our person
    public void displayUserInfo() {
        System.out.println("Owner Name: " + owner + "\n"
                + "Serial Number: " + serialNumber + "\n"
                + "Model: " + model + "\n"
                + "Carrier: " + carrier + "\n"
                + "Phone Number: " + phoneNumber);
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}

