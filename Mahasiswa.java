public class Mahasiswa {
    // Variabel & Tipe Data
    String nama;
    String NIM;
    double nilai;

    // Method untuk menampilkan data mahasiswa
    void tampilkanData() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + NIM);
        System.out.println("Nilai : " + nilai);
    }

    // Method untuk mengecek kelulusan menggunakan if / else
    void cekKelulusan() {
        if (nilai >= 60) {
            System.out.println("Status: Lulus");
        } else {
            System.out.println("Status: Tidak Lulus");
        }
        System.out.println("-----------------------------------");
    }
}
