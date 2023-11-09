

public class  Main {

        public static void main(String[] args) {


                Saab95 saabbil = new Saab95();
                saabbil.startEngine();
                saabbil.move();
                saabbil.move();
                saabbil.turnleft();
                saabbil.move();
                System.out.println(saabbil.getXpos());
                System.out.println(saabbil.getYpos());
                saabbil.gas(1.0);
                System.out.println(saabbil.getCurrentSpeed());






        }

}