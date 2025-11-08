# Bilangan Prima dengan While Loop

<div align="center">

![Java Version](https://img.shields.io/badge/java-8%2B-orange)
![Lisensi](https://img.shields.io/badge/lisensi-MIT-green)
![Algoritma](https://img.shields.io/badge/algoritma-prime--detection-brightgreen)

**Program Java untuk menampilkan bilangan prima 1-1000 menggunakan nested while loops dengan pendekatan kondisional**

[Pendekatan](#-pendekatan) • [Implementasi](#-implementasi) • [Analisis](#-analisis) • [Perbandingan](#-perbandingan)

</div>

## 📋 Daftar Isi

- [Gambaran Umum](#-gambaran-umum)
- [Pendekatan](#-pendekatan)
- [Implementasi](#-implementasi)
- [Struktur Program](#-struktur-program)
- [Analisis](#-analisis)
- [Perbandingan](#-perbandingan)
- [Kelebihan](#-kelebihan)
- [Penggunaan](#-penggunaan)

## 🚀 Gambaran Umum

Program ini mengidentifikasi bilangan prima dalam rentang 2-1000 menggunakan nested while loops. Pendekatan while loop memberikan kontrol lebih granular atas proses iterasi dan kondisi pemeriksaan.

### ✨ Highlights

- 🔄 **Loop While Bersarang** - Nested while loops untuk pengecekan prima
- 🧮 **Optimasi Matematis** - Menggunakan √n untuk efisiensi
- 🎯 **Kontrol Manual** - Kontrol penuh atas iterasi
- ⚡ **Penghentian Dini** - Berhenti ketika pembagi ditemukan

## 🔄 Pendekatan

### Strategi Pengecekan Bilangan Prima

1. **Loop Luar**: Iterasi melalui angka 2-1000
2. **Loop Dalam**: Cek keterbagian dari 2 sampai √angka_sekarang
3. **Sistem Flag**: Boolean flag untuk menandai status prima
4. **Break Dini**: Hentikan pemeriksaan ketika pembagi ditemukan

### Karakteristik While Loop
- **Kondisi Pertama**: Cek kondisi sebelum eksekusi
- **Increment Manual**: Kontrol eksplisit atas counter
- **Kondisi Fleksibel**: Dukungan untuk logika kompleks

## 🏗️ Struktur Program

### Alur Program
```
graph TD
    A[Mulai] --> B[Inisialisasi i = 2]
    B --> C{i <= 1000?}
    C -- Tidak --> Z[Selesai]
    C -- Ya --> D[Set isPrima = true]
    D --> E[Inisialisasi j = 2]
    E --> F{j <= √i?}
    F -- Tidak --> G{isPrima == true?}
    F -- Ya --> H[i % j == 0?]
    H -- Tidak --> I[Increment j++]
    I --> F
    H -- Ya --> J[Set isPrima = false]
    J --> K[Break loop]
    K --> G
    G -- Ya --> L[Cetak i]
    G -- Tidak --> M[Increment i++]
    L --> M
    M --> C
```

## 📊 Analisis

### Metrik Performa

| Operasi | Jumlah | Keterangan |
|---------|--------|------------|
| Iterasi Luar | 999 | 2-1000 |
| Iterasi Dalam | ~7,000 total | Dioptimasi dengan √n |
| Pembagian | ~7,000 | Pengecekan aktual yang dilakukan |
| Prima Ditemukan | 168 | Jumlah prima yang diketahui |

### Penggunaan Memori
- **Variabel**: 3 variabel primitif
- **Stack**: Minimal pemanggilan method
- **Heap**: Tidak ada alokasi objek

### Kompleksitas
- **Waktu**: O(n√n) - sama dengan pendekatan for loop
- **Ruang**: O(1) - penggunaan memori konstan
- **Efisiensi**: 98.6% lebih baik daripada pendekatan naif

## 🎮 Penggunaan

### Kompilasi
```bash
javac PrimaWhile.java
```

### Eksekusi
```bash
java While_Bilangan_Prima_Antara_1_Sampai_1000.PrimaWhile
```

### Output yang Diharapkan
```
Bilangan prima antara 1-1000 : 
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 ...
... 977 983 991 997
```

## 🔄 Perbandingan

### While vs For untuk Deteksi Prima

| Aspek | While Loop | For Loop |
|-------|------------|----------|
| **Inisialisasi** | Baris terpisah | Dalam statement loop |
| **Kondisi** | Eksplisit dalam while | Dalam statement for |
| **Increment** | Manual (i++, j++) | Otomatis dalam for |
| **Fleksibilitas** | Tinggi | Sedang |
| **Keterbacaan** | Sedang | Tinggi |

### Rekomendasi Kasus Penggunaan
- **While**: Ketika kondisi kompleks atau dinamis
- **For**: Ketika jumlah iterasi diketahui atau sederhana

### Keuntungan While Loop
- **Kontrol granular** atas proses iterasi
- **Kemampuan adaptasi** untuk kondisi runtime
- **Fleksibilitas** dalam mengubah logika iterasi

## 💪 Kelebihan

### ✅ Manfaat Kontrol
- **Kontrol Eksplisit** - Increment/decrement manual
- **Kondisi Kompleks** - Dukungan untuk logika kompleks
- **Rentang Dinamis** - Rentang iterasi yang dapat beradaptasi

### ✅ Nilai Edukasional
- **Fundamental Loop** - Pemahaman mendalam tentang loop
- **Penguasaan Kondisi** - Penanganan kondisi kompleks
- **Pemikiran Algoritma** - Pemahaman proses langkah-demi-langkah

### ✅ Aplikasi Praktis
- **Pemrosesan Data** - Iterasi data kompleks
- **Pengembangan Game** - Loop state game
- **Monitoring Sistem** - Pengecekan berkelanjutan
- **Antarmuka Pengguna** - Event handling

---

<div align="center">

## 🎯 Kesimpulan

**While loops memberikan kontrol granular yang sempurna untuk iterasi kompleks!**

</div>