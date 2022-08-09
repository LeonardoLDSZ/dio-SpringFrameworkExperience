package poo;

import oop.model.Address;
import oop.model.Client;

import java.util.ArrayList;

public class CardDeliveryApp {

    public static void main(String[] args) {

        Address address = new Address();
        //Address Data


        Client client = new Client();
        //Client Data

        if (client.adresses == null) {
            client.adresses = new ArrayList<Address>();
        }

        client.adresses.add(address);
        System.out.println("Address added!");
    }
}


