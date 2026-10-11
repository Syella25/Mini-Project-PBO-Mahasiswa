# Mini-Project-PBO-Mahasiswa
Tugas Mini Project PBO: Program Data Mahasiswa  

Repository ini berisi implementasi program pengelolaan data dan penentuan status kelulusan mahasiswa berbasis Java. Proyek ini dibuat untuk memenuhi Tugas Praktikum **Pemrograman Berorientasi Objek (PBO)**.

## 👤 Identitas Pembuat
- **Nama**  : Syella Zikra Arifa
- **NPM**   : 250810701100014
- **Prodi** : Informatika
- **Universitas**: Universitas Syiah Kuala

## 📌 Deskripsi Program
Program ini merupakan aplikasi *console* sederhana berbasis **Java** yang berfungsi untuk menginput, memproses, serta merekapitulasi data mahasiswa. Program menerima input atribut seperti **Nama**, **NIM**, dan **Nilai**, kemudian secara otomatis menentukan status kelulusan berdasarkan kriteria nilai minimal yang telah ditentukan.

## 🛠️ Komponen PBO & Control Flow yang Diterapkan
Seluruh komponen yang menjadi standar penilaian tugas telah diimplementasikan dalam program ini:

1. **Variable**: Variabel penampung data mahasiswa (`nama`, `NIM`, `nilai`).
2. **Data Type**: Penggunaan tipe data `String`, `double`, dan `int`.
3. **Scanner**: Pengambilan input data secara interaktif dari pengguna (*console*).
4. **If / Else**: Evaluasi kelulusan pada method `cekKelulusan()` (Lulus jika Nilai $\ge$ 60).
5. **Loop**: Perulangan `for` untuk iterasi input data dan penampilan hasil rekapitulasi.
6. **Class**:
   - `Mahasiswa`: Cetak biru (*blueprint*) objek yang memuat atribut dan method.
   - `Main`: Class utama untuk mengeksekusi alur program.
7. **Object**: Pembuatan dan pengelolaan minimal 3 objek `Mahasiswa`.
8. **Method**:
   - `tampilkanData()`: Menampilkan rincian informasi mahasiswa.
   - `cekKelulusan()`: Menilai dan menampilkan status kelulusan.

## 📂 Struktur File
```text
.
├── Mahasiswa.java   # Class blueprint atribut dan method
├── Main.java        # Class utama (Scanner, Loop, & Instansiasi Object)
└── README.md        # Dokumentasi resmi repositori
