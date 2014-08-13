package training.ideas.java.decisions;

import java.util.Arrays;

/**
 * Created by idnpag on 7/23/2014.
 */
public class FPLOSCalculator {


    public static String fplos(double rate, double... lrv) {
        String pattern = "";

        double Avglrv = 0;
        int los = 1;

        for (double lrvValueForaDay : lrv) {
            Avglrv += lrvValueForaDay;
            if (Avglrv / los <= rate) {
                pattern += "Y";
            } else {
                pattern += "N";
            }
            los++;

        }
        return pattern;
    }
}
