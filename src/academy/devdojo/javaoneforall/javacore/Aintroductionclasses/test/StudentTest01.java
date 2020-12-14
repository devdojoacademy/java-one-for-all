package academy.devdojo.javaoneforall.javacore.Aintroductionclasses.test;

import academy.devdojo.javaoneforall.javacore.Aintroductionclasses.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.age = 21;
        student.name = "Luffy";
        student.gender = 'M';

        System.out.println(student.age);
        System.out.println(student.name);
        System.out.println(student.gender);
    }
}
