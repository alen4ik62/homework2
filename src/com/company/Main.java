package com.company;

public class Main {

    public static void main(String[] args) {

        int [] mass = {6, 4, 9, 12, 54, 34, 17, 48, 72, 14, 7};

        int [] sortMas = GnomeSort.sort(mass);

        for (int i = 0; i < sortMas.length; i++) {
            System.out.println(sortMas[i]);
        }
    }
}
