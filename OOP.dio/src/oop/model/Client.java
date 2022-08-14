package oop.model;

import java.util.ArrayList;
import java.util.List;

public class Client extends Person{

    public String inCard;
    private List<Address> addresses;

   // public void addAddress(Address address){}
    public void addAdress(Address address) {
        if(address == null) {
            throw new NullPointerException("Address can't be null");
        }

        if (address.zipcode == null) {
            throw new NullPointerException("Zipcode can't be null");
        }

        getAddresses().add(address);
    }

    private List<Address> getAddresses() {
        if (addresses == null) {
            addresses = new ArrayList<Address>();
        }
        return addresses;
    }
}
