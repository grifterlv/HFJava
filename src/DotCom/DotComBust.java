package DotCom;
import java.util.*;
import SimpleDotCom.GameHelper;

public class DotComBust {
    private GameHelper helper = new SimpleDotCom.GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList (3);
    private int numOfGuesses = 0;

    //TODO: make setUpGame automatically create 3 DotCom objects and set names from User Inputs
    public void setUpGame () {
        DotCom one = new DotCom();
        DotCom two = new DotCom();
        DotCom three = new DotCom();
        one.setName("Pets.com");
        two.setName("eToys.com");
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        for (DotCom d : dotComsList) {
            ArrayList <String> newLocations = helper.placeDotCom(3);
            d.setLocationCells(newLocations);
        }
    }

    public void startPlaying () {

    }

    public void checkUserGuess () {

    }

    public void finishGame () {

    }
}
