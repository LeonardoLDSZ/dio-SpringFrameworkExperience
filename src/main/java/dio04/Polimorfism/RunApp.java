package dio04.Polimorfism;

class RunApp {

    public static void main(String[] args){
        MotherClass[] classes = new MotherClass[]{new DaughterClass1(), new DaughterClass2(), new MotherClass()};

        for (MotherClass classe: classes) {

            classe.method1();
        }

        System.out.println("");

        for (MotherClass classe: classes) {
            classe.method2();
        }

        System.out.println("");

        DaughterClass2 daughterClass2 = new DaughterClass2();
        daughterClass2.method2();
    }
}
