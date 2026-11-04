package ru.mirea.lab13;


public class Shirt {
    private String code;
    private String name;
    private String color;
    private String size;

    public Shirt(String code, String name, String color, String size) {
        this.code = code;
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public static Shirt parse(String line) {
        String[] parts = line.split(",");
        return new Shirt(parts[0], parts[1], parts[2], parts[3]);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Артикул:  ").append(code).append('\n');
        sb.append("Название: ").append(name).append('\n');
        sb.append("Цвет:     ").append(color).append('\n');
        sb.append("Размер:   ").append(size).append('\n');
        return sb.toString();
    }
}
