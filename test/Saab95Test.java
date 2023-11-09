import junit.framework.TestCase;
import org.junit.Test;

public class Saab95Test extends TestCase {

    @Test
    public void testspeed(){
        Saab95 test = new Saab95();
        test.startEngine();
        test.gas(1.0);
        assertEquals(1.35,test.getCurrentSpeed());
    }

    @Test
    public void testspeedturbo(){
        Saab95 test = new Saab95();
        test.startEngine();
        test.setTurboOff();
        test.stopEngine();
        test.setTurboOn();
        test.gas(10.0);
        assertEquals(0.0,test.getCurrentSpeed());
    }

    @Test
    public void testegetenginepower(){
        Saab95 test = new Saab95();
        assertEquals(125.0, test.getEnginePower());
    }
    @Test
    public void testmodelname(){
        Saab95 test = new Saab95();
        assertEquals("src.Saab95", test.modelName);
    }
}
