package SimpleDotCom;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class SimpleDotComGame {
    public static void main (String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        SimpleDotCom game = new SimpleDotCom();

        int startPoint = (int)(Math.random() * 5);
        ArrayList<String> locations = new ArrayList<String>();
        locations.add(Integer.toString(startPoint));
        locations.add(Integer.toString(startPoint + 1));
        locations.add(Integer.toString(startPoint + 2));

        game.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive) {
//            System.out.println("Enter a number ");
//            Scanner scan = new Scanner(System.in);
//            String userGuess = scan.next();

            String userGuess = helper.getUserInput("Enter a number");
            String result = game.checkYourSelf(userGuess);
            numOfGuesses ++;
            System.out.println(result);
            if (result == "Kill") {

                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}
