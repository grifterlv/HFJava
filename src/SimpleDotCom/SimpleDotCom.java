package SimpleDotCom;

public class SimpleDotCom {

    int[] locationCells;
    int numOfHits;

    String checkYourSelf (String stringGuess) {
        int intGuess = Integer.parseInt(stringGuess);
        String result = "Miss";

        for (int cell : locationCells) {
            if (intGuess == cell) {
                result = "Hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "Kill";
        }
        return result;
    }

    void setLocationCells (int[] loc) {
        locationCells = loc;
    }
}
