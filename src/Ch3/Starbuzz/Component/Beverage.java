package Ch3.Starbuzz.Component;

public abstract class Beverage {
    protected String description = "Unknown Beverage";
    Size size = Size.TALL;

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public abstract double cost();

    public enum Size {TALL, GRANDE, VENTI}
}
