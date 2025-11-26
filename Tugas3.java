import java.util.Scanner;

public class Tugas3 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Array gaji pokok untuk golongan A, B, C
        double[] gajiPokok = {5000000, 6500000, 9500000};
        
        // Array persentase lembur
        double[] persenLembur = {0.30, 0.32, 0.34, 0.36, 0.38};
        
        // Input data
        System.out.print("Masukkan Golongan (A/B/C): ");
        String golongan = input.nextLine().toUpperCase();
        
        System.out.print("Masukkan Jam Lembur: ");
        int jamLembur = input.nextInt();
        
        // Variabel untuk menyimpan index array
        int indexGolongan = -1;
        int indexLembur = -1;
        
        // MENGGUNAKAN STATEMENT IF untuk menentukan index golongan
        if (golongan.equals("A")) {
            indexGolongan = 0;
        } else if (golongan.equals("B")) {
            indexGolongan = 1;
        } else if (golongan.equals("C")) {
            indexGolongan = 2;
        } else {
            System.out.println("Golongan tidak valid!");
            input.close();
            return;
        }
        
        // MENGGUNAKAN STATEMENT IF untuk menentukan index lembur
        if (jamLembur == 1) {
            indexLembur = 0;
        } else if (jamLembur == 2) {
            indexLembur = 1;
        } else if (jamLembur == 3) {
            indexLembur = 2;
        } else if (jamLembur == 4) {
            indexLembur = 3;
        } else if (jamLembur >= 5) {
            indexLembur = 4;
        } else {
            indexLembur = -1; // Tidak lembur
        }
        
        // Mengambil gaji pokok dari array
        double gaji = gajiPokok[indexGolongan];
        
        // Menghitung gaji lembur
        double gajiLembur = 0;
        if (indexLembur != -1) {
            gajiLembur = gaji * persenLembur[indexLembur];
        }
        
        // MENGGUNAKAN OPERATOR untuk menghitung total
        double totalGaji = gaji + gajiLembur;
        
        // Output hasil
        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Golongan: " + golongan + " (Array index: " + indexGolongan + ")");
        System.out.println("Gaji Pokok: Rp " + gaji);
        
        if (indexLembur != -1) {
            System.out.println("Jam Lembur: " + jamLembur + " jam");
            System.out.println("Persentase Lembur: " + (persenLembur[indexLembur] * 100) + "% (Array index: " + indexLembur + ")");
            System.out.println("Gaji Lembur: Rp " + gajiLembur);
        } else {
            System.out.println("Tidak ada lembur");
        }
        
        System.out.println("Total Gaji: Rp " + totalGaji);
        
        input.close();
    }
}
