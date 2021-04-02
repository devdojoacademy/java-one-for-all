package academy.devdojo.javaoneforall.javacore.Ycollection.test;

import academy.devdojo.javaoneforall.javacore.Ycollection.domain.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPriceComparator().reversed());

        mangas.add(new Manga(5L, "Pokemon", 19.99, 0));
        mangas.add(new Manga(3L, "Hellsing ultimate", 59.99, 5));
        mangas.add(new Manga(1L, "Berserk", 29.99, 0));
        mangas.add(new Manga(2L, "Attack on titan", 39.99, 8));
        mangas.add(new Manga(4L, "Dragon Ball Z", 89.99, 0));
        mangas.add(new Manga(10L, "Slime", 1.99, 0));

        while(!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }

    }
}
