package academy.devdojo.javaoneforall.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("Loading data from database");
    }
}
