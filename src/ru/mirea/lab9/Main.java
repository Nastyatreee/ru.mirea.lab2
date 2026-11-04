package ru.mirea.lab9;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student(7, "Соколова", 4.6),
                new Student(2, "Лебедева", 3.9),
                new Student(9, "Новикова", 4.8),
                new Student(4, "Козлова", 4.1),
                new Student(1, "Павлова", 3.5)
        };

        System.out.println("Исходный массив:");
        show(students);

        InsertionSort.sort(students);
        System.out.println("\nСортировка вставками по номеру:");
        show(students);

        SortingStudentsByGPA gpaSorter = new SortingStudentsByGPA();
        gpaSorter.quickSort(students, 0, students.length - 1);
        System.out.println("\nБыстрая сортировка по баллу (по убыванию):");
        show(students);
    }

    public static void show(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + ") " + students[i]);
        }
    }
}
