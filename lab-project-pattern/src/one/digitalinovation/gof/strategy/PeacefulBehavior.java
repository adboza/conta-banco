package one.digitalinovation.gof.strategy;

public class PeacefulBehavior implements Behavior {
    @Override
    public void move() {
        System.out.println("Hugging peacefully...");
    }
}
