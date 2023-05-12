package one.digitalinovation.gof.singleton;

/**
 * Singleton eager example
 * @author adboza
 */
public class LazyHolderSingleton {
    private static class InstanceHolder {
        public static LazyHolderSingleton instantiated = new LazyHolderSingleton();
    }
    private LazyHolderSingleton(){
        super();
    }
    public static LazyHolderSingleton getInstantiated(){
        return InstanceHolder.instantiated;
    }
}
