package Subsystem1.crm;

public class CrmService {

    private CrmService(){
        super();
    }

    public static void saveClient(String name, String zipcode, String city, String state){
        System.out.println("Client saved at CRM's system.");
        System.out.println(name);
        System.out.println(zipcode);
        System.out.println(city);
        System.out.println(state);

    }
}
