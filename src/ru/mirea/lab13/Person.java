package ru.mirea.lab13;

public class Person {
    private String surname;
    private String name;
    private String middleName;

    public Person(String surname, String name, String middleName) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
    }

    private static boolean isEmpty(String s) {
        return s == null || s.trim().isEmpty();
    }

    public String getFio() {
        StringBuilder fio = new StringBuilder(surname);
        if (!isEmpty(name)) {
            fio.append(" ").append(name.charAt(0)).append(".");
        }
        if (!isEmpty(middleName)) {
            if (isEmpty(name)) {
                fio.append(" ");
            }
            fio.append(middleName.charAt(0)).append(".");
        }
        return fio.toString();
    }

    public static void main(String[] args) {
        Person[] people = {
                new Person("Усачева", "Анастасия", "Михайловна"),
                new Person("Попов", "Максим", ""),
                new Person("Ослопова", null, null)
        };
        for (Person p : people) {
            System.out.println(p.getFio());
        }
    }
}
