package ru.mirea.lab8;

import java.util.Scanner;

public class Task5 {
    public static int digitSum(int n) {
        if (n == 0) {
            return 0;
        }

        return n % 10 + digitSum(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = sc.nextInt();
        System.out.println("Сумма цифр = " + digitSum(n));
    }
}
