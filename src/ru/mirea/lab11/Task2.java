package ru.mirea.lab11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm");

        System.out.print("Введите дату и время (дд.мм.гггг чч:мм): ");
        String line = sc.nextLine();

        try {
            Date entered = format.parse(line);
            Date current = new Date();

            System.out.println("Сейчас:   " + format.format(current));
            System.out.println("Введено:  " + format.format(entered));

            int result = entered.compareTo(current);
            if (result < 0) {
                System.out.println("Введённая дата уже прошла");
            } else if (result > 0) {
                System.out.println("Введённая дата ещё не наступила");
            } else {
                System.out.println("Это текущий момент");
            }

            long diff = Math.abs(entered.getTime() - current.getTime());
            System.out.println("Разница: " + diff / (24L * 60 * 60 * 1000) + " дн.");
        } catch (ParseException e) {
            System.out.println("Ошибка: дата введена в неверном формате");
        }
    }
}
