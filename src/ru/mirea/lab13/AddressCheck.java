package ru.mirea.lab13;

public class AddressCheck {
    public static void main(String[] args) {
        System.out.println("а) Разделитель - запятая (split):");
        System.out.println(Address.fromCommaString(
                "Россия,  Московская область , Химки, Ленинградская , 12, 2, 101"));
        System.out.println(Address.fromCommaString(
                " Россия, Свердловская область, Екатеринбург, Малышева, 30, 1, 8 "));

        System.out.println("\nб) Разделители , . ; (StringTokenizer):");
        System.out.println(Address.fromAnySeparator(
                "Россия; Новосибирская область; Новосибирск; Красный проспект; 7; 4; 56"));
        System.out.println(Address.fromAnySeparator(
                "Казахстан. Алматинская область, Алматы; Абая. 44; 1, 3"));
    }
}
