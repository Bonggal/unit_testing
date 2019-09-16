package test.java.FizzBuzz;

import main.java.FizzBuzz.FizzBuzz;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class FizzBuzzTest {

    FizzBuzz sut;

    @Before
    public void Setup(){
        sut = new FizzBuzz();
    }

    @Test
    public void evaluateFizzBuzz_Fizz(){
        String result = sut.evaluateFizzBuzz(3);
        assertEquals("Fizz", result);
    }

    @Test
    public void evaluateFizzBuzz_Buzz(){
        String result = sut.evaluateFizzBuzz(5);
        assertEquals("Buzz",result);
    }

    @Test
    public void evaluateFizzBuzz_FizzBuzz(){
        String result = sut.evaluateFizzBuzz(15);
        assertEquals("FizzBuzz",result);
    }

    @Test
    public void evaluateFizzBuzz_number(){
        String result1 = sut.evaluateFizzBuzz(1);
        String result2 = sut.evaluateFizzBuzz(13);
        String result3 = sut.evaluateFizzBuzz(22);

        assertEquals("1",result1);
        assertEquals("13",result2);
        assertEquals("22",result3);
    }
}
