package com.pluralsight;


public class CellPhoneApplication {

    public static void display(CellPhone phone) {

        System.out.println("\nCellPhone Details:");
        System.out.println("Owner: " + phone.getOwner());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Serial: " + phone.getSerialNumber());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
    }

    public static void main(String[] args) {
        // Create first CellPhone object(phone1)
        CellPhone phone1 = new CellPhone();

        // Set properties for phone1
        phone1.setSerialNumber(1234567);
        phone1.setModel("iPhone 15 pro");
        phone1.setCarrier("Cricket");
        phone1.setPhoneNumber("911");
        phone1.setOwner("Mo No Money");

        // Create second CellPhone object (phone2) - This is a new requirement
        CellPhone phone2 = new CellPhone();

        // Set properties for phone2
        phone2.setSerialNumber(7654321);
        phone2.setModel("Verizon");
        phone2.setPhoneNumber("222");
        phone2.setOwner("Gio");

        // Make phone1 call phone2's number
        phone1.dial(phone2.getPhoneNumber());   // Prints: "Mo No Money's phone is calling 222"

        // Make phone2 call phone1's number
        phone2.dial(phone1.getPhoneNumber());   // Prints: "Gio's phone is calling 911"

        // Display phone details using the staticmethod (new change)
        // Show complete info for phone1
        display(phone1);

        // Show complete info for phone2
        display(phone2);
    }
}



