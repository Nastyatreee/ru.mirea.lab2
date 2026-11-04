package ru.mirea.lab14;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    static final Pattern EMAIL = Pattern.compile("[\\w.+-]+@[\\w-]+(\\.[\\w-]+)*");

    public static void main(String[] args) {
        String[] emails = {
                "user@example.com", "root@localhost", "nastya.orlova@mail.ru",
                "myhost@@@com.ru", "@my.ru", "Julia String"
        };
        for (String e : emails) {
            Matcher m = EMAIL.matcher(e);

            System.out.println(e + " -> " + (m.matches() ? "корректный" : "некорректный"));
        }
    }
}
