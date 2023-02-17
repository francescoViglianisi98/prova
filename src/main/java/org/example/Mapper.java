package org.example;

public class Mapper {
    public static void main(String[] args) {
    }

    public static String map(MyClassDTO myClassDTO) {
     return new MyClass()
                .name(myClassDTO.getName())
                .surname(myClassDTO.getSurname())
             .toString();
    }
}