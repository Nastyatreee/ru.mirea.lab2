package ru.mirea.lab11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        String surname = "Анастасия";

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy 'в' HH:mm");

        long weekInMillis = 7L * 24 * 60 * 60 * 1000;
        Date received = new Date(System.currentTimeMillis() - weekInMillis);

        Date submitted = new Date();

        System.out.println("Разработчик: " + surname);
        System.out.println("Получено задание: " + format.format(received));
        System.out.println("Сдано задание:    " + format.format(submitted));
    }
}
