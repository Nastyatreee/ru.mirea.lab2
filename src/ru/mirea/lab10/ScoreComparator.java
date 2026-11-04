package ru.mirea.lab10;


import java.util.Comparator;

public class ScoreComparator implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        if (a.getScore() > b.getScore()) {
            return -1;
        } else if (a.getScore() < b.getScore()) {
            return 1;
        }
        return 0;
    }
}
