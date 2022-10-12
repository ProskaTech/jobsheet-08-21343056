package latihan;

// Created by Muhammad Asyrof_21343056

public class ArraySample3{
    // String array 4 baris x 2 kolom
    public static void main(String[] args) {
        String[][] dogs = {{"Terry", "brown"},      //baris ke 0
                            {"Kristin", "white"},   //baris ke 1
                            {"Toby", "gray"},       //baris ke 2
                            {"Fido", "blcak"}       //baris ke 3
                        };
                        
        // mengakses variable dogs dengan indeks baris 0, indeks kolom 0
        System.out.println(dogs[0][0]);
    }
}