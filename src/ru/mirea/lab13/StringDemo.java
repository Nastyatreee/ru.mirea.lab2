package ru.mirea.lab13;


public class StringDemo {
    public static void work(String str) {
        System.out.println("Исходная строка: " + str);

        char last = str.charAt(str.length() - 1);
        System.out.println("2) Последний символ: " + last);

        System.out.println("3) endsWith(\"!!!\"): " + str.endsWith("!!!"));

        System.out.println("4) startsWith(\"I like\"): " + str.startsWith("I like"));

        System.out.println("5) contains(\"Java\"): " + str.contains("Java"));

        int index = str.indexOf("Java");
        System.out.println("6) indexOf(\"Java\"): " + index);

        System.out.println("7) replace('a', 'o'): " + str.replace('a', 'o'));

        System.out.println("8) toUpperCase(): " + str.toUpperCase());

        System.out.println("9) toLowerCase(): " + str.toLowerCase());

        String java = str.substring(index, index + "Java".length());
        System.out.println("10) substring: " + java);

        System.out.println("Исходная строка не изменилась: " + str);
    }

    public static void main(String[] args) {
        work("I like Java!!!");
    }
}
