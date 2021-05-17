package academy.devdojo.javaoneforall.javacore.Ycollection.test;



import academy.devdojo.javaoneforall.javacore.Ycollection.domain.Customer;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();

        map.put("A","Letter A");
        map.put("D","Letter D");
        map.put("C","Letter C");
        map.put("B","Letter B");
        map.put("E","Letter E");

        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() +"-"+entry.getValue());
        }
        System.out.println(map.headMap("C",true));
        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println(map.ceilingKey("C"));
        System.out.println(map.higherKey("C"));
        System.out.println(map.floorKey("C"));
        System.out.println(map.lowerKey("C"));


    }
}
