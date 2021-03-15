package academy.devdojo.javaoneforall.javacore.Xserialization.domain;

import java.io.Serializable;

public class Student implements Serializable {
    private Long id;
    private String name;
    private String password;

    public Student(Long id, String name, String password) {
        System.out.println("Inside student constructor");
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
