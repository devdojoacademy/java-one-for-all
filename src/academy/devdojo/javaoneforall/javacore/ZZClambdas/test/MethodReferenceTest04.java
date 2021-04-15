package academy.devdojo.javaoneforall.javacore.ZZClambdas.test;

import academy.devdojo.javaoneforall.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.javaoneforall.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

//Reference to a constructor
public class MethodReferenceTest04 {
    public static void main(String[] args) {
//        Supplier<AnimeComparators> animeComparatorsSupplier = () -> new AnimeComparators();
        Supplier<AnimeComparators> animeComparatorsSupplier = AnimeComparators::new;
        AnimeComparators animeComparators = animeComparatorsSupplier.get();
        List<Anime> animes = new ArrayList<>(List.of(new Anime("Berserk", 4000), new Anime("One Piece", 900), new Anime("Naruto", 500)));
        animes.sort(animeComparators::compareByEpisodeNonStatic);
        System.out.println(animes);
//        BiFunction<String, Integer, Anime> animeBiFunction = (title, episodes) -> new Anime(title,episodes);
        BiFunction<String, Integer, Anime> animeBiFunction = Anime::new;
        System.out.println(animeBiFunction.apply("Saint Seiya", 100));
    }
}
