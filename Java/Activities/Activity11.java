package Activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {

        HashMap<Integer, String> myMap = new HashMap<Integer, String>();
        myMap.put(1, "Black");
        myMap.put(2, "White");
        myMap.put(3, "Red");
        myMap.put(4, "Blue");
        myMap.put(5, "Brown");
        System.out.println("Colors are :" + myMap);
        myMap.remove(5, "Brown");
        System.out.println("Green color is in the map:" + myMap.containsValue("Green"));
        System.out.println("Size of the map:" + myMap.size());
    }
}
