# Loop Programs Collection

<div align="center">

![Java Version](https://img.shields.io/badge/java-8%2B-orange)
![Lisensi](https://img.shields.io/badge/lisensi-MIT-green)
![Jumlah Program](https://img.shields.io/badge/program-6-blue)

**Koleksi lengkap program Java untuk pembelajaran perulangan (loops) dan algoritma dasar**

[Program](#-program) • [Perbandingan](#-perbandingan) • [Penggunaan](#-penggunaan)

</div>

## 📋 Daftar Isi

- [Gambaran Umum](#-gambaran-umum)
- [Program](#-program)
- [Perbandingan](#-perbandingan)
- [Penggunaan](#-penggunaan)
- [Nilai Edukasional](#-nilai-edukasional)

## 🚀 Gambaran Umum

Koleksi ini terdiri dari 6 program Java yang mendemonstrasikan berbagai jenis perulangan (for, while, do-while) untuk menyelesaikan dua masalah umum: menampilkan bilangan ganjil-genap dan mendeteksi bilangan prima.

### ✨ Highlight Koleksi

- 🔄 **3 Jenis Loop** - Implementasi for, while, do-while
- 🎯 **2 Jenis Masalah** - Bilangan ganjil-genap & deteksi prima
- ⚡ **Algoritma Teroptimasi** - Optimasi matematis
- 📚 **Fokus Edukasional** - Kode berorientasi pembelajaran

## 📊 Perbandingan

### Perbandingan Jenis Loop

| Jenis Loop | Sintaks | Kasus Penggunaan | Eksekusi | Terbaik Untuk |
|------------|---------|------------------|----------|---------------|
| **For** | `for(init;kondisi;inc)` | Berbasis counter | 0+ kali | Iterasi diketahui |
| **While** | `while(kondisi)` | Berbasis kondisi | 0+ kali | Kondisi dinamis |
| **Do-While** | `do{}while(kondisi)` | Eksekusi terjamin | 1+ kali | Harus jalan sekali |

---

### Perbandingan Performa

| Program | Kompleksitas Waktu | Kompleksitas Ruang | Efisiensi |
|---------|-------------------|-------------------|-----------|
| Ganjil-Genap For | O(n) | O(1) | ⭐⭐⭐⭐⭐ |
| Ganjil-Genap While | O(n) | O(1) | ⭐⭐⭐⭐⭐ |
| Ganjil-Genap Do-While | O(n) | O(1) | ⭐⭐⭐⭐⭐ |
| Prima For | O(n√n) | O(1) | ⭐⭐⭐⭐ |
| Prima While | O(n√n) | O(1) | ⭐⭐⭐⭐ |
| Prima Do-While | O(n√n) | O(1) | ⭐⭐⭐⭐ |

---

### Perbandingan Keterbacaan Kode

| Program | Keterbacaan | Kemampuan Perawatan | Kurva Belajar |
|---------|-------------|---------------------|---------------|
| For Loops | ⭐⭐⭐⭐⭐ | ⭐⭐⭐⭐⭐ | ⭐⭐ |
| While Loops | ⭐⭐⭐⭐ | ⭐⭐⭐⭐ | ⭐⭐⭐ |
| Do-While | ⭐⭐⭐ | ⭐⭐⭐ | ⭐⭐⭐⭐ |

---

## 🎮 Penggunaan

### Mulai Cepat
```bash
# Kompilasi semua program
javac *.java

# Jalankan program spesifik
java For_Bilangan_Ganjil_Genap_1_Sampai_1000.GanjilGenapFor
java While_Bilangan_Ganjil_Genap_1_Sampai_1000.GanjilGenapWhile
java Do_while_Bilangan_Ganjil_Genap_1_Sampai_1000.GanjilGenapDoWhile
java For_Bilangan_Prima_Antara_1_Sampai_1000.PrimaFor
java While_Bilangan_Prima_Antara_1_Sampai_1000.PrimaWhile
java While_Bilangan_Prima_Antara_1_Sampai_1000.PrimaDoWhile
```

### Eksekusi Batch
Buat shell script `run_all.sh`:
```bash
#!/bin/bash
echo "Menjalankan semua program Java loop..."
java For_Bilangan_Ganjil_Genap_1_Sampai_1000.GanjilGenapFor
echo "---"
java While_Bilangan_Ganjil_Genap_1_Sampai_1000.GanjilGenapWhile
echo "---"
java Do_while_Bilangan_Ganjil_Genap_1_Sampai_1000.GanjilGenapDoWhile
echo "---"
java For_Bilangan_Prima_Antara_1_Sampai_1000.PrimaFor
echo "---"
java While_Bilangan_Prima_Antara_1_Sampai_1000.PrimaWhile
echo "---"
java While_Bilangan_Prima_Antara_1_Sampai_1000.PrimaDoWhile
echo "Semua program selesai dijalankan!"
```

## 💡 Nilai Edukasional

### Konsep Inti yang Dicakup

1. **Fundamental Loop**
   - Konsep iterasi
   - Struktur kontrol loop
   - Statement break dan continue

2. **Pemikiran Algoritma**
   - Dekomposisi masalah
   - Pertimbangan efisiensi
   - Teknik optimasi

3. **Aplikasi Matematis**
   - Dasar teori bilangan
   - Sifat bilangan prima
   - Optimasi matematis

---

<div align="center">

### ⭐ Tunjukkan Dukunganmu
Jika koleksi ini membantumu, beri bintang!

*"Mastering loops is the first step to mastering programming"*

</div>