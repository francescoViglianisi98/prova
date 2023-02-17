package org.example;

public class MyClass {
    private String name;
    private String surname;

    public MyClass name(String name) {
        this.name = name;
        return this;
    }

    public MyClass surname(String surname) {
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
}
