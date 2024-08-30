import java.util.Scanner;
public class Tlatihan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nilai tugas, UTS, dan UAS
        System.out.print("Masukkan nilai Tugas: ");
        float nilaiTugas = scanner.nextFloat();

        System.out.print("Masukkan nilai UTS: ");
        float nilaiUTS = scanner.nextFloat();

        System.out.print("Masukkan nilai UAS: ");
        float nilaiUAS = scanner.nextFloat();

        // Hitung nilai akhir
        float nilaiAkhir = (0.2f * nilaiTugas) + (0.35f * nilaiUTS) + (0.45f * nilaiUAS);

        // Tentukan grade berdasarkan nilai akhir
        char grade;
        if (nilaiAkhir >= 85) {
            grade = 'A';
        } else if (nilaiAkhir >= 75) {
            grade = 'B';
        } else if (nilaiAkhir >= 65) {
            grade = 'C';
        } else if (nilaiAkhir >= 49) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        // Tampilkan hasil
        System.out.printf("Nilai Akhir: %.2f\n", nilaiAkhir);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
