package com.pluralsight;

/*
 * Java Application: VehicleInventory
 *
 * Description:
 * This application manages the inventory for a used car dealership.
 * Users can use a menu to look up vehicles or add new vehicles to the list.
 *
 * Class: Vehicle
 * - Data Members:
 *   - vehicleId (long): e.g., 101121
 *   - makeModel (String): e.g., Ford Explorer
 *   - color (String): e.g., Red
 *   - odometerReading (int): e.g., 32775
 *   - price (float): e.g., 12250.00
 * - Include:
 *   - Constructor
 *   - Getter and Setter methods for each property
 *
 * In main():
 * - Create an array to hold up to 20 Vehicle objects
 * - Use a counter variable to track the number of vehicles
 * - Preload the array with 6 vehicles:
 *     vehicleId, makeModel, color, odometerReading, price
 *     101121, Ford Explorer, Red, 45000, 13500
 *     101122, Toyota Camry, Blue, 60000, 11000
 *     101123, Chevrolet Malibu, Black, 50000, 9700
 *     101124, Honda Civic, White, 70000, 7500
 *     101125, Subaru Outback, Green, 55000, 14500
 *     101126, Jeep Wrangler, Yellow, 30000, 16000
 *
 * Menu Options:
 *   1 - List all vehicles
 *   2 - Search by make/model
 *   3 - Search by price range
 *   4 - Search by color
 *   5 - Add a vehicle
 *   6 - Quit
 *
 * Recommended Implementation:
 * - Use a loop to prompt the user for a command.
 * - Match the command with a method using a switch statement.
 *
 * Example:
 * System.out.println("What do you want to do?");
 * System.out.println(" 1 - List all vehicles");
 * System.out.println(" 2 - Search by make/model");
 * System.out.println(" 3 - Search by price range");
 * System.out.println(" 4 - Search by color");
 * System.out.println(" 5 - Add a vehicle");
 * System.out.println(" 6 - Quit");
 * System.out.print("Enter your command: ");
 *
 * int command = scanner.nextInt();
 * switch(command) {
 *     case 1:
 *         listAllVehicles();
 *         break;
 *     case 2:
 *         findVehiclesByMakeModel();
 *         break;
 *     case 3:
 *         findVehiclesByPrice();
 *         break;
 *     case 4:
 *         findVehiclesByColor();
 *         break;
 *     case 5:
 *         addAVehicle();
 *         break;
 *     case 6:
 *         return;
 * }
 *
 * Note:
 * - Start by implementing options 1, 2, and 5.
 * - Add options 3 and 4 once the basics are functional.
 */

public class Vehicle {

    Long vehicleId;
    String makeModel;
    String color;
    int odometerReading;
    float price;


    public Vehicle() {



    }



    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


}
