package digitalinnovationone.diolabpartternsjav.Singleton;

/*

Singleton - hurry
@author LeonardoLDSZ
 */
public class SingletonHurry {

    private static SingletonHurry instance = new SingletonHurry();

    private SingletonHurry(){
        super();
    }

    public static SingletonHurry getInstance(){
        return instance;
        }
    }

