package academy.devdojo.javaoneforall.javacore.Cmethodoverloading.test;

import academy.devdojo.javaoneforall.javacore.Cmethodoverloading.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive","TV", 12,"Finished");
        anime.print();
    }
}
