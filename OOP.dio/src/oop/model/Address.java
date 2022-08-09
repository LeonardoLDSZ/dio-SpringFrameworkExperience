package oop.model;

public class Address {

    public enum AddressType {
        RESIDENTIAL,
        DELIVERY,
        WORK
    }

    public String address;
    public String addressNumber;
    public String addressComplement;
    public String neighborhood;
    public String state;
    public String zipcode;

}
