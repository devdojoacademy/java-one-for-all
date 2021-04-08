package academy.devdojo.javaoneforall.javacore.ZZAinnerclasses.test;
class Animal {
    public void walk(){
        System.out.println("Animal walking");
    }
}
class Dog extends Animal {
    @Override
    public void walk() {
        System.out.println("Dog walking");
    }
}
public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Something is walking");
            }
            public void jump(){

            }
        };
        animal.walk();

    }
}
