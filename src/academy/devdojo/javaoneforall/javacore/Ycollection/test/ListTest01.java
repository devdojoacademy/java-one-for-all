package academy.devdojo.javaoneforall.javacore.Ycollection.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("William");
        names.add("DevDojo Academy");

        for(String name : names){
            System.out.println(name);
        }
        names.add("Suane");
        System.out.println("----------");

        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

    }
}
