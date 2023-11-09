import java.awt.*;

public class Volvo240 extends Car{

    public Volvo240(){
        setNrDoors(4);
        setColor(Color.black);
        setEnginePower(100);
        setmodelname("src.Volvo240");
        stopEngine();
        setTrimFactor(1.25);
    }

    @Override
    public double speedFactor() {
        return getEnginePower() * 0.01 * getTrimFactor();
    }

}
