package com.pluralsight;


import java.io.BufferedReader;
import java.io.FileReader;

public class DealershipFileManager {


    public Dealership getDealership() {
        Dealership dealership = null;
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/inventory.csv"))) {
            String line = br.readLine();
            if (line != null) {
                String[] dealershipData = line.split("\\|");
                String name = dealershipData[0];
                String address = dealershipData[1];
                String phone = dealershipData[2];


                dealership = new Dealership(name, address, phone);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dealership;
    }
public void saveDealership(Dealership dealership) {
 }
}




