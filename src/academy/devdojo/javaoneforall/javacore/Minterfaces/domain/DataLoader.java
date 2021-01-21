package academy.devdojo.javaoneforall.javacore.Minterfaces.domain;

public interface DataLoader {
    public abstract void load();

    public default void checkPermission(){
        System.out.println("Checking permission general");
    }
}
