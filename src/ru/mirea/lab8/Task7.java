package ru.mirea.lab8;

import java.util.Scanner;

public class Task7 {
    public static void factorize(int n, int d) {
        if (n == 1) {
            return;
        }

        if (d * d > n) {
            System.out.print(n + " ");
            return;
        }
        if (n % d == 0) {
            System.out.print(d + " ");
            factorize(n / d, d);
        } else {
            factorize(n, d + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите n (> 1): ");
        int n = sc.nextInt();
        factorize(n, 2);
        System.out.println();
    }
}
