
import javax.swing.*;
import java.awt.*;

public class Saab95 extends Car{

    //public boolean turboOn;
    //public final static double trimFactor = 1.0;

    public Saab95(){
        nrDoors = 2;
        color = Color.red;
        enginePower = 125;
	    turboOn = false;
        modelName = "src.Saab95";
        stopEngine();
        trimFactor = 1.0;
        hasTurbo = true;

    }

    @Override
    public double speedFactor() {
        if (hasTurbo) {
            if (turboOn) {
                return enginePower * 0.01 * 1.3;
            }
        }
        return enginePower * 0.01;
    }
}

