package academy.devdojo.javaoneforall.javacore.ZZKjunit.domain;

import java.util.Objects;

public record Manga(String name, int episodes) {
    public Manga {
        Objects.requireNonNull(name);
    }
}
