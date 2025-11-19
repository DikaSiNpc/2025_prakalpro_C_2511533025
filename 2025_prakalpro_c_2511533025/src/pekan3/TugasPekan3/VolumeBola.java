package TugasPekan3;

import java.util.Scanner;

public class VolumeBola {
    public static void main(String[] args) {
        // Nilai pi
        double pi = 3.14;
        
        // Membuat objek Scanner
        Scanner input = new Scanner(System.in);
        
        // Meminta input jari-jari
        System.out.print("Masukkan jari-jari bola: ");
        double r = input.nextDouble();
        
        // Menghitung volume bola: V = (4/3) * pi * r^3
        double volume = (4.0 / 3.0) * pi * r * r * r;
        
        // Menampilkan hasil
        System.out.println("Volume bola = " + volume);
        
        // Menutup Scanner
        input.close();
    }
}
