
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


/*
    public void setTurboOn(){
	    turboOn = true;
    }

    public void setTurboOff(){
	    turboOn = false;
    }

    public double speedFactor(){
        double turbo = 1;
        if(turboOn) {
            turbo = 1.3;
            return enginePower * 0.01 * turbo;
        }
        if(trimFactor > 1.0) {
            return enginePower * 0.01 * trimFactor;
        }
        return enginePower * 0.01;

    }


    private void incrementSpeed(double amount){
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

