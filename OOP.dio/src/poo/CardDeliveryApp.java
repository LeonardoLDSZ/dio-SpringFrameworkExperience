package poo;

import oop.model.Address;
import oop.model.Client;

public class CardDeliveryApp {

    public static void main(String[] args) {

        Address address = new Address();
        address.zipcode = "00000000";
        //Address Data
        Client client = new Client();
        //Client Data

       try {
           System.out.println("Address added!");
       }catch (Exception e) {
           System.err.println("Error adding an address: " + e.getMessage());
       }
    }
}


