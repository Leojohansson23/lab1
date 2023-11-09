import java.awt.*;

public class Volvo240 extends Car{

    //public final static double trimFactor = 1.25;
    
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

    //public double speedFactor(){ return enginePower * 0.01 * trimFactor;}

    /*
    private void incrementSpeed(double amount){
        //intervall
        currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
    }

    private void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
    }

    // TODO fix this method according to lab pm
    public void gas(double amount){
        if (amount >= 0  && amount <= 1) {
            incrementSpeed(amount);
        }
    }

    // TODO fix this method according to lab pm
    public void brake(double amount) {
        if (amount >= 0  && amount <= 1) {
            decrementSpeed(amount);
        }
    }

     */

}
