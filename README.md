# 🚀 Katalon Studio Automation: DemoQA Student Registration Form

Proyek ini adalah framework pengujian otomatis (Automation Testing) menggunakan **Katalon Studio** untuk melakukan pengujian fungsional pada form registrasi siswa di website [DemoQA](https://demoqa.com/automation-practice-form).

## 📌 Fitur Utama
- **Data-Driven Testing (DDT)**: Mendukung pengujian masal menggunakan file eksternal (Excel/CSV) hingga 29+ baris data.
- **Handling Skenario Positif & Negatif**: Logika pengujian pintar untuk memvalidasi kapan modal sukses muncul dan kapan tidak.
- **Anti-Adblock & Anti-Intercept**: Menggunakan *JavaScript Click* untuk menembus iklan Google yang sering menghalangi elemen.
- **Auto Translation**: Fitur penerjemah nama bulan otomatis (Indonesia -> Inggris) untuk akurasi Datepicker.
- **Dynamic Objects**: Penanganan dropdown (State & City) secara dinamis menggunakan Test Object runtime.

## 🛠️ Teknologi yang Digunakan
- **Katalon Studio** (Version 9.x / 10.x)
- **Groovy Language**
- **Selenium WebDriver**
- **Apache POI** (untuk pengolahan Data Excel)

## 📂 Struktur Folder
- `Test Cases/TC_StudentForm`: Script pengujian utama.
- `Object Repository/`: Koleksi elemen web yang digunakan.
- `Data Files/`: File Excel/CSV sumber data pengujian.
- `Files/`: Folder penyimpanan gambar/file untuk fitur Upload Picture.
- `Reports/`: Hasil eksekusi dalam format PDF, XML, dan HTML.

## 🚀 Cara Menjalankan
1. Clone repository ini ke lokal kamu.
2. Buka project menggunakan Katalon Studio.
3. Pastikan file data di folder `Data Files` sudah terhubung dengan benar di Test Suite.
4. Klik **Run** pada **Test Suite** menggunakan browser Chrome.

## 📊 Hasil Pengujian (Reports)
Pengujian ini menghasilkan laporan otomatis yang mencakup:
- Status Pass/Fail per baris data.
- Screenshot otomatis saat terjadi kegagalan (failure).
- Laporan PDF yang siap digunakan untuk dokumentasi QA.

---
Created by Ainul idham
