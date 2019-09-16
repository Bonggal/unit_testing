package test.java.Calculator;

import main.java.Calculator.Calculator;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class CalculatorTest {

    private Calculator sut;
    private double DELTA;

    @Before
    public void setup(){
        sut = new Calculator();
        DELTA = 1e-15;
    }

    @Test
    public void addition(){
        int result = sut.addition(1,2);
        assertEquals(3, result);
    }

    @Test
    public void substraction(){
        int result = sut.substraction(2,2);
        assertEquals(0, result);
    }

    @Test
    public void multiplication(){
        int result = sut.multiplication(2,2);
        assertEquals(4, result);
    }

    @Test
    public void division(){
        double result = sut.division(3,2);
        assertEquals( 1.5, result, DELTA);
    }

    @Test
    public void squareRoot(){
        double result = sut.squareRoot(4);
        assertEquals( 2, result, DELTA);
    }

    @Test
    public void power(){
        double result = sut.power(4,2);
        assertEquals( 16, result, DELTA);
    }

    @Test
    public void modulus(){
        double result1 = sut.modulus(4,2);
        double result2 = sut.modulus(3,2);

        assertEquals( 0, result1, DELTA);
        assertEquals( 1, result2, DELTA);
    }

}
