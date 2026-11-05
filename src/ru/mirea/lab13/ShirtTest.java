package ru.mirea.lab13;


public class ShirtTest {
    public static void main(String[] args) {
        String[] shirts = {
                "s123, Adidas Shirt,Black,XL",
                "S043,Nike Shirt,Black,L",
                "S321,Sela Shirt,Blue,XL",
                "S678,Reserved Shirt,Blue,M",
                "S789,Super Shirt,Tan,XL",
                "S437,Sela T-Shirt,Black,XL",
                "S925,Puma T-Shirt,White,XL",
                "S008,Guess T-Shirt,White,L",
                "S183,Chanel T-Shirt,Green,S",
                "S601,Dior T-Shirt,Orange,S",
                "S691,Prada Shirt,Maroon,S"
        };

        Shirt[] shirtObjects = new Shirt[shirts.length];
        for (int i = 0; i < shirts.length; i++) {
            shirtObjects[i] = Shirt.parse(shirts[i]);
        }

        for (Shirt shirt : shirtObjects) {
            System.out.println(shirt);
        }
    }
}
