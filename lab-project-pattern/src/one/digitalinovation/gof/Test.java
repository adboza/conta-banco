package one.digitalinovation.gof;

import one.digitalinovation.gof.facade.Facade;
import one.digitalinovation.gof.singleton.EagerSingleton;
import one.digitalinovation.gof.singleton.LazyHolderSingleton;
import one.digitalinovation.gof.singleton.LazySingleton;
import one.digitalinovation.gof.strategy.*;

public class Test {
    public static void main(String[] args) {
        //Singleton
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

        // Strategy
        Behavior regular = new RegularBehavior();
        Behavior peaceful = new PeacefulBehavior();
        Behavior defensive = new DefensiveBehavior();

        Robot robot = new Robot();
        robot.setBehavior(regular);
        robot.move();
        robot.move();
        robot.setBehavior(peaceful);
        robot.move();
        robot.setBehavior(defensive);
        robot.move();

        // Facade
        Facade facade = new Facade();
        facade.migrarCliente("Adriana", "12000-000");
    }
}
