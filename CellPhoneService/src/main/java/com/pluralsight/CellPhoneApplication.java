package com.pluralsight;


public class CellPhoneApplication {


    public static void main(String[] args) {

        CellPhone phone1 = new CellPhone();

        phone1.setSerialNumber(1234567);
        phone1.setModel("iPhone 15 pro");
        phone1.setCarrier("T-Mobil");
        phone1.setPhoneNumber("911");
        phone1.setOwner("Mo No Money");

        phone1.displayUserInfo();

    }
}

