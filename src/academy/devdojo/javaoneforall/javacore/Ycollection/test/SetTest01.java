package academy.devdojo.javaoneforall.javacore.Ycollection.test;

import academy.devdojo.javaoneforall.javacore.Ycollection.domain.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(5L, "Pokemon", 19.99,0));
        mangas.add(new Manga(3L, "Hellsing ultimate", 59.99,5));
        mangas.add(new Manga(1L, "Berserk", 29.99,0));
        mangas.add(new Manga(2L, "Attack on titan", 39.99,8));
        mangas.add(new Manga(4L, "Dragon Ball Z", 89.99,0));

        for(Manga manga: mangas){
            System.out.println(manga);
        }
    }
}
