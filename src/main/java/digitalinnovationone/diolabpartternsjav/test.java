package digitalinnovationone.diolabpartternsjav;

import digitalinnovationone.diolabpartternsjav.Facade.Facade;
import digitalinnovationone.diolabpartternsjav.Singleton.SingletonHurry;
import digitalinnovationone.diolabpartternsjav.Singleton.SingletonLazy;
import digitalinnovationone.diolabpartternsjav.Singleton.SingletonLazyHolder;
import digitalinnovationone.diolabpartternsjav.Strategy.*;

public class test {

    public static void main(String[] args) {

        // Singleton

        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        System.out.println();

        SingletonHurry hurry = SingletonHurry.getInstance();
        System.out.println(hurry);
        hurry = SingletonHurry.getInstance();
        System.out.println(hurry);

        System.out.println();

        SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);

        System.out.println();
        //Strategy

        Behavior defensive = new DefensiveBehavior();
        Behavior normal = new NormalBehavior();
        Behavior offensive = new OffensiveBehavior();

        Robot robot = new Robot();
        robot.setBehavior(normal);
        robot.move();
        robot.move();
        robot.setBehavior(defensive);
        robot.move();
        robot.setBehavior(offensive);
        robot.move();
        robot.move();
        robot.move();
        System.out.println();


        //Facade

        Facade facade = new Facade();
        facade.clientMigration("John", "141414141");

    }
}
