import junit.framework.TestCase;
import org.junit.Test;

public class Volvo240Test extends TestCase {

    @Test
    public void testspeed(){

        Volvo240 test = new Volvo240();
        test.startEngine();
        test.gas(0.2);
        test.gas(-2.0);
        assertEquals(4.0,test.getCurrentSpeed());
    }

    @Test
    public void testdoors(){
        Volvo240 test = new Volvo240();
        assertEquals(3,test.getNrDoors());
    }

    @Test
    public void testmove(){
        Volvo240 test = new Volvo240();
        test.startEngine();
        test.move();
        test.move();
        test.turnright();
        test.move();
        //assertEquals(3, test.getYpos());
        assertEquals(3,test.getXpos());
    }

}