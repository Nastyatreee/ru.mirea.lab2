package ru.mirea.lab11;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите год, месяц и число через пробел: ");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        System.out.print("Введите часы и минуты через пробел: ");
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.clear();

        calendar.set(year, month - 1, day, hour, minute);

        Date date = calendar.getTime();

        System.out.println("Объект Date: " + date);
        System.out.println("Отформатировано: "
                + new SimpleDateFormat("dd.MM.yyyy HH:mm").format(date));
        System.out.println("День недели в Calendar (1 - воскресенье): "
                + calendar.get(Calendar.DAY_OF_WEEK));
    }
}
