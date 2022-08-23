package dio03.UpcastDowncast;

public class RunApp {

    public static void main(String[] args) {
        Employee employee = new Employee();


        Employee manager = new Manager();
        Employee seller = new Seller();
        Employee cleaner = new Cleaner();

        Seller seller_ = (Seller) new Employee();
    }
}
