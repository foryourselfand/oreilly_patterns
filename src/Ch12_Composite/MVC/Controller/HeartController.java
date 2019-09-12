package Ch12_Composite.MVC.Controller;

import Ch12_Composite.MVC.Model.HeartAdapter;
import Ch12_Composite.MVC.Model.HeartModelInterface;
import Ch12_Composite.MVC.View.DJView;

public class HeartController implements ControllerInterface {
    HeartModelInterface model;
    DJView view;

    public HeartController(HeartModelInterface model) {
        this.model = model;
        view = new DJView(this, new HeartAdapter(model));
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.disableStartMenuItem();
    }

    public void start() {
    }

    public void stop() {
    }

    public void increaseBPM() {
    }

    public void decreaseBPM() {
    }

    public void setBPM(int bpm) {
    }
}