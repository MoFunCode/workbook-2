package com.pluralsight;

public class CellPhone {

    public int serialNumber;
    String model;
    String carrier;
    String phoneNumber;
    String owner;

    // constructor - creates a new empty phone
    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    // makes this phone call another number
    public void dial(String phoneNumberToCall) {
        System.out.println(this.owner + "'s phone is calling " + phoneNumberToCall);
    }

    // getters and setters
    // (these let us see and change phone details safely)

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

