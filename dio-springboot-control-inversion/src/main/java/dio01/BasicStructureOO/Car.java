package dio01.BasicStructureOO;

 public class Car {

    String color;
    String model;
    int tankCapacity;

     Car() {
     }

     Car(String color, String model, int tankCapacity) {
         this.color = color;
         this.model = model;
         this.tankCapacity = tankCapacity;
     }

     String getColor() {
         return color;
     }

     void setColor(String color) {
         this.color = color;
     }

     String getModel() {
         return model;
     }

     void setModel(String model) {
         this.model = model;
     }

     void setTankCapacity(int tankCapacity) {
         this.tankCapacity = tankCapacity;

     }

     int getTankCapacity() {
         return tankCapacity;

     }

     double totalTankValue(double fuelValue){ //Business method

         return tankCapacity * fuelValue;
     }
 }



