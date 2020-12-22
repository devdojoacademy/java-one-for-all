package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.test;

import academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain.Student;
import academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain.StudentPrinter;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();
        StudentPrinter printer = new StudentPrinter();

        student01.name = "Midoriya";
        student01.gender = 'M';
        student01.age = 15;

        student02.name = "Sakura";
        student02.gender = 'F';
        student02.age = 16;

        printer.print(student01);
        printer.print(student02);

        System.out.println("#####################");

        printer.print(student01);
        printer.print(student02);
    }
}
