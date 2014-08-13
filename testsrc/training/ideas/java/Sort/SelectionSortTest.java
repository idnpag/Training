package training.ideas.java.Sort;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnpag on 8/6/2014.
 */
public class SelectionSortTest {

    @Test
    public void testSelectionSort(){

        int[] inputArray = new int[] {4, 2, 7};
        int[] expectedArray = new int[] {2, 4, 7};
        Assert.assertArrayEquals(expectedArray, SelectionSort.doSelectionSort(inputArray));
    }
}
