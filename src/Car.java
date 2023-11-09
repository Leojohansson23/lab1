import java.awt.*;
public class  Car implements Moveable {

        private int Direction = 90;
        private double Xpos = 0;
        private double Ypos = 0;
        private int nrDoors; // Number of doors on the car
        private double enginePower; // Engine power of the car
        private double currentSpeed; // The current speed of the car
        private Color color; // Color of the car
        private String modelName; // The car model name
        public Color getColor(){return color;}
        public String getModelName(){return modelName;}
        public void setColor(Color clr){
            color = clr;
        }
        public int setNrDoors(int doors){
            return this.nrDoors = doors;
        }
        public int getNrDoors(){return nrDoors;}
        public double setEnginePower(double power){
                return this.enginePower = power;
        }

        public String setmodelname(String name){return this.modelName = name;}


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
        private double trimFactor;
        public double setTrimFactor(double trim){return this.trimFactor = trim;}
        public double getTrimFactor(){return trimFactor;}



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
        int value = (Direction % 360);
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
            Direction += 90;
            Direction = Direction % 360;

    }

    @Override
    public void turnright() {
            Direction -= 90;
            Direction += 360;
            Direction = Direction % 360;

    }

}
