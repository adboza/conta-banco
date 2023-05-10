package one.digitalinovation.gof;

public class Test {
    public static void main(String[] args) {
        LazySingleton lazy = LazySingleton.getInstantiated();
        System.out.println(lazy);
        lazy = LazySingleton.getInstantiated();
        System.out.println(lazy);

        EagerSingleton eager = EagerSingleton.getInstantiated();
        System.out.println(eager);
        eager = EagerSingleton.getInstantiated();
        System.out.println(eager);

        LazyHolderSingleton lazyHolder = LazyHolderSingleton.getInstantiated();
        System.out.println(lazyHolder);
        lazyHolder = LazyHolderSingleton.getInstantiated();
        System.out.println(lazyHolder);
    }
}
