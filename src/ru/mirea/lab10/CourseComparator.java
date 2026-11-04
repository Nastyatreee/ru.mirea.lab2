package ru.mirea.lab10;

import java.util.Comparator;

public class CourseComparator implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return a.getCourse() - b.getCourse();
    }
}
