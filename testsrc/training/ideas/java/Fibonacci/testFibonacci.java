package training.ideas.java.Fibonacci;


import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by idnpag on 8/5/2014.
 */

public class testFibonacci {



    @Test
    public void testFibonacciWith7Elements(){

        Assert.assertArrayEquals(Fibonacci.getSeriesForAGivenNByRecursion(7),new int []{0,1,1,2,3,5,8});
    }

}
