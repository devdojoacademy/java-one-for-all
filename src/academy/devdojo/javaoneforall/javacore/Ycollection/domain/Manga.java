package academy.devdojo.javaoneforall.javacore.Ycollection.domain;

import java.util.Objects;

public class Manga {
    private Long id;
    private String title;
    private double price;

    public Manga(Long id, String title, double price) {
        Objects.requireNonNull(id, "ID must not be null");
        Objects.requireNonNull(title, "title must not be null");
        this.id = id;
        this.title = title;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return id.equals(manga.id) && title.equals(manga.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
