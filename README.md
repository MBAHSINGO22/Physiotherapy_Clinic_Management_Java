# 🏥 Physiotherapy Clinic Management Java

## 📖 Deskripsi Proyek
Proyek pembelajaran Java yang mendemonstrasikan penggunaan **pewarisan (inheritance)** dan **komposisi (composition)** untuk mengelola data klinik fisioterapi. Program ini mengelola pasien, terapis, administrasi, jasa terapi, dan perhitungan biaya perawatan pada aplikasi konsol sederhana.

Fitur utama:
- Pengelolaan data pasien (ID & nama)
- Pengelolaan karyawan (Terapis & Administrasi) menggunakan pewarisan
- Komposisi antara Perawatan, Pasien, Administrasi, dan daftar jasaTerapi
- Perhitungan total biaya perawatan berdasarkan jasa terapi yang dipilih
- Input via konsol (Scanner) dan penyimpanan list terapi (ArrayList)

---

## 📂 Struktur File
```
Physiotherapy_Clinic_Management_Java/
├── src/
├── KelolaFisioterapi.java   # Kelas utama (main)
├── Karyawan.java            # Kelas abstrak induk untuk karyawan
├── Terapis.java             # Kelas turunan untuk terapis
├── Administrasi.java        # Kelas turunan untuk administrasi
├── Pasien.java              # Kelas untuk data pasien
├── jasaTerapi.java          # Kelas untuk jasa terapi (jenis, tarif, terapis)
├── Perawatan.java           # Kelas yang mengelola perawatan (komposisi)
```

---

## 🟢 Catatan Implementasi
- Data jasa terapi diinisialisasi secara statis (contoh): Saraf: Rp300.000, Ortopedi: Rp200.000, Geriatri: Rp75.000.
- Perawatan menyimpan referensi ke objek Pasien, Administrasi, dan daftar jasaTerapi (komposisi).
- Terapis dan Administrasi mewarisi kelas abstrak Karyawan.
- Total biaya dihitung dengan menjumlahkan tarif semua jasa yang dipilih dalam objek Perawatan.
- Gunakan `Scanner` untuk input pengguna dan `ArrayList` untuk menyimpan daftar jasaTerapi.

---

## 📈 Contoh Output
```
Masukkan ID Pasien: 001
Masukkan Nama Pasien: John Doe
Masukkan NIK Terapis 1: T001
Masukkan Nama Terapis 1: Dr. Anna
Masukkan Sertifikat Terapis 1: Fisioterapi Saraf
Masukkan NIK Terapis 2: T002
Masukkan Nama Terapis 2: Dr. Bob
Masukkan Sertifikat Terapis 2: Fisioterapi Ortopedi
Masukkan NIK Administrasi: A001
Masukkan Nama Administrasi: Clara
Masukkan Sertifikat Komputer: Microsoft Office
Masukkan ID Perawatan: P001

Klinik Fisioterapi "Eugenius Kriswinar Adi Cahya & 235314099"
idPerawatan: P001
Pelanggan: Bp/Ibu/Sdr John Doe - No.Member: 001
Kasir: Clara
[Biaya Perawatan Fisioterapi]
Saraf: Rp 300000.0 Terapis: Dr. Anna
Ortopedi: Rp 200000.0 Terapis: Dr. Bob
Geriatri: Rp 75000.0 Terapis: Dr. Bob
----------------------------------------
Total Biaya: Rp 575000.0
```

---

## 👨‍💻 Pengembang
**MBAHSINGO22**  
GitHub: https://github.com/MBAHSINGO22
