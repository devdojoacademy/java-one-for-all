package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain;

public class StudentPrinter {
    public void print(Student student) {
        System.out.println("-------------------");
        System.out.println(student.name);
        System.out.println(student.gender);
        System.out.println(student.age);

        student.name = "Gohan";
    }
}
