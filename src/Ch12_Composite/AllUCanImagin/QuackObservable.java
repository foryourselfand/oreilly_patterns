package Ch12_Composite.AllUCanImagin;

public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}