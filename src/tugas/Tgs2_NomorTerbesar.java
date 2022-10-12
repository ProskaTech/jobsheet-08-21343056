package tugas;

// Created by Muhammad Asyrof_21343056

import javax.swing.JOptionPane;

public class Tgs2_NomorTerbesar {
    public static void main(String[] args) {
        int no[] = new int[11];
        int max;        

        for (int i = 1; i < no.length; i++) {
            String Kato = "Masukkan Angka ke-"+ i +": ";
            String Angko = JOptionPane.showInputDialog(Kato);
            no[i] = Integer.parseInt(Angko);
            }

            max = no[0];
            
            for (int i = 1; i < no.length; i++) {
                if (no[i] > max) {
                max = no[i];
                }
            }

            String msg = "Angka Terbesarnya adalah: "+max;
            JOptionPane.showMessageDialog(null, msg);
    }
}
