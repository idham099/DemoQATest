# 🚀 Katalon Studio Automation: DemoQA Student Registration Form

Proyek ini adalah framework pengujian otomatis (Automation Testing) menggunakan **Katalon Studio** untuk melakukan pengujian fungsional pada form registrasi siswa di website [DemoQA](https://demoqa.com/automation-practice-form).

<img width="1919" height="1072" alt="api0" src="https://github.com/user-attachments/assets/63bfc752-864c-4ca0-9576-dd34541dd793" />

<img width="1919" height="1079" alt="api1" src="https://github.com/user-attachments/assets/6cc5b6e1-7de4-4a09-b9bb-eac384c1dd73" />

<img width="1919" height="1079" alt="Api2" src="https://github.com/user-attachments/assets/e57df6b7-2646-4f3a-9b9e-48c0cb606d9a" />

<img width="1919" height="1079" alt="Api3" src="https://github.com/user-attachments/assets/7379e334-a05c-4f4d-946f-b1c66e6af668" />

## 📌 Fitur Utama
- **Data-Driven Testing (DDT)**: Mendukung pengujian masal menggunakan file eksternal (Excel/CSV) hingga 29+ baris data.
- **Handling Skenario Positif & Negatif**: Logika pengujian pintar untuk memvalidasi kapan modal sukses muncul dan kapan tidak.
- **Anti-Adblock & Anti-Intercept**: Menggunakan *JavaScript Click* untuk menembus iklan Google yang sering menghalangi elemen.
- **Auto Translation**: Fitur penerjemah nama bulan otomatis (Indonesia -> Inggris) untuk akurasi Datepicker.
- **Dynamic Objects**: Penanganan dropdown (State & City) secara dinamis menggunakan Test Object runtime.

## 🛠️ Teknologi yang Digunakan
- **Katalon Studio** (Version 10)
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
