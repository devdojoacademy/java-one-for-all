package academy.devdojo.javaoneforall.javacore.Gassociation.test;

import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Place;
import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Professor;
import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Seminar;
import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Student;

public class ExerciseAssociationTest01 {
    public static void main(String[] args) {
        Place place = new Place("5th Av");
        Student student = new Student("Luffy", 17);
        Student student2 = new Student("Nami", 17);
        Student[] seminarStudents = {};
        Seminar seminar = new Seminar("Finding one piece",seminarStudents, place);
        Seminar[] availableSeminars = {seminar};
        Professor professor = new Professor("White Beard", "Pirates", availableSeminars);

        professor.print();
    }
}
