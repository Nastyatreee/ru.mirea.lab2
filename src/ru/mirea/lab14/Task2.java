package ru.mirea.lab14;

import java.util.regex.Pattern;

public class Task2 {
    static final Pattern EXACT = Pattern.compile("^abcdefghijklmnopqrstuv18340$");

    public static void main(String[] args) {
        String[] tests = {
                "abcdefghijklmnopqrstuv18340",
                "abcdefghijklmnoasdfasdpqrstuv18340",
                "abcdefghijklmnopqrstuv183400"
        };
        for (String s : tests) {
            boolean ok = EXACT.matcher(s).matches();
            System.out.println(s + " -> " + (ok ? "подходит" : "не подходит"));
        }
    }
}
