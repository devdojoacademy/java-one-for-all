package academy.devdojo.javaoneforall.javacore.Ycollection.test;

import academy.devdojo.javaoneforall.javacore.Ycollection.domain.Manga;
import academy.devdojo.javaoneforall.javacore.Ycollection.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneNameComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneNameComparator());
        set.add(new Smartphone("111", "LG"));
        System.out.println(set);
        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(5L, "Pokemon", 19.99,0));
        mangas.add(new Manga(3L, "Hellsing ultimate", 59.99,5));
        mangas.add(new Manga(1L, "Berserk", 29.99,0));
        mangas.add(new Manga(2L, "Attack on titan", 39.99,8));
        mangas.add(new Manga(4L, "Dragon Ball Z", 89.99,0));
        mangas.add(new Manga(10L, "Slime", 1.99,0));
        mangas.add(new Manga(11L, "Slime", 2.99,0));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
