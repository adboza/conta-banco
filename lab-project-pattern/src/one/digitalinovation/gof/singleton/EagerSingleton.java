package one.digitalinovation.gof.singleton;

/**
 * Singleton eager example
 * @author adboza
 */
public class EagerSingleton {
    public static EagerSingleton instantiated = new EagerSingleton();
    private EagerSingleton(){
        super();
    }
    public static EagerSingleton getInstantiated(){
        return instantiated;
    }
}
