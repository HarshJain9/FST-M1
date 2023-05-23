package Activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Harsh");
        myList.add("Akhilesh");
        myList.add("Deepesh");
        myList.add("Shrey");
        myList.add("Rishabh");

        System.out.println("Print all the names:");
        for(String str : myList){
            System.out.println(str);
        }
        System.out.println("Third element in the ArrayList:" + myList.get(3));
        System.out.println("Is Nitin in the list:" + myList.contains("Nitin"));
        System.out.println("Size of the ArrayList:" + myList.size());
        myList.remove("Shrey");

        System.out.println("New size of the ArrayList:" + myList.size());
    }
}
