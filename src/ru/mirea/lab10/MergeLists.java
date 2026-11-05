package ru.mirea.lab10;

import java.util.ArrayList;

public class MergeLists {
    public static void main(String[] args) {
        ArrayList<Student> list1 = new ArrayList<>();
        list1.add(new Student("Анастасия", "Усачева", "Информатика и вычислительная техника", 2, "КВБО-11-25", 4.7));
        list1.add(new Student("Алина", "Ерохова", "Прикладная информатика", 2, "КПБО-12-25", 3.8));
        list1.add(new Student("Вера", "Титова", "Медицинская физика", 2, "КФБО-13-26", 4.2));

        ArrayList<Student> list2 = new ArrayList<>();
        list2.add(new Student("Максим", "Попов", "Бизнес-информатика", 2, "КББО-14-25", 4.0));
        list2.add(new Student("Ксения", "Вострикова", "Системный анализ", 2, "КСБО-12-26", 4.5));

        ScoreComparator comp = new ScoreComparator();

        list1 = SortingStudentsByGPA.mergeSort(list1, comp);
        list2 = SortingStudentsByGPA.mergeSort(list2, comp);
        ArrayList<Student> all = SortingStudentsByGPA.merge(list1, list2, comp);

        System.out.println("Объединённый список (по баллу, убывание):");
        for (Student s : all) {
            System.out.println(s);
        }
    }
}
