package ru.mirea.lab13;


import java.util.StringTokenizer;

public class Address {
    private String country, region, city, street, house, korpus, flat;

    public static Address fromCommaString(String s) {
        String[] p = s.split(",");
        for (int i = 0; i < p.length; i++) {
            p[i] = p[i].trim();
        }
        return new Address(p);
    }

    public static Address fromAnySeparator(String s) {
        StringTokenizer tokenizer = new StringTokenizer(s, ",.;");
        String[] p = new String[7];
        for (int i = 0; i < 7; i++) {
            p[i] = tokenizer.nextToken().trim();
        }
        return new Address(p);
    }

    private Address(String[] p) {
        country = p[0];
        region = p[1];
        city = p[2];
        street = p[3];
        house = p[4];
        korpus = p[5];
        flat = p[6];
    }

    @Override
    public String toString() {
        return "[" + country + "] [" + region + "] [" + city + "] [" + street
                + "] дом [" + house + "] корп. [" + korpus + "] кв. [" + flat + "]";
    }
}
