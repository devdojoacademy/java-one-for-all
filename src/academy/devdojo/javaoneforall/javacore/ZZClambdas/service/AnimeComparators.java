package academy.devdojo.javaoneforall.javacore.ZZClambdas.service;

import academy.devdojo.javaoneforall.javacore.ZZClambdas.domain.Anime;

public class AnimeComparators {
    public static int compareByTitle(Anime a1, Anime a2) {
        return a1.getTitle().compareTo(a2.getTitle());
    }

    public static int compareByEpisode(Anime a1, Anime a2) {
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }
}
