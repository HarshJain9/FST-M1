package Activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("H");
        hs.add("A");
        hs.add("R");
        hs.add("S");
        hs.add("H");
        hs.add("J");
        System.out.println("Size of the HashSet is: " + hs.size());
        hs.remove("J");
        if(hs.remove("X")) {
            System.out.println("X has been removed from the HashSet");
        } else {
            System.out.println("X is not present in the HashSet");
        }
        System.out.println("Checking if H is present in the HashSet: " + hs.contains("H"));
    }
}
