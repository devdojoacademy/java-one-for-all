package academy.devdojo.javaoneforall.javacore.Xserialization.domain;

public class Seminar {
    private String name;

    public Seminar(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Seminar{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
