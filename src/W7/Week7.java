/*
Give an example of a program that uses the nongeneric version of a class from the Java Collection Framework and the equivalent program that uses the generic version. How do the two implementations differ? Why is having the syntax of generics better?
 */


package W7;

import java.util.ArrayList;

public class Week7 {

    public static void main(String[] args) {

        ArrayList aa = new ArrayList();

        aa.add("cookies");
        aa.add("donuts");
        aa.add("shrimp");
        aa.add("eggs");
//        aa.add(3);

        // Have to use traditional for loop because you can have any datatype added when not using generics
        for (int i = 0; i < aa.size(); i++) {
            System.out.println("aa.get("+ i + ") = " + aa.get(i));
        }

        // For each loop would not work without using Generics
//        for (String  : aa) {
//            System.out.println();
//        }

        ArrayList<String> bb = new ArrayList<String>();

        bb.add("yael");
        bb.add("steve");
        bb.add("maria");
        bb.add("apple");
//        bb.add(2);        // Cannot add 2 because it is not a String like the Type Parameter is set too.

        // Can use a forEach loop
        for (String x : bb) {
            System.out.println(x);
        }

    }
}