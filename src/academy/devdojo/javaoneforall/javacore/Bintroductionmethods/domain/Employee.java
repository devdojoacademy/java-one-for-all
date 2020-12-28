package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain;

public class Employee {
    public String name;
    public int age;
    public double[] salaries;

    public void print() {
        System.out.println(this.name);
        System.out.println(this.age);
        if (this.salaries != null) {
            for (double salary : this.salaries) {
                System.out.print(salary + " ");
            }
        }
        calculateAndPrintAverageSalary();
    }

    public void calculateAndPrintAverageSalary() {
        if (this.salaries == null) return;

        double average = 0;

        for (double salary : this.salaries) {
            average += salary;
        }

        average /= this.salaries.length;

        System.out.println("\nThe average salary is " + average);

    }
}
