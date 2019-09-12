package Ch12_Composite.MVC;

import Ch12_Composite.MVC.Controller.ControllerInterface;
import Ch12_Composite.MVC.Controller.HeartController;
import Ch12_Composite.MVC.Model.HeartModel;

public class HeartTestDrive {
    public static void main(String[] args) {
        HeartModel heartModel = new HeartModel();
        ControllerInterface model = new HeartController(heartModel);
    }
}