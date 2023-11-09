import java.awt.*;
public class  Car implements Moveable {

        public int Dir = 90;
        public double Xpos = 0;
        public double Ypos = 0;
        public int nrDoors; // Number of doors on the car
        public double enginePower; // Engine power of the car
        public double currentSpeed; // The current speed of the car
        public Color color; // Color of the car
        public String modelName; // The car model name

        public Color getColor(){return color;}
        private void setColor(Color clr){
            color = clr;
        }
        public int getNrDoors(){
            return nrDoors;
        }
        public double getEnginePower(){
            return enginePower;
        }
        public void startEngine(){
            currentSpeed = 0.1;
        }

        public void stopEngine(){
            currentSpeed = 0;
        }

        public double getCurrentSpeed(){
            return currentSpeed;
        }
        public boolean turboOn;

        public double getXpos(){return Xpos;}
        public double getYpos(){return Ypos;}
        public double trimFactor;
        public double getTrimFactor(){return trimFactor;}

        public boolean hasTurbo;
        public boolean getHasTurbo(){return hasTurbo;}


    public void setTurboOn(){
        turboOn = true;
    }

    public void setTurboOff(){
        turboOn = false;
    }

    public double speedFactor(){
        return enginePower * 0.01;

    }

    private void incrementSpeed(double amount){
        currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
    }

    private void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
    }

    public void gas(double amount){
        if (amount >= 0  && amount <= 1) {
            incrementSpeed(amount);

        }
    }

    public void brake(double amount) {
        if (amount >= 0  && amount <= 1) {
            decrementSpeed(amount);
        }
    }

    @Override
    public void move() {
        int value = (Dir % 360);
        value = value / 90;
        switch (value){
            case 0:
                Xpos += getCurrentSpeed();
                break;
            case 1:
                Ypos += getCurrentSpeed();
                break;
            case 2:
                Xpos -= getCurrentSpeed();
                break;
            case 3:
                Ypos -= getCurrentSpeed();
                break;
        }

    }

    @Override
    public void turnleft() {
            Dir += 90;
            Dir = Dir % 360;

    }

    @Override
    public void turnright() {
            Dir -= 90;
            Dir += 360;
            Dir = Dir % 360;

    }

}
