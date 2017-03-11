package tutorial;


import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by cccce on 03/10/2017.
 */
public class CarTest {

    @Mock
    private Engine engine;

    @InjectMocks
    private Car car;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testWarning(){
        when(engine.getRpm()).thenReturn(6000);
        car.accelerate();
        assertEquals("Slow Down", car.getWarningMessage());
        //when(calc.abs(-20)).thenReturn(-20);
        //assertEquals(20, calc.abs(-20));
        //assertEquals(4,calc.abs(-4));
    }

}
