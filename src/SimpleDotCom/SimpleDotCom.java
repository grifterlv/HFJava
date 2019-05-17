package SimpleDotCom;

import java.util.ArrayList;

public class SimpleDotCom {

    private ArrayList<String> locationCells;

    String checkYourSelf (String stringGuess) {

        String result = "Miss";
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
