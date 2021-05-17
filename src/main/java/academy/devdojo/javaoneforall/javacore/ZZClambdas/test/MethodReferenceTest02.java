package academy.devdojo.javaoneforall.javacore.ZZClambdas.test;

import academy.devdojo.javaoneforall.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.javaoneforall.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

//Reference to an instance method of a particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(new Anime("Berserk", 4000), new Anime("One Piece", 900), new Anime("Naruto", 500)));
        AnimeComparators animeComparators = new AnimeComparators();
        animes.sort(animeComparators::compareByEpisodeNonStatic);
        animes.sort((a1,a2) -> animeComparators.compareByEpisodeNonStatic(a1,a2));
        animes.sort((a1,a2) -> animeComparators.compareByEpisodeNonStatic(a1,a2));
        System.out.println(animes);
    }
}
