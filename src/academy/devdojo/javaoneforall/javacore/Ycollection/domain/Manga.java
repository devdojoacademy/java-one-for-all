package academy.devdojo.javaoneforall.javacore.Ycollection.domain;

import java.util.Comparator;
import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String title;
    private double price;
    private int quantity;

    public Manga(Long id, String title, double price) {
        Objects.requireNonNull(id, "ID must not be null");
        Objects.requireNonNull(title, "title must not be null");
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public Manga(Long id, String title, double price, int quantity) {
        this(id, title, price);
        this.quantity = quantity;
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
                ", quantity=" + quantity +
                '}';
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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

    @Override
    public int compareTo(Manga other) {
        //this | other
        // -1 if this < other
        // 0 if this == other
        // 1 if this > other
//        if (this.id < other.id) {
//            return -1;
//        } else if (this.id.equals(other.id)) {
//            return 0;
//        } else {
//            return 1;
//        }
//        return this.id.compareTo(other.id);
        return this.title.compareTo(other.title);
//        return Double.compare(this.price, other.price);

    }
}
