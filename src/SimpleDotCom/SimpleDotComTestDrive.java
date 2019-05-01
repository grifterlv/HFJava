package SimpleDotCom;

import java.util.ArrayList;

public class SimpleDotComTestDrive {
    public static void main (String[] args) {
        SimpleDotCom dot = new SimpleDotCom();

        ArrayList <String> locations = new ArrayList<String>();
        locations.add("2");
        locations.add("3");
        locations.add("4");
        System.out.println("locations are: " + locations);

        dot.setLocationCells(locations);

        String userGuess = "2";
        String result = dot.checkYourSelf(userGuess);
        System.out.println("0: results is : " + result);
        String testResult = "Failed";

        if (result.equals("Hit")) {
            testResult = "Passed";
        }
        System.out.println("0 " + testResult);

        userGuess = "0";
        result = dot.checkYourSelf(userGuess);
        testResult = "Failed";

        if (result.equals("Miss")) {
            testResult = "Passed";
        }
        System.out.println("1 " + testResult);

        userGuess = "3";
        result = dot.checkYourSelf(userGuess);
        testResult = "Failed";

        if (result.equals("Hit")) {
            testResult = "Passed";
        }
        System.out.println("2 " + testResult);

        userGuess = "4";
        result = dot.checkYourSelf(userGuess);
        testResult = "Failed";

        if (result.equals("Kill")) {
            testResult = "Passed";
        }
        System.out.println("3 " + testResult);

//        System.out.println(testResult);
//        int r = (int) (Math.random() * 5);
//        System.out.println(r);

//        double y = 34.99;
//        int x = (int) y;
//        System.out.print("y is: " + y  + " x is: " + x);

    }
}
