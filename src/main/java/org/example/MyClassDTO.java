package org.example;

public class MyClassDTO {
    private String name;
    private String surname;

    public MyClassDTO name(String name) {
        this.name = name;
        return this;
    }

    public MyClassDTO surname(String surname) {
        this.surname = surname;
        return this;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
