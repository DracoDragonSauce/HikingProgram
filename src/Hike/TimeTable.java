package Hike;

import java.util.HashMap;
import java.util.InputMismatchException;

public class TimeTable {

    static HashMap<Character , Integer> timeMap;

     public TimeTable() {

        new HashMap<>(); HashMap<Character , Integer> timeMap = new HashMap<>();

        timeMap.put('T' , 3);
        timeMap.put('W' , 8);
        timeMap.put('O' , 12);
        timeMap.put('S' , 20);


        this.timeMap = timeMap;

    }

    public TimeTable(HashMap<Character , Integer> newHashMap) {
        this.timeMap = newHashMap;
    }


    public static HashMap<Character, Integer> getTimeMap() {
        return timeMap;
    }

    public static int getTime(char terrain) throws InputMismatchException {
        new TimeTable();
        getTimeMap();

        if (timeMap.containsKey(Character.toUpperCase(terrain))) {
            return timeMap.get(Character.toUpperCase(terrain));
        } else {
            throw new InputMismatchException("Input Was Not A Valid Terrain Type");
        }

    }

    public static Integer getLargestKeyValue() {
        new TimeTable();
        Object[] blah = timeMap.values().toArray();
        return (Integer) blah[0];

    }

}
