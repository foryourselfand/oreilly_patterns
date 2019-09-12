package Ch12_Composite.MVC.Model;

import Ch12_Composite.MVC.View.BPMObserver;
import Ch12_Composite.MVC.View.BeatObserver;

public interface HeartModelInterface {
    int getHeartRate();

    void registerObserver(BeatObserver o);

    void removeObserver(BeatObserver o);

    void registerObserver(BPMObserver o);

    void removeObserver(BPMObserver o);
}
