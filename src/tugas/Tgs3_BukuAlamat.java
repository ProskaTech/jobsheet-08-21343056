package tugas;

// Created by Muhammad Asyrof_21343056

public class Tgs3_BukuAlamat {
    public static void main(String [] args){
       String [][] entry = new String [][] {
            {"Florence","735-1234", "Manila"},
            {"Joyce", "983-3333", "Quezon City"},
            {"Becca", "456-3322", "Manila"}
        };
       
        System.out.println("Name \t: "+ entry [0][0]);
        System.out.println("Tel. #\t: "+ entry [0][1]);
        System.out.println("Address : "+ entry [0][2]);
        System.out.println("\n");
        
        System.out.println("Name \t: "+ entry [1][0]);
        System.out.println("Tel. #\t: "+ entry [1][1]);
        System.out.println("Address : "+ entry [1][2]);
        System.out.println("\n");

        System.out.println("Name \t: "+ entry [2][0]);
        System.out.println("Tel. #\t: "+ entry [2][1]);
        System.out.println("Address : "+ entry [2][2]);
        System.out.println("\n");
    
    }
}
