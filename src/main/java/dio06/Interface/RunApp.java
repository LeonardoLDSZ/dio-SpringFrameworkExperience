package dio06.Interface;

public class RunApp {

    public static void main(String[] args){
        Calculator calculator = new Calculator();

        calculator.sum(20, 20);
        calculator.sub(35,10);
        calculator.div(100,50);
        calculator.multi(10,10);

        System.out.println(calculator);

    }
}
