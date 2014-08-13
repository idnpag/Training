package training.ideas.java.FizzBuzz;

/**
 * Created by idnpag on 8/11/2014.
 */
public class FizzBuzz {

    public static String fizzBuzzCalc(int input) {
        String output = "";
        if (input % 3 == 0 && input % 5 == 0) {
            output = output + "FizzBuzz";
        } else if (input % 3 == 0) {
            output = output + "Fizz";
        } else if (input % 5 == 0) {
            output = output + "Buzz";
        } else {
            output = "" + input;
        }
        return output;

    }

}
