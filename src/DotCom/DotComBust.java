package DotCom;

import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList <DotCom> dotComsList = new ArrayList<DotCom>();
    private  int numOfGuesses = 0;

    private void setUpGame() {
        // first make some dot coms and give them locations
        DomCom one = new DotCom();
        DomCom two = new DotCom();
        DomCom three = new DotCom();

        one.setName("Java.com");
        two.setName("Python.com");
        three.setName("CPP.com");

        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        // print brief instructions for user
        System.out.println("Your goal is to sink three dotcoms");
        System.out.println("Java.com, Paython.com, and CPP.com");
        System.out.println("Try to sink all of them");

        // ask GameHelper to provide locations for all DotCom objects
        for (DotCom dotComToSet : dotComsList) {
            ArrayList <String> newLocations = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocations);
        }

    }
    private void startPlaying() {
        while ( !dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess();
        }
        finishGame();
    }
    private void checkUserGuess(String userGuess) {
        numOfGuesses ++;
        String result = "miss";
        for (int x = 0; x < dotComsList.size(); x++) {
            result = dotComsList.get(x).checkYourself(userGuess);
            if (result.equals("hit")){
                break;
            }
            if (result.equals("kill")) {
                dotComsList.remove(x);
                break;
            }
        }
        System.out.println(result);

    }
    private void finishGame() {
        System.out.println("All Dot Com are dead! Your stock is now worthless.");
    }

    public static void main () {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
