package com.pluralsight;


import java.util.ArrayList;
import java.util.List;



public class Dealership {

    private String name;

    private String address;

    private String Phone;

    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        Phone = phone;
        this.inventory = new ArrayList<>();

    }

    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max) {

        ArrayList<Vehicle> filteredVehicles = new ArrayList<>();

        for (Vehicle v : inventory){

            if (v.getPrice() >= min && v.getPrice() <= max) { filteredVehicles.add(v); } } return filteredVehicles; }


    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model) {

        ArrayList<Vehicle> vehiclesByMakeModel = new ArrayList<>();

        for (Vehicle v : inventory) {

            if (v.getMake().equalsIgnoreCase(make) && v.getModel().equalsIgnoreCase(model)) {

                vehiclesByMakeModel.add(v);
            }
        }
        return vehiclesByMakeModel;
    }
    public List<Vehicle> getAllVehicles() {
        return new ArrayList<>(inventory);
    }

    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        inventory.remove(vehicle);
    }

    public ArrayList<Vehicle> getVehiclesByYear(int min, int max) {

        ArrayList<Vehicle> vehiclesByYear = new ArrayList<>();

        for (Vehicle v : inventory) {

            if (v.getYear() >= min && v.getYear() <= max){

                vehiclesByYear.add(v);
            }
        }
        return vehiclesByYear;
    }
    public ArrayList<Vehicle> getVehiclesByColor(String color) {

        ArrayList<Vehicle> vehiclesByColor = new ArrayList<>();

        for (Vehicle v : inventory) {

            if (v.getColor().equalsIgnoreCase(color)){

                vehiclesByColor.add(v);
            }
        }
        return vehiclesByColor;
    }
public ArrayList<Vehicle> getVehiclesByMileage(int min, int max) {

    ArrayList<Vehicle> vehiclesByMileage = new ArrayList<>();

    for (Vehicle v : inventory) {

        if (v.getOdometer() >= min && v.getOdometer() <= max) {

            vehiclesByMileage.add(v);
        }
    }
    return vehiclesByMileage;
}
    public ArrayList<Vehicle> getVehiclesByType(String type) {

        ArrayList<Vehicle> vehiclesByType = new ArrayList<>();

        for (Vehicle v : inventory) {

            if (v.getVehicleType().equalsIgnoreCase(type)){

                vehiclesByType.add(v);
            }
        }
        return vehiclesByType;
    }

    }




















