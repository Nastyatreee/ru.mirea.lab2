package ru.mirea.lab9;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return Double.compare(b.getFinalScore(), a.getFinalScore());
    }

    public void quickSort(Student[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        Student pivot = arr[(left + right) / 2];
        int i = left;
        int j = right;
        while (i <= j) {
            while (compare(arr[i], pivot) < 0) {
                i++;
            }

            while (compare(arr[j], pivot) > 0) {
                j--;
            }

            if (i <= j) {
                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        quickSort(arr, left, j);
        quickSort(arr, i, right);
    }
}
