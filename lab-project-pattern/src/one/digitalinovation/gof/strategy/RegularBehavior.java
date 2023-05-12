package one.digitalinovation.gof.strategy;

public class RegularBehavior implements Behavior {
    @Override
    public void move() {
        System.out.println("Making some regular movement...");
    }
}
