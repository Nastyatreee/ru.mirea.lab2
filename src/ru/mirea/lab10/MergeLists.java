package ru.mirea.lab10;

import java.util.ArrayList;

public class MergeLists {
    public static void main(String[] args) {
        ArrayList<Student> list1 = new ArrayList<>();
        list1.add(new Student("Анастасия", "Орлова", "Прикладная информатика", 2, "ИНБО-05", 4.7));
        list1.add(new Student("Алина", "Никитина", "Прикладная информатика", 2, "ИНБО-05", 3.8));
        list1.add(new Student("Вера", "Титова", "Прикладная информатика", 2, "ИНБО-05", 4.2));

        ArrayList<Student> list2 = new ArrayList<>();
        list2.add(new Student("Дарья", "Фёдорова", "Бизнес-информатика", 2, "ИНБО-06", 4.0));
        list2.add(new Student("Ксения", "Голубева", "Бизнес-информатика", 2, "ИНБО-06", 4.5));

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
