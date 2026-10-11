import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Menentukan jumlah mahasiswa (minimal 3 objek)
        int jumlahMahasiswa = 3;
        
        // Membuat array objek Mahasiswa
        Mahasiswa[] daftarMhs = new Mahasiswa[jumlahMahasiswa];

        System.out.println("=== PROGRAM DATA MAHASISWA ===");
        
        // Loop untuk penginputan data secara berulang
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1));
            
            // Instansiasi object baru
            daftarMhs[i] = new Mahasiswa();
            
            System.out.print("Nama  : ");
            daftarMhs[i].nama = input.nextLine();
            
            System.out.print("NIM   : ");
            daftarMhs[i].NIM = input.nextLine();
            
            System.out.print("Nilai : ");
            // Konversi tipe data String ke double dari Scanner
            daftarMhs[i].nilai = Double.parseDouble(input.nextLine());
        }

        System.out.println("\n===================================");
        System.out.println("      HASIL REKAPITULASI DATA      ");
        System.out.println("===================================\n");

        // Loop untuk menampilkan data dan hasil kelulusan masing-masing objek
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa " + (i + 1) + ":");
            daftarMhs[i].tampilkanData();
            daftarMhs[i].cekKelulusan();
        }
        
        input.close();
    }
}
