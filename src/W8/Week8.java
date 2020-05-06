package W8;

// Array lists and linked lists are both implementations of lists. Give an example of a situation where an array list would be the better choice and one where a linked list would. Explain the reasons in each case.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Week8 {

    public static void main(String[] args) {

        ArrayList aL = new ArrayList();

        aL.add(15);
        aL.add(25);
        aL.add(40);

        System.out.println("aL.toString() = " + aL.toString());

        aL.remove(2);

        System.out.println("aL.toString() = " + aL.toString());



        List lL = new LinkedList();

        lL.add(20);
        lL.add(30);
        lL.add(50);

        System.out.println("lL.toString() = " + lL.toString());

        lL.remove(1);

        System.out.println("lL.toString() = " + lL.toString());

    }

}
