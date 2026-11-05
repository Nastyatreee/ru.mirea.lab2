package ru.mirea.lab11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Student {
    private String name;
    private String surname;
    private Date birthDate;

    public Student(String name, String surname, Date birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public String formatBirthDate(String type) {
        Locale ru = Locale.forLanguageTag("ru");
        String pattern;
        switch (type) {
            case "короткий":
                pattern = "dd.MM.yy";
                break;
            case "средний":
                pattern = "dd.MM.yyyy";
                break;
            default:
                pattern = "d MMMM yyyy, EEEE";
        }
        return new SimpleDateFormat(pattern, ru).format(birthDate);
    }

    @Override
    public String toString() {
        return "Студентка " + surname + " " + name + ", родилась " + formatBirthDate("полный");
    }

    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar(2007, 0, 8);
        Student st = new Student("Анастасия", "Усачева", cal.getTime());

        System.out.println(st);
        System.out.println("Короткий: " + st.formatBirthDate("короткий"));
        System.out.println("Средний:  " + st.formatBirthDate("средний"));
        System.out.println("Полный:   " + st.formatBirthDate("полный"));
    }
}
