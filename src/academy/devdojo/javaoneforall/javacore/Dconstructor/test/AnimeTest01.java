package academy.devdojo.javaoneforall.javacore.Dconstructor.test;

import academy.devdojo.javaoneforall.javacore.Dconstructor.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 12,"Finished");
        Anime anime2 = new Anime();
        anime.print();
        anime2.print();
    }
}
