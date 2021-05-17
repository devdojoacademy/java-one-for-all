package academy.devdojo.javaoneforall.javacore.Ycollection.test;

import academy.devdojo.javaoneforall.javacore.Ycollection.domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L, "Pokemon", 19.99,0));
        mangas.add(new Manga(3L, "Hellsing ultimate", 59.99,5));
        mangas.add(new Manga(1L, "Berserk", 29.99,0));
        mangas.add(new Manga(2L, "Attack on titan", 39.99,8));
        mangas.add(new Manga(4L, "Dragon Ball Z", 89.99,0));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while(mangaIterator.hasNext()){
//            Manga manga = mangaIterator.next();
//            if(manga.getQuantity() == 0){
//                mangaIterator.remove();
//            }
//        }

        mangas.removeIf(manga -> manga.getQuantity() == 0);

        System.out.println(mangas);
    }
}
