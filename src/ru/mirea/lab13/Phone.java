package ru.mirea.lab13;


import java.util.Scanner;

public class Phone {
    private String number;

    public Phone(String number) {
        this.number = number.trim();
    }

    public String convert() {
        String code;
        String digits;
        int len = number.length();

        if (number.charAt(0) == '+') {
            code = number.substring(1, len - 10);
            digits = number.substring(len - 10);
        } else if (number.charAt(0) == '8' && len == 11) {
            code = "7";
            digits = number.substring(1);
        } else {
            return "неизвестный формат";
        }

        StringBuilder sb = new StringBuilder("+");
        sb.append(code);
        sb.append(digits, 0, 3).append('-');
        sb.append(digits, 3, 6).append('-');
        sb.append(digits, 6, 10);
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] tests = {"+79175655655", "+104289652211", "89175655655"};
        for (String t : tests) {
            System.out.println(t + " -> " + new Phone(t).convert());
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите свой номер: ");
        if (sc.hasNextLine()) {
            System.out.println(new Phone(sc.nextLine()).convert());
        }
    }
}
