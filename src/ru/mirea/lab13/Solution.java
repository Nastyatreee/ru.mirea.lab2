package ru.mirea.lab13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        System.out.print("Имя файла: ");
        String fileName = console.nextLine();

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        StringBuilder content = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line).append(' ');
        }
        reader.close();

        String[] words = content.toString().trim().split(" +");
        StringBuilder result = getLine(words);
        System.out.println(result);
    }

    public static StringBuilder getLine(String... words) {
        StringBuilder result = new StringBuilder();
        if (words.length == 0) {
            return result;
        }
        boolean[] used = new boolean[words.length];

        for (int i = 0; i < words.length; i++) {
            used[i] = true;
            result.append(words[i]);
            if (addNext(words, used, result, words[i], 1)) {
                return result;
            }

            used[i] = false;
            result.setLength(0);
        }
        return new StringBuilder("Цепочку составить невозможно");
    }

    private static boolean addNext(String[] words, boolean[] used, StringBuilder result,
                                   String last, int count) {
        if (count == words.length) {
            return true;
        }
        char end = Character.toLowerCase(last.charAt(last.length() - 1));
        for (int i = 0; i < words.length; i++) {
            if (!used[i] && Character.toLowerCase(words[i].charAt(0)) == end) {
                int lengthBefore = result.length();
                used[i] = true;
                result.append(' ').append(words[i]);
                if (addNext(words, used, result, words[i], count + 1)) {
                    return true;
                }
                used[i] = false;
                result.setLength(lengthBefore);
            }
        }
        return false;
    }
}
