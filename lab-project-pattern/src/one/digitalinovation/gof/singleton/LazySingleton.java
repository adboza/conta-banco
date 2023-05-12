package one.digitalinovation.gof.singleton;

/**
 * Singleton lazy example
 * @author adboza
 */
public class LazySingleton {
    public static LazySingleton instantiated;
    private LazySingleton(){
        super();
    }
    public static LazySingleton getInstantiated(){
        if (instantiated == null){
            instantiated = new LazySingleton();
        }
        return instantiated;
    }
}
