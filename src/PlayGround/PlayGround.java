package PlayGround;

import java.util.*;

public class PlayGround {
    public static void main (String [] args) {
        PlayGround p = new PlayGround();

        ArrayList<Object> myList = new ArrayList();
        myList.add(1);
        myList.add("one");

        p.printAL(myList);
    }

    void printAL (ArrayList<Object> arr) {
        Iterator i = arr.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
