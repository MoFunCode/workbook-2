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
* */

public class CellPhoneApplication {
    public static void main(String[] args) {

        CellPhone phone1 = new CellPhone();

        phone1.setSerialNumber(1234567);
        phone1.setModel("iPhone 15 pro");
        phone1.setCarrier("T-Mobile");
        phone1.setPhoneNumber("512-123-4567");
        phone1.setOwner("Mo");

        CellPhone phone2 = new CellPhone(7654321, "Samsung S24", "AT&T", "737-987-6543", "Mohamed");

        phone1.displayUserInfo();
        phone2.displayUserInfo();
    }
}

