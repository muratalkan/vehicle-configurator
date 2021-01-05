package SystemClassAndMain;

import GUI.MainFrame;

public class VehicleMain {
     public static void main(String[] args) {
        
        VehicleSys.readFromFile();
        MainFrame vf = new MainFrame();
        vf.setVisible(true);
        
    }
}