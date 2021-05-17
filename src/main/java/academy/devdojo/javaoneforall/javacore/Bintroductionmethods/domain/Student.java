package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain;

public class Student {
    public String name;
    public int age;
    public char gender;

    public void print(){
        System.out.println("---------------");
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);
    }
}
