package ru.mirea.lab10;

import java.util.ArrayList;
import java.util.Comparator;

public class SortingStudentsByGPA {
    private ArrayList<Student> iDNumber = new ArrayList<>();

    public void setArray() {
        iDNumber.clear();
        iDNumber.add(new Student("Анастасия", "Орлова", "Прикладная информатика", 2, "ИНБО-05", 4.7));
        iDNumber.add(new Student("Дарья", "Фёдорова", "Бизнес-информатика", 3, "ИНБО-01", 4.0));
        iDNumber.add(new Student("Полина", "Егорова", "Прикладная информатика", 1, "ИНБО-12", 4.9));
        iDNumber.add(new Student("Алина", "Никитина", "Бизнес-информатика", 2, "ИНБО-05", 3.8));
        iDNumber.add(new Student("Мария", "Захарова", "Прикладная информатика", 4, "ИНБО-03", 4.4));
    }

    public void outArray() {
        for (Student s : iDNumber) {
            System.out.println(s);
        }
    }

    public void quickSort() {
        quickSort(iDNumber, 0, iDNumber.size() - 1, new ScoreComparator());
    }

    public void mergeSort() {
        ArrayList<Student> sorted = mergeSort(iDNumber, new ScoreComparator());
        iDNumber = sorted;
    }

    public void sortByCourse() {
        quickSort(iDNumber, 0, iDNumber.size() - 1, new CourseComparator());
    }

    public static void quickSort(ArrayList<Student> list, int low, int high, Comparator<Student> comp) {
        if (low >= high) {
            return;
        }
        Student pivot = list.get(high);
        int i = low;
        for (int j = low; j < high; j++) {
            if (comp.compare(list.get(j), pivot) < 0) {
                swap(list, i, j);
                i++;
            }
        }
        swap(list, i, high);
        quickSort(list, low, i - 1, comp);
        quickSort(list, i + 1, high, comp);
    }

    private static void swap(ArrayList<Student> list, int i, int j) {
        Student temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public static ArrayList<Student> mergeSort(ArrayList<Student> list, Comparator<Student> comp) {
        if (list.size() <= 1) {
            return list;
        }
        int mid = list.size() / 2;
        ArrayList<Student> left = new ArrayList<>(list.subList(0, mid));
        ArrayList<Student> right = new ArrayList<>(list.subList(mid, list.size()));
        return merge(mergeSort(left, comp), mergeSort(right, comp), comp);
    }

    public static ArrayList<Student> merge(ArrayList<Student> a, ArrayList<Student> b,
                                           Comparator<Student> comp) {
        ArrayList<Student> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < a.size() && j < b.size()) {
            if (comp.compare(a.get(i), b.get(j)) <= 0) {
                result.add(a.get(i));
                i++;
            } else {
                result.add(b.get(j));
                j++;
            }
        }

        while (i < a.size()) {
            result.add(a.get(i));
            i++;
        }
        while (j < b.size()) {
            result.add(b.get(j));
            j++;
        }
        return result;
    }

    public static void main(String[] args) {
        SortingStudentsByGPA s = new SortingStudentsByGPA();

        s.setArray();
        System.out.println("Исходный список:");
        s.outArray();

        s.quickSort();
        System.out.println("\nQuick Sort по баллу (убывание):");
        s.outArray();

        s.setArray();
        s.mergeSort();
        System.out.println("\nMerge Sort по баллу (убывание):");
        s.outArray();

        s.sortByCourse();
        System.out.println("\nСортировка по курсу:");
        s.outArray();
    }
}
