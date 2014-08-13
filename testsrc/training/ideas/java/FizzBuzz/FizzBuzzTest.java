package training.ideas.java.FizzBuzz;

import org.junit.Assert;
import org.junit.Test;



/**
 * Created by idnpag on 8/11/2014.
 */
public class FizzBuzzTest {

    @Test
    public void fizzBuzz_when_number_enter_3(){
        int input=3;
        String expected="Fizz";
        Assert.assertEquals(expected,FizzBuzz.fizzBuzzCalc(input));
    }

}
