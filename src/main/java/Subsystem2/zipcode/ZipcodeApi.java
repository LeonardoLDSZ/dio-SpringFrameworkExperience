package Subsystem2.zipcode;

public class ZipcodeApi {

    private static ZipcodeApi instance = new ZipcodeApi();
    private ZipcodeApi(){
        super();
    }

    public static ZipcodeApi getInstance(){
        return instance;
    }

    public String cityRecovery(String zipcode) {
        return "Blumenau";
    }

    public String stateRecovery(String zipcode) {
        return "Santa Catarina";
    }
}
