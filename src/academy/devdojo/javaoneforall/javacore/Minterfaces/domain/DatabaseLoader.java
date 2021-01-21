package academy.devdojo.javaoneforall.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Loading data from database");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from database");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permission in the database");
    }
}
