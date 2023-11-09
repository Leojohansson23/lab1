import java.awt.*;

public class Volvo240 extends Car{

    public Volvo240(){
        nrDoors = 4;
        color = Color.black;
        enginePower = 100;
        modelName = "src.Volvo240";
        stopEngine();
        trimFactor = 1.25;
        hasTurbo = false;
    }

    @Override
    public double speedFactor() {
        if(trimFactor > 1.0) {
            return enginePower * 0.01 * trimFactor;
        }
        return enginePower * 0.01;
    }

}
