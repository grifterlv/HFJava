package SimpleDotCom;

public class SimpleDotComTestDrive {
    public static void main (String[] args) {
        SimpleDotCom dot = new SimpleDotCom();

        int [] locations = {2,3,4};
        dot.setLocationCells(locations);

        String userGuess = "2";
        String result = dot.checkYourSelf(userGuess);
        String testResult = "Failed";

        if (result.equals("Hit")) {
            testResult = "Passed";
        }
        System.out.println(testResult);

        userGuess = "0";
        result = dot.checkYourSelf(userGuess);
        testResult = "Failed";

        if (result.equals("Miss")) {
            testResult = "Passed";
        }
        System.out.println(testResult);

        userGuess = "3";
        result = dot.checkYourSelf(userGuess);
        testResult = "Failed";

        if (result.equals("Hit")) {
            testResult = "Passed";
        }
        System.out.println(testResult);

        userGuess = "4";
        result = dot.checkYourSelf(userGuess);
        testResult = "Failed";

        if (result.equals("Kill")) {
            testResult = "Passed";
        }
        System.out.println(testResult);
        int r = (int) (Math.random() * 5);
        System.out.println(r);


    }
}
