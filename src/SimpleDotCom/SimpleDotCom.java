package SimpleDotCom;

import java.util.ArrayList;

public class SimpleDotCom {

    private ArrayList<String> locationCells;
    int numOfHits;

    String checkYourSelf (String stringGuess) {
        String result = "Miss";
//        int intGuess = Integer.parseInt(stringGuess);
        int index = locationCells.indexOf(stringGuess);

        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Kill";
            } else {
                result = "Hit";
            }
        }
        return result;
    }

    void setLocationCells (ArrayList<String> loc) {
        locationCells = loc;
    }
}
