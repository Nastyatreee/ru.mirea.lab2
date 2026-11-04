package ru.mirea.lab8;

import java.util.Scanner;

public class Task9 {
    public static int count(int a, int b, boolean lastIsZero) {
        if (a == 0 && b == 0) {
            return 1;
        }
        int result = 0;

        if (a > 0 && !lastIsZero) {
            result = result + count(a - 1, b, true);
        }

        if (b > 0) {
            result = result + count(a, b - 1, false);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите a (нули): ");
        int a = sc.nextInt();
        System.out.print("Введите b (единицы): ");
        int b = sc.nextInt();

        System.out.println("Количество последовательностей: " + count(a, b, false));
    }
}
