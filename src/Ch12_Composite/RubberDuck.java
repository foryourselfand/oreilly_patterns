package Ch12_Composite;

public class RubberDuck implements Quackable {
    public void quack() {
        System.out.println("Squeak");
    }

    public String toString() {
        return "Rubber Duck";
    }
}