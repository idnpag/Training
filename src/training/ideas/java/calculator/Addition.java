package training.ideas.java.calculator;

/**
 * Created by idnpag on 7/21/2014.
 */
public class Addition {
    private final int first=0;
    private final int second=0;


    public static double add(double... numbers){
        int sum = 0;
        for (double number : numbers)
        {
            sum+=number;
        }
        return sum;
    }
}







