package Ch12_Composite.MVC;

import Ch12_Composite.MVC.Controller.BeatController;
import Ch12_Composite.MVC.Controller.ControllerInterface;
import Ch12_Composite.MVC.Model.BeatModel;
import Ch12_Composite.MVC.Model.BeatModelInterface;

public class DJTestDrive {

    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
}