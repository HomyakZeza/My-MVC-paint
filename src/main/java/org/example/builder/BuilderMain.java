package org.example.builder;

public class BuilderMain {
    public static void main(String[] args) {
        Person p = Person.builder()
                .BirthDate("07.01.2001")
                .Height(1.7)
                .build();
        System.out.println(p);
    }
}
