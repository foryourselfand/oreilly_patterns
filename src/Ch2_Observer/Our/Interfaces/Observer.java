package Ch2_Observer.Our.Interfaces;

public interface Observer {
    public void update(float temperature,
                       float humidity,
                       float pressure);
}
