package ru.mirea.lab8;

import java.util.Scanner;

public class Task8 {
    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }

        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }

        return isPalindrome(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = sc.next();
        if (isPalindrome(word)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
