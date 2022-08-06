package dio06.Interface;

class Calculator implements MathOperation{

    @Override
    public void sum(double operation1, double operation2) {
        System.out.println("SUM: " + (operation1 + operation2));
    }

    @Override
    public void sub(double operation1, double operation2){
        System.out.println("SUB: " + (operation1 - operation2));
    }

    @Override
    public void multi(double operation1, double operation2){
        System.out.println("MULTI: " + (operation1 * operation2));
    }

    @Override
    public void div(double operation1, double operation2){
        System.out.println("DIV: " + (operation1 / operation2));
    }

}
