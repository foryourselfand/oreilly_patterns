package Ch12_Composite;

public class DuckCall implements Quackable {
    public void quack() {
        System.out.println("Kwak");
    }

    public String toString() {
        return "Duck Call";
    }
}