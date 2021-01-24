package Collection_And_Collections;

import java.util.HashMap;
import java.util.Map;

public class Collections {
    public static void main(String[] args){
        Map<Integer,String> namesMap = new HashMap<>(); //create a map contains integer keys and string values

       //Add elements to the created map
        namesMap.put(345,"Sam");
        namesMap.put(465,"Sandu");
        namesMap.put(987, "Gideon");

        //Traverse the elements in any order
        for(Map.Entry map : namesMap.entrySet()){
            System.out.println(map.getKey() + " " + map.getValue());
        }

    }
}
