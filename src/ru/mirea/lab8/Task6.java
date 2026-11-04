package ru.mirea.lab8;

import java.util.Scanner;

public class Task6 {
    public static String checkPrime(int n, int d) {
        if (d * d > n) {
            return "YES";
        }

        if (n % d == 0) {
            return "NO";
        }

        return checkPrime(n, d + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите n (> 1): ");
        int n = sc.nextInt();
        System.out.println(checkPrime(n, 2));
    }
}
