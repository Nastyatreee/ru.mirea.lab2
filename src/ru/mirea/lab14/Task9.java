package ru.mirea.lab14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9 {
    public static void main(String[] args) {
        String text = "Java is a high-level programming language, i love java a lot probably. ";

        int[] counts = new int[26];
        int total = 0;

        Matcher m = Pattern.compile("[a-z]").matcher(text.toLowerCase());
        while (m.find()) {
            char letter = m.group().charAt(0);
            counts[letter - 'a']++;
            total++;
        }

        System.out.println("Всего букв: " + total);
        System.out.println("Буква  Кол-во  Частота");
        for (int i = 0; i < 26; i++) {
            if (counts[i] > 0) {
                double percent = counts[i] * 100.0 / total;
                System.out.printf("  %c    %4d    %5.2f%%%n", (char) ('a' + i), counts[i], percent);
            }
        }
    }
}
