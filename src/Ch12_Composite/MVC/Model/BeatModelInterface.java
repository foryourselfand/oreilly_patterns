package Ch12_Composite.MVC.Model;

import Ch12_Composite.MVC.View.BPMObserver;
import Ch12_Composite.MVC.View.BeatObserver;

public interface BeatModelInterface {
    void initialize();

    void on();

    void off();

    int getBPM();

    void setBPM(int bpm);

    void registerObserver(BeatObserver o);

    void removeObserver(BeatObserver o);

    void registerObserver(BPMObserver o);

    void removeObserver(BPMObserver o);
}