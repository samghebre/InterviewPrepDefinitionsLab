package Collection_And_Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection {
    public static void main(String[] args){
        ArrayList<String> nameList = new ArrayList<>();//creating arraylist

        nameList.add("Sam"); //adding object in the arraylist
        nameList.add("Sandu");
        nameList.add("Gideon");

        Iterator iterate = nameList.iterator();
        while(iterate.hasNext()){
            System.out.println(iterate.next());
        }
    }
}
