package Ch12_Composite;

public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}