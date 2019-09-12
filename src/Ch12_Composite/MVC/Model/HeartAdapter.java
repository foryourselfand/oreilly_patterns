package Ch12_Composite.MVC.Model;


import Ch12_Composite.MVC.Model.BeatModelInterface;
import Ch12_Composite.MVC.Model.HeartModelInterface;
import Ch12_Composite.MVC.View.BPMObserver;
import Ch12_Composite.MVC.View.BeatObserver;

public class HeartAdapter implements BeatModelInterface {
    HeartModelInterface heart;

    public HeartAdapter(HeartModelInterface heart) {
        this.heart = heart;
    }

    public void initialize() {
    }

    public void on() {
    }

    public void off() {
    }

    public int getBPM() {
        return heart.getHeartRate();
    }

    public void setBPM(int bpm) {
    }

    public void registerObserver(BeatObserver o) {
        heart.registerObserver(o);
    }

    public void removeObserver(BeatObserver o) {
        heart.removeObserver(o);
    }

    public void registerObserver(BPMObserver o) {
        heart.registerObserver(o);
    }

    public void removeObserver(BPMObserver o) {
        heart.removeObserver(o);
    }
}