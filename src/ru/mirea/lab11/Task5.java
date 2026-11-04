package ru.mirea.lab11;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        System.out.println("Операция          ArrayList(мкс)  LinkedList(мкс)");
        printRow("добавление", addTest(arrayList), addTest(linkedList));
        printRow("вставка", insertTest(arrayList), insertTest(linkedList));
        printRow("поиск", searchTest(arrayList), searchTest(linkedList));
        printRow("удаление", removeTest(arrayList), removeTest(linkedList));
    }

    static long addTest(List<String> list) {
        long start = System.nanoTime();
        for (int i = 0; i < 50000; i++) {
            list.add("элемент" + i);
        }
        return (System.nanoTime() - start) / 1000;
    }

    static long insertTest(List<String> list) {
        long start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list.add(list.size() / 2, "новый" + i);
        }
        return (System.nanoTime() - start) / 1000;
    }

    static long searchTest(List<String> list) {
        long start = System.nanoTime();
        for (int i = 0; i < 500; i++) {
            list.contains("элемент49999");
        }
        return (System.nanoTime() - start) / 1000;
    }

    static long removeTest(List<String> list) {
        long start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list.remove(0);
        }
        return (System.nanoTime() - start) / 1000;
    }

    static void printRow(String name, long a, long b) {
        System.out.printf("%-18s %14d %16d%n", name, a, b);
    }
}
