
import javax.swing.*;
import java.awt.*;

public class Saab95 extends Car{

    public Saab95(){
        setNrDoors(2);
        setColor(Color.red);
        setEnginePower(125);
	    turboOn = false;
        setmodelname("src.Saab95");
        stopEngine();

    }

    public void setTurboOn(){
        turboOn = true;
    }

    public void setTurboOff(){
        turboOn = false;
    }

    @Override
    public double speedFactor() {

        if (turboOn) {
            return getEnginePower() * 0.01 * 1.3;
        }
        return getEnginePower() * 0.01;
    }
}

