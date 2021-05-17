package academy.devdojo.javaoneforall.javacore.Ycollection.test;

import academy.devdojo.javaoneforall.javacore.Ycollection.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByTitleComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getTitle().compareTo(manga2.getTitle());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Pokemon", 19.99));
        mangas.add(new Manga(3L, "Hellsing ultimate", 59.99));
        mangas.add(new Manga(1L, "Berserk", 29.99));
        mangas.add(new Manga(2L, "Attack on titan", 39.99));
        mangas.add(new Manga(4L, "Dragon Ball Z", 89.99));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("-----------------");
        Collections.sort(mangas);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("-----------------");
//        Collections.sort(mangas, new MangaByTitleComparator());
        mangas.sort(new MangaByTitleComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
