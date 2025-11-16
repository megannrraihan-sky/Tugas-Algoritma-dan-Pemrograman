import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input data
        System.out.print("Masukkan Golongan (A/B/C): ");
        String golongan = input.nextLine().toUpperCase();
        
        System.out.print("Masukkan Jam Lembur: ");
        int jamLembur = input.nextInt();
        
        // Tentukan gaji pokok
        double gajiPokok = 0;
        if (golongan.equals("A")) {
            gajiPokok = 5000000;
        } else if (golongan.equals("B")) {
            gajiPokok = 6500000;
        } else if (golongan.equals("C")) {
            gajiPokok = 9500000;
        }
        
        // Tentukan persentase lembur
        double persentase = 0;
        if (jamLembur == 1) persentase = 0.30;
        else if (jamLembur == 2) persentase = 0.32;
        else if (jamLembur == 3) persentase = 0.34;
        else if (jamLembur == 4) persentase = 0.36;
        else if (jamLembur >= 5) persentase = 0.38;
        
        // Hitung total gaji
        double gajiLembur = gajiPokok * persentase;
        double totalGaji = gajiPokok + gajiLembur;
        
        // Output hasil
        System.out.println("\nTotal Penghasilan: Rp " + totalGaji);
        
        input.close();
    }
}