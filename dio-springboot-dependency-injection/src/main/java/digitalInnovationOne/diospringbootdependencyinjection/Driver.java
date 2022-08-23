package digitalInnovationOne.diospringbootdependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;

public class Driver {

    public static void main(String[] args){
        Driver driver = new Driver(new Motorcycle());
        driver.automotor();
    }

    @Autowired
    private Vehicle vehicle;

    public Driver(Vehicle obj) {
        this.vehicle = obj;
    }

    public void automotor() {
        vehicle.action();
    }
}
